package guru.springframework.repositories;

import org.springframework.stereotype.Repository;

@Repository
public class GreetingRepositoryImpl implements GreetingRepository {
    @Override
    public String getEnglishGreeting() {
        return "XXX---> English - Primary Greeting Service";
    }

    @Override
    public String getSpanishGreeting() {
        return "XXX---> Spanish - Servicio de Saludo Primario";
    }

    @Override
    public String getGermanGreeting() {
        return "XXX---> German - Primärer Grußdienst";
    }
}
