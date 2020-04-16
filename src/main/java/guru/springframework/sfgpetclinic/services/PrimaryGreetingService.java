package guru.springframework.sfgpetclinic.services;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class PrimaryGreetingService implements GreetingService{
    public final static String GREETING = "primary";
    @Override
    public String sayHello() {
        return GREETING;
    }
}
