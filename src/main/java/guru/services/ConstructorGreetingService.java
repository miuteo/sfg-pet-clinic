package guru.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements GreetingService{
    public final static String GREETING = "constructor";
    @Override
    public String sayHello() {
        return GREETING;
    }
}
