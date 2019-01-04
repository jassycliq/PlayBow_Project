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

    public static ArrayList<Dog> getGroupA() {
        return groupA;
    }

    public static ArrayList<Dog> getGroupB() {
        return groupB;
    }

    public static ArrayList<Dog> getGroupC() {
        return groupC;
    }

    public static ArrayList<Dog> getGroupN() {
        return groupN;
    }

    public static ArrayList<Dog> getGroupSmalls() {
        return groupSmalls;
    }

    public static ArrayList<Dog> getGroupSolo() {
        return groupSolo;
    }



    /*
     *  Methods to add new Dog objects to Playgroup ArrayLists
     */
    public static void setGroups(Dog dog) {
        setGroupA(dog);
        setGroupB(dog);
        setGroupC(dog);
        setGroupN(dog);
        setGroupSmalls(dog);
        setGroupSolo(dog);
        System.out.println("Groups set for: " + dog.getDogName());
    }
    public static void setGroupA(Dog dog) {
        if (dog.getGroup().get(0)) {
            groupA.add(dog);
        }
    }

    public static void setGroupB(Dog dog) {
        if (dog.getGroup().get(1)) {
            groupB.add(dog);
        }
    }

    public static void setGroupC(Dog dog) {
        if (dog.getGroup().get(2)) {
            groupC.add(dog);
        }    }

    public static void setGroupN(Dog dog) {
        if (dog.getGroup().get(3)) {
            groupN.add(dog);
        }    }

    public static void setGroupSmalls(Dog dog) {
        if (dog.getGroup().get(4)) {
            groupSmalls.add(dog);
        }    }

    public static void setGroupSolo(Dog dog) {
        if (dog.getGroup().get(5)) {
            groupSolo.add(dog);
        }    }
}
