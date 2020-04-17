package guru.springframework.sfgpetclinic.controllers;

import guru.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {
    private GreetingService greetingService;

    public String sayHello(){
        return  greetingService.sayHello();
    }

    @Autowired
    @Qualifier("setterGreetingService")
    public void setGreetingService(GreetingService setterGreetingService) {
        this.greetingService = setterGreetingService;
    }
}
