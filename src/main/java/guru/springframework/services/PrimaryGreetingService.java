package guru.springframework.services;

import guru.springframework.repositories.GreetingRepository;

public class PrimaryGreetingService implements GreetingService {

    private GreetingRepository englishGreetingRepositoryImpl;

    public PrimaryGreetingService(GreetingRepository englishGreetingRepositoryImpl) {
        this.englishGreetingRepositoryImpl = englishGreetingRepositoryImpl;
    }

    @Override
    public String sayGreeting() {
        return englishGreetingRepositoryImpl.getEnglishGreeting();
    }
}
