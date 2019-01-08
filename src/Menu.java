import java.util.Scanner;

class Menu {
    static void menu() {
        Scanner input = new Scanner(System.in);
        int userChoice;

        do {
            System.out.println("\nPlaybow App Main Menu \n");
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
                    exitApp();
                    break;

                    default:
                        defaultString(userChoice);
                        break;
            }
        } while(userChoice != 0);
    }

    private static void dogMenu() {
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
                    deleteDog();
                    // To-do: Implement a method to delete dogs by name.... May have to reimplement way
                    break;

                case 3:
                    displayDogs();
                    break;

                case 4:
                    dogInfo();
                    break;

                case 5:
                    System.out.println("Opening Main Menu...\n");
                    menu();
                    break;

                case 0:
                    exitApp();
                    break;

                default:
                    defaultString(userChoice);
                    break;
            }
        } while(userChoice != 0);
    }

    private static void groupMenu() {
        Scanner input = new Scanner(System.in);
        int userChoice;

        do {
            System.out.println("Group Menu \n");
            System.out.println("1) Add Dog To Group\n");
            System.out.println("2) Remove Dog From Group\n");
            System.out.println("3) Display Group List\n");
            System.out.println("4) Main Menu\n");
            System.out.println("0) Exit Program\n");
            System.out.println("Please Enter Your Choice\n");

            userChoice = input.nextInt();
            switch (userChoice) {

                case 1:
                    addToGroup();
                    break;

                case 2:
                    removeFromGroup();
                    break;

                case 3:
                    displayGroup();
                    break;

                case 4:
                    System.out.println("Opening Main Menu...\n");
                    menu();
                    break;

                case 0:
                    exitApp();
                    break;

                default:
                    defaultString(userChoice);
                    break;

            }
        } while(userChoice != 0);
    }

    private static void allergyMenu() {

    }

    private static void defaultString(int userChoice) {
        System.out.println(userChoice + " is not a valid Menu option! Please select another.");
    }

    private static void exitApp() {
        System.out.println("Exiting program...\n");
        System.exit(0);
    }

    private static void newDog() {
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

    private static void deleteDog() {
        Scanner input = new Scanner(System.in);

        DogList.dogList.removeIf(Dog -> Dog.getDogName().equals(input.nextLine()));
    }

    private static void displayDogs() {
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < DogList.dogList.size(); i++)
            System.out.println(DogList.dogList.get(i));
        input.nextLine();
    }

    private static void dogInfo() {
        Scanner input = new Scanner(System.in);

        System.out.println("Which dog's info do you want?\n");
        String dogChoice = input.nextLine();
        for (int i = 0; i < DogList.dogList.size(); i++) {
            if (DogList.dogList.get(i).getDogName().equalsIgnoreCase(dogChoice)) {
                DogList.dogList.get(i).getInfo();
            }
        }
    }


}
