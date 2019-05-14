package guru.springframework.repositories;

import org.springframework.stereotype.Repository;

@Repository
public class EnglishGreetingRepositoryImpl implements GreetingRepository {

    @Override
    public String getGreeting() {
        return "XXX---> Hello English EnglishGreetingRepositoryImpl";
    }

}
