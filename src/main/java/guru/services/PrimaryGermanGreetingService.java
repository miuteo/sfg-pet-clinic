package guru.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

//@Primary
//@Profile("de")
//@Service
public class PrimaryGermanGreetingService implements GreetingService{
    public final static String GREETING = "primaryGerman";
    @Override
    public String sayHello() {
        return GREETING;
    }
}