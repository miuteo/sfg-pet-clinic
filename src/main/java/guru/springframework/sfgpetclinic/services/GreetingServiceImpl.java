package guru.springframework.sfgpetclinic.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService{
    public final static String GREETING = "HELLO";
    @Override
    public String sayHello() {
        return GREETING;
    }
}
