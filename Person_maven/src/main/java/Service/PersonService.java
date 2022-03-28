package Service;

import java.util.List;
import java.util.Random;

public class PersonService implements IPersonService {
    List<String> surname = List.of("Ivanov", "Petrov", "Black", "Pepper", "Lopez", "Weber", "Smith", "Taylor", "Clark", "Hall");
    List<String> name = List.of("Nick", "Ann", "Andrew", "Elizabet", "Ron", "Pasha", "Egor", "Alexander", "Elena", "Vladimir");

    @Override
    public String randomizerName() {
        return name.get(new Random().nextInt(name.size()));
    }

    @Override
    public String randomizerSurname() {
        return surname.get(new Random().nextInt(surname.size()));
    }

    @Override
    public int randomizerAge() {
        return (int) (Math.random() * (32 - 15) + 15);
    }
}
