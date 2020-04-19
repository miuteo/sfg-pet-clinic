package guru.services;

import org.springframework.stereotype.Service;


public class GreetingServiceFactory {
    private GreetingRepository greetingRepository;

    public GreetingServiceFactory(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    public GreetingService createCreatingService(String lang){
        switch (lang){
            case "es":
                return new PrimarySpanishGreetingService();
            case "de":
                return new PrimaryGermanGreetingService();
            case "en":
            default:
                return new PrimaryGreetingService();


        }
    }
}
