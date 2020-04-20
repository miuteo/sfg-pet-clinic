package guru.springframework.sfgpetclinic.controllers;

import guru.examplebeans.FakeDataSource;
import guru.springframework.sfgpetclinic.SfgPetClinicApplication;
import guru.services.PrimarySpanishGreetingService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

import static org.junit.Assert.assertEquals;

public class DiTestEs {
    private MyController myController;
    private FakeDataSource fakeDataSource;
    @Before
    public void setUp(){
        SpringApplication springApplication=new SpringApplication(SfgPetClinicApplication.class);
        String[] profiles= new String[]{"es"}; // array of profiles, create array of one profile in case single profile
        springApplication.setAdditionalProfiles("es"); // set active profile, We can write condition here based on requirements
        ConfigurableApplicationContext context = springApplication.run();  // run spring boot application
        myController = (MyController)context.getBean("myController");
        fakeDataSource = context.getBean(FakeDataSource.class);
    }

    @Test
    public void test(){
        assertEquals(PrimarySpanishGreetingService.GREETING,myController.foo());
    }

    @Test
    public void testFakeDataSourceProfile(){
        assertEquals("teopasswordspanish",fakeDataSource.getPassword());
    }
}
