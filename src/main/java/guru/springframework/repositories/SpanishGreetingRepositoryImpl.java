package guru.springframework.repositories;

import org.springframework.stereotype.Repository;

@Repository
public class SpanishGreetingRepositoryImpl implements GreetingRepository {

    @Override
    public String getGreeting() {
        return "XXX---> Ola Spanish SpanishGreetingRepositoryImpl";
    }

}
