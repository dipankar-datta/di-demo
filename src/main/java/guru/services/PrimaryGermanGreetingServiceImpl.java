package guru.services;

import guru.springframework.repositories.GreetingRepository;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("de")
@Primary
public class PrimaryGermanGreetingServiceImpl implements GreetingService {

    private GreetingRepository germanGreetingRepositoryImpl;

    public PrimaryGermanGreetingServiceImpl(GreetingRepository germanGreetingRepositoryImpl) {
        this.germanGreetingRepositoryImpl = germanGreetingRepositoryImpl;
    }

    @Override
    public String sayGreeting() {
        return germanGreetingRepositoryImpl.getGreeting();
    }
}
