package guru.springframework.services;

import guru.springframework.repositories.GreetingRepository;

public class GreetingServiceFactory {

    private GreetingRepository greetingRepository;

    public GreetingServiceFactory(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    public GreetingService createGreetingService(String lang) {
        switch (lang) {
            case "en" : return new PrimaryGreetingService(greetingRepository);
            case "de" : return new PrimaryGermanGreetingServiceImpl(greetingRepository);
            case "es" : return new PrimarySpanishGreetingServiceImpl(greetingRepository);
            default   : return new PrimaryGreetingService(greetingRepository);
        }
    }
}
