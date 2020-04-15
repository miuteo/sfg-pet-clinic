package guru.springframework.sfgpetclinic.services;

public class GreetingServiceImpl implements GreetingService{
    @Override
    public String sayHello() {
        return GREETING;
    }
}
