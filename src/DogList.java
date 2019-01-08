import java.util.ArrayList;

public class DogList {
    static ArrayList<Dog> dogList = new ArrayList<>();

    static void addDogList(Dog dog) {
        dogList.add(dog);
    }

    static ArrayList<Dog> getDogList() {
        return dogList;
    }
}
