package guru.springframework.services;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "XXX---> From Setter greeting service impl";
    }
}
