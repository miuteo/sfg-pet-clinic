package guru.springframework.sfgpetclinic.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Primary
@Profile("es")
@Service
public class PrimarySpanishGreetingService implements GreetingService{
    public final static String GREETING = "primarySpanish";
    @Override
    public String sayHello() {
        return GREETING;
    }
}
