package guru.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    public String foo(){
        System.out.println("Hello!");
        return "foo";
    }
}
