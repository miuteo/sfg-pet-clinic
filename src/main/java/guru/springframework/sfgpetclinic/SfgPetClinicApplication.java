package guru.springframework.sfgpetclinic;

import guru.springframework.sfgpetclinic.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SfgPetClinicApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SfgPetClinicApplication.class, args);
        MyController myController = (MyController)context.getBean("myController");
        myController.foo();
    }

}
