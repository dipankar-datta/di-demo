package guru.springframework.services;

import guru.springframework.repositories.GreetingRepository;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile({"en", "default"})
public class PrimaryGreetingService implements GreetingService {

    GreetingRepository englishGreetingRepositoryImpl;

    public PrimaryGreetingService(GreetingRepository englishGreetingRepositoryImpl) {
        this.englishGreetingRepositoryImpl = englishGreetingRepositoryImpl;
    }

    @Override
    public String sayGreeting() {
        return englishGreetingRepositoryImpl.getGreeting();
    }
}
