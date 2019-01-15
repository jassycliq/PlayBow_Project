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

    public static void getGroupA() {
        for (Dog tempDog : groupA) {
            System.out.println(tempDog.getDogName());
        }
    }

    public static void getGroupB() {
        for (Dog tempDog : groupB) {
            System.out.println(tempDog.getDogName());
        }
    }

    public static void getGroupC() {
        for (Dog tempDog : groupC) {
            System.out.println(tempDog.getDogName());
        }
    }

    public static void getGroupN() {
        for (Dog tempDog : groupN) {
            System.out.println(tempDog.getDogName());
        }
    }

    public static void getGroupSmalls() {
        for (Dog tempDog : groupSmalls) {
            System.out.println(tempDog.getDogName());
        }
    }

    public static void getGroupSolo() {
        for (Dog tempDog : groupSolo) {
            System.out.println(tempDog.getDogName());
        }
    }



    /*
     *  Methods to add new Dog objects to Playgroup ArrayLists
     */
    public static void setGroups(Dog dog) {
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

    public static void setGroupA(Dog dog) {
            groupA.add(dog);
    }

    public static void setGroupB(Dog dog) {
            groupB.add(dog);
    }

    public static void setGroupC(Dog dog) {
            groupC.add(dog);
    }

    public static void setGroupN(Dog dog) {
            groupN.add(dog);
    }

    public static void setGroupSmalls(Dog dog) {
            groupSmalls.add(dog);
    }

    public static void setGroupSolo(Dog dog) {
            groupSolo.add(dog);

    }
}
