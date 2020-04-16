package guru.springframework.sfgpetclinic.services;


import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile({"default","en"})
public class PrimaryGreetingService implements GreetingService{
    public final static String GREETING = "primary";
    @Override
    public String sayHello() {
        return GREETING;
    }
}
