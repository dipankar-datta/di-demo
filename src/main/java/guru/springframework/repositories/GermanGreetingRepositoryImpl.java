package guru.springframework.repositories;

import org.springframework.stereotype.Repository;

@Repository
public class GermanGreetingRepositoryImpl implements GreetingRepository {

    @Override
    public String getGreeting() {
        return "XXX---> Halo German GermanGreetingRepositoryImpl";
    }

}
