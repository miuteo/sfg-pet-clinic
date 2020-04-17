package guru.services;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingService implements GreetingService{
    public final static String GREETING = "setter";
    @Override
    public String sayHello() {
        return GREETING;
    }
}
