import java.io.Serializable;
import java.util.ArrayList;

public class Dog implements Serializable {
    // Display name for dog
    private String dogName;

    // Unique 4 digit Identifier for each dog starting at 1000
    private int uid = 1000;

    /*
     *  Semi-binary number which represents the different groups that the dog belongs to
     *  i.e.    101010
     *          GroupA| GroupB | GroupC | Group N | GroupSmalls | Solo/Pair
     *               1|    0   |    1   |    0    |     1       |   0
     */
    private ArrayList<Boolean> group = new ArrayList<>();

    // Boolean whose value determines whether or not a dog has allergies
    private boolean allergy;

    public void getInfo() {
        System.out.println("\n \n \n \n" + getDogName());
        System.out.println("Unique Identification is: " + getUID());
        System.out.println(getGroup());
        if (getAllergy()) {
            System.out.println(getDogName() + " has allergies.");
        }
    }

    public String getDogName() {
        return dogName;
    }

    public void setDogName(String dogName) {
        this.dogName = dogName;
    }

    public int getUID() {
        return uid;
    }

    public void setUID() {
        this.uid = newUID();
    }

    public void setGroup(boolean x) {
        this.group.add(x);
    }

    public ArrayList<Boolean> getGroup() {
        return group;
    }

    public boolean getAllergy() {
        return allergy;
    }

    public void setAllergy(boolean allergy) {
        this.allergy = allergy;
    }

    @Override
    public String toString() {
        return getDogName();
    }

    public String getGroupString() {
        StringBuilder groupString = new StringBuilder();
        for (boolean y : this.group) {
            groupString.append(y);
        }

        return groupString.toString();
    }

    private static int counter = 1000;

    public static int newUID() {
        counter++;
        return counter;
    }
}
