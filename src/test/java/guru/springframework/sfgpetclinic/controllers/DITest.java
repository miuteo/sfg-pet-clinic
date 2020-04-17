package guru.springframework.sfgpetclinic.controllers;

import guru.services.ConstructorGreetingService;
import guru.services.GreetingServiceImpl;
import guru.services.PrimaryGreetingService;
import guru.services.SetterGreetingService;
import guru.springframework.sfgpetclinic.SfgPetClinicApplication;
import org.junit.Before;
import org.junit.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;

//@SpringBootTest
public class DITest {
    private ConstructorInjectedController constructorInjectedController;
    private PropertyInjectedController propertyInjectedController;
    private SetterInjectedController setterInjectedController;
    private MyController myController;

    @Before
    public void setup(){
        ApplicationContext context = SpringApplication.run(SfgPetClinicApplication.class);
        this.constructorInjectedController = (ConstructorInjectedController)context.getBean("constructorInjectedController");
        this.propertyInjectedController = (PropertyInjectedController)context.getBean("propertyInjectedController");
        this.setterInjectedController = (SetterInjectedController)context.getBean("setterInjectedController");
        this.myController = (MyController)context.getBean("myController");

    }
    @Test
    public void testControllers(){
        assertNotNull(constructorInjectedController);
        assertNotNull(propertyInjectedController);
        assertNotNull(setterInjectedController);
    }

    @Test
    public void testDI(){
        assertEquals( ConstructorGreetingService.GREETING,constructorInjectedController.sayHello());
        assertEquals(GreetingServiceImpl.GREETING, propertyInjectedController.sayHello() );
        assertEquals(SetterGreetingService.GREETING,setterInjectedController.sayHello());
        assertEquals(PrimaryGreetingService.GREETING,myController.foo());
    }

}
