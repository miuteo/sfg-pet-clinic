package guru.springframework.sfgpetclinic.services;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingService implements GreetingService{
    @Override
    public String sayHello() {
        return GREETING;
    }
}
