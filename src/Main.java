public class Main {

    public static void main(String[] args) {

        Dog JonesC = new Dog();
        JonesC.setDogName("Jones");
        JonesC.setUID();
        JonesC.setGroup(false); JonesC.setGroup(false); JonesC.setGroup(false); JonesC.setGroup(true); JonesC.setGroup(false);
                JonesC.setGroup(false);
        Playgroup.setGroups(JonesC);
        JonesC.setAllergy(true);
        DogList.addDogList(JonesC);


        Dog BlueJ = new Dog();
        BlueJ.setDogName("Blue");
        BlueJ.setUID();
        BlueJ.setGroup(false); BlueJ.setGroup(false); BlueJ.setGroup(false); BlueJ.setGroup(false); BlueJ.setGroup(false);
                BlueJ.setGroup(true);
        Playgroup.setGroups(BlueJ);
        BlueJ.setAllergy(false);
        DogList.addDogList(BlueJ);

        Menu.menu();
    }
}
