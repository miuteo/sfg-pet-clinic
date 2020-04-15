package guru.springframework.sfgpetclinic.controllers;

import guru.springframework.sfgpetclinic.SfgPetClinicApplication;
import guru.springframework.sfgpetclinic.services.GreetingService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;

//@SpringBootTest
public class DITest {
    private ConstructorInjectedController constructorInjectedController;
    private PropertyInjectedController propertyInjectedController;
    private SetterInjectedController setterInjectedController;

    @Before
    public void setup(){
        ApplicationContext context = SpringApplication.run(SfgPetClinicApplication.class);
        this.constructorInjectedController = (ConstructorInjectedController)context.getBean("constructorInjectedController");
        this.propertyInjectedController = (PropertyInjectedController)context.getBean("propertyInjectedController");
        this.setterInjectedController = (SetterInjectedController)context.getBean("setterInjectedController");

    }
    @Test
    public void testControllers(){
        assertNotNull(constructorInjectedController);
        assertNotNull(propertyInjectedController);
        assertNotNull(setterInjectedController);
    }

    @Test
    public void testDI(){
        assertEquals(constructorInjectedController.sayHello(), GreetingService.GREETING);
        assertEquals(propertyInjectedController.sayHello(), GreetingService.GREETING);
        assertEquals(setterInjectedController.sayHello(), GreetingService.GREETING);
    }

}
