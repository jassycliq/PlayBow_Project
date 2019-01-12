public class Main {

    public static void main(String[] args) {

        Dog JonesC = new Dog();
        JonesC.setDogName("Jones");
        JonesC.setUID();
        JonesC.setGroup(false, 0); JonesC.setGroup(false, 1); JonesC.setGroup(false, 2); JonesC.setGroup(true, 3); JonesC.setGroup(false, 4);
                JonesC.setGroup(false, 5);
        Playgroup.setGroups(JonesC);
        JonesC.setAllergy(true);
        DogList.addDogList(JonesC);


        Dog BlueJ = new Dog();
        BlueJ.setDogName("Blue");
        BlueJ.setUID();
        BlueJ.setGroup(false, 0); BlueJ.setGroup(false, 1); BlueJ.setGroup(false, 2); BlueJ.setGroup(false, 3); BlueJ.setGroup(false, 4);
                BlueJ.setGroup(true, 5);
        Playgroup.setGroups(BlueJ);
        BlueJ.setAllergy(false);
        DogList.addDogList(BlueJ);

        Menu.menu();
    }
}
