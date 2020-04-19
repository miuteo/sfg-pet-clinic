package guru.config;

import guru.services.GreetingRepository;
import guru.services.GreetingService;
import guru.services.GreetingServiceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class GreetingServiceConfig {

    @Bean
    GreetingServiceFactory greetingServiceFactory(GreetingRepository greetingRepository){
        return new GreetingServiceFactory(greetingRepository);
    }

    @Bean
    @Primary
    @Profile({"default","en"})
    GreetingService primaryGreetingService(GreetingServiceFactory greetingServiceFactory){
        return greetingServiceFactory.createCreatingService("en");
    }

    @Bean
    @Primary
    @Profile("es")
    GreetingService primaryGreetingSpanishService(GreetingServiceFactory greetingServiceFactory){
        return greetingServiceFactory.createCreatingService("es");
    }

    @Bean
    @Primary
    @Profile("de")
    GreetingService primaryGermanGreetingService(GreetingServiceFactory greetingServiceFactory){
        return greetingServiceFactory.createCreatingService("de");
    }
}
