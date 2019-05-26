package guru.services;

import guru.springframework.repositories.GreetingRepository;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("es")
@Primary
public class PrimarySpanishGreetingServiceImpl implements GreetingService {

    private GreetingRepository spanishGreetingRepositoryImpl;

    public PrimarySpanishGreetingServiceImpl(GreetingRepository spanishGreetingRepositoryImpl) {
        this.spanishGreetingRepositoryImpl = spanishGreetingRepositoryImpl;
    }

    @Override
    public String sayGreeting() {
        return spanishGreetingRepositoryImpl.getGreeting();
    }
}
