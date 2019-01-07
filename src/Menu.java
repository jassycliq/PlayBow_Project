import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Menu {
    public static void menu() {
        Scanner input = new Scanner(System.in);
        int userChoice;

        do {
            System.out.println("Playbow App Main Menu \n");
            System.out.println("1) Dog Menu\n");
            System.out.println("2) Group Menu\n");
            System.out.println("3) Allergy Menu\n");
            System.out.println("0) Exit Program\n");
            System.out.println("Please Enter Your Choice\n");

            userChoice = input.nextInt();
            switch (userChoice) {

                case 1:
                    dogMenu();
                    break;

                case 2:
                    groupMenu();
                    break;

                case 3:
                    allergyMenu();
                    break;

                case 0:
                    System.out.println("Exiting program...\n");
                    System.exit(0);
                    break;

                    default:
                        System.out.println(userChoice + " is not a valid Menu option! Please select another.");
                        break;
            }
        } while(userChoice != 0);
    }

    public static void dogMenu() {
        Scanner input = new Scanner(System.in);
        int userChoice;

        do {
            System.out.println("Dog Menu \n");
            System.out.println("1) Add New Dog\n");
            System.out.println("2) Delete Dog\n");
            System.out.println("3) Display All Dogs\n");
            System.out.println("4) Display Dog Info\n");
            System.out.println("5) Main Menu\n");
            System.out.println("0) Exit Program\n");
            System.out.println("Please Enter Your Choice\n");

            userChoice = input.nextInt();
            switch (userChoice) {

                case 1:
                    newDog();
                    break;

                case 2:
                    DogList.dogList.removeIf(Dog -> Dog.getDogName().equals(input.nextLine()));
                    // To-do: Implement a method to delete dogs by name.... May have to reimplement way
                    break;

                case 3:
                    for (int i = 0; i < DogList.dogList.size(); i++)
                    System.out.println(DogList.dogList.get(i));
                    input.nextLine();
                    input.nextLine();
                    break;

                case 4:
                    System.out.println("Which dog's info do you want?\n");
                    input.nextLine();
                    String dogChoice = input.nextLine();
                    for (int i = 0; i < DogList.dogList.size(); i++) {
                        if (DogList.dogList.get(i).getDogName().equalsIgnoreCase(dogChoice)) {
                            DogList.dogList.get(i).getInfo();
                        }
                    }
                    break;

                case 5:
                    System.out.println("Opening Main Menu...\n");
                    menu();
                    break;

                case 0:
                    System.out.println("Exiting program...\n");
                    System.exit(0);
                    break;

                default:
                    System.out.println(userChoice + " is not a valid Menu option! Please select another.");
                    break;
            }
        } while(userChoice != 0);
    }

    public static void groupMenu() {

    }

    public static void allergyMenu() {

    }

    public static void newDog() {
        Scanner input = new Scanner(System.in);
        String dogName;

        Dog tempDog = new Dog();

        System.out.println("Please enter dog's name.\n");
        dogName = input.nextLine();
        tempDog.setDogName(dogName);
        tempDog.setUID();
        System.out.println("Enter Dog groups\n");
        System.out.println("Is " + dogName + " in Group A?");
        boolean groupA = input.nextBoolean();
        tempDog.setGroup(groupA);
        System.out.println("Is " + dogName + " in Group B?\n");
        boolean groupB = input.nextBoolean();
        tempDog.setGroup(groupB);
        System.out.println("Is " + dogName + " in Group C?\n");
        boolean groupC = input.nextBoolean();
        tempDog.setGroup(groupC);
        System.out.println("Is " + dogName + " in Noah's Group?\n");
        boolean groupN = input.nextBoolean();
        tempDog.setGroup(groupN);
        System.out.println("Is " + dogName + " in Smalls Group?\n");
        boolean groupSmalls = input.nextBoolean();
        tempDog.setGroup(groupSmalls);
        System.out.println("Is " + dogName + " in Solo/Pair?\n");
        boolean groupSolo = input.nextBoolean();
        tempDog.setGroup(groupSolo);
        Playgroup.setGroups(tempDog);
        System.out.println("Does " + dogName + " have any allergies?\n");
        boolean hasAllergy = input.nextBoolean();
        tempDog.setAllergy(hasAllergy);

        DogList.addDogList(tempDog);
    }


}
