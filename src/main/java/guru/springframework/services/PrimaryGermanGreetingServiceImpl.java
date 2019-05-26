package guru.springframework.services;

import guru.springframework.repositories.GreetingRepository;

public class PrimaryGermanGreetingServiceImpl implements GreetingService {

    private GreetingRepository germanGreetingRepositoryImpl;

    public PrimaryGermanGreetingServiceImpl(GreetingRepository germanGreetingRepositoryImpl) {
        this.germanGreetingRepositoryImpl = germanGreetingRepositoryImpl;
    }

    @Override
    public String sayGreeting() {
        return germanGreetingRepositoryImpl.getGermanGreeting();
    }
}
