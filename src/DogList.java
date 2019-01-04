import java.util.ArrayList;

public class DogList {
    public static ArrayList<Dog> dogList = new ArrayList<>();

    public static void addDogList(Dog dog) {
        dogList.add(dog);
    }

    public static ArrayList<Dog> getDogList() {
        return dogList;
    }
}
