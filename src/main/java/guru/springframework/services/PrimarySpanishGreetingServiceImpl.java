package guru.springframework.services;

import guru.springframework.repositories.GreetingRepository;

public class PrimarySpanishGreetingServiceImpl implements GreetingService {

    private GreetingRepository spanishGreetingRepositoryImpl;

    public PrimarySpanishGreetingServiceImpl(GreetingRepository spanishGreetingRepositoryImpl) {
        this.spanishGreetingRepositoryImpl = spanishGreetingRepositoryImpl;
    }

    @Override
    public String sayGreeting() {
        return spanishGreetingRepositoryImpl.getSpanishGreeting();
    }
}
