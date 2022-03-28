//Сгенерируйте группу из 100 человек в возрасте от 15 до 30.
//1) выберете объекты, возраст которых меньше 21;
//2) распечатать их на экран;
// 3) сортируем по фамилии, а потом по имени (использовать thenComparing у объекта Comparator);
// 4) убираем дубли (если name, surname, age одинаковые)
// 5) сохраняем в файл, как объект, каждый экземпляр класса Person
//6) читаем из файла
//7) создаем при помощи stream новую коллекцию (List<String>) только из Фамилии и Имени для прочтенных из фалов объектов
//8) выводим на экран

import Beans.Person;
import Service.PersonService;

import java.io.*;
import java.util.*;
import java.util.stream.Stream;

public class Runner {

    public static final int LIMIT_PERSON = 100;
    public static final int AGE_LIMIT = 21;
    public static final String FILE_PERSON = "person";

    public static void main(String[] args) {
        PersonService randomizer = new PersonService();
        List<Person> person = Stream.generate(() -> new Person(randomizer.randomizerName(), randomizer.randomizerSurname(), randomizer.randomizerAge()))
                .limit(LIMIT_PERSON)
                .filter(person1 -> person1.getAge() < AGE_LIMIT)
                .peek(System.out::println)
                .sorted(Comparator.comparing(Person::getSurname).thenComparing(Person::getName)).toList();

        Set<Person> personSet = new HashSet<>(person);
        writeObject(personSet);

        System.out.println("---------");

        List<Person> people = new ArrayList<>();
        readObject(people);

        List<String> str = people.stream()
                .map(person1 -> person1.getName() + " " + person1.getSurname())
                .peek(System.out::println).toList();


    }

    private static void readObject(Collection<Person> people) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_PERSON))) {
            people.addAll((Collection<? extends Person>) ois.readObject());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


    private static void writeObject(Collection<Person> personSet) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_PERSON))) {
            oos.writeObject(personSet);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}

