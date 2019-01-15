import java.util.ArrayList;

class Playgroup {

    /*
     *  Initialize ArrayLists for each group to store dogs in.
     */

    private static ArrayList<Dog> groupA = new ArrayList<>();
    private static ArrayList<Dog> groupB = new ArrayList<>();
    private static ArrayList<Dog> groupC = new ArrayList<>();
    private static ArrayList<Dog> groupN = new ArrayList<>();
    private static ArrayList<Dog> groupSmalls = new ArrayList<>();
    private static ArrayList<Dog> groupSolo = new ArrayList<>();

    /*
     *  Methods to retrieve Dog names in Playgroups
     */

    static void getGroupA() {
        for (Dog tempDog : groupA) {
            System.out.println(tempDog.getDogName());
        }
    }

    static void getGroupB() {
        for (Dog tempDog : groupB) {
            System.out.println(tempDog.getDogName());
        }
    }

    static void getGroupC() {
        for (Dog tempDog : groupC) {
            System.out.println(tempDog.getDogName());
        }
    }

    static void getGroupN() {
        for (Dog tempDog : groupN) {
            System.out.println(tempDog.getDogName());
        }
    }

    static void getGroupSmalls() {
        for (Dog tempDog : groupSmalls) {
            System.out.println(tempDog.getDogName());
        }
    }

    static void getGroupSolo() {
        for (Dog tempDog : groupSolo) {
            System.out.println(tempDog.getDogName());
        }
    }



    /*
     *  Methods to add new Dog objects to Playgroup ArrayLists
     */
    static void setGroups(Dog dog) {
        if (dog.getGroup().get(0)) {
            setGroupA(dog);
        }

        if (dog.getGroup().get(1)) {
            setGroupB(dog);
        }

        if (dog.getGroup().get(2)) {
            setGroupC(dog);
        }

        if (dog.getGroup().get(3)) {
            setGroupN(dog);
        }

        if (dog.getGroup().get(4)) {
            setGroupSmalls(dog);
        }

        if (dog.getGroup().get(5)) {
            setGroupSolo(dog);
        }

        System.out.println("Groups set for: " + dog.getDogName());
    }

    private static void setGroupA(Dog dog) {
            groupA.add(dog);
    }

    private static void setGroupB(Dog dog) {
            groupB.add(dog);
    }

    private static void setGroupC(Dog dog) {
            groupC.add(dog);
    }

    private static void setGroupN(Dog dog) {
            groupN.add(dog);
    }

    private static void setGroupSmalls(Dog dog) {
            groupSmalls.add(dog);
    }

    private static void setGroupSolo(Dog dog) {
            groupSolo.add(dog);

    }
}
