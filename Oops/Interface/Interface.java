package Oops.Interface;

//interface do not have constructor or can 
interface Animal {
    int eye = 2;// now we do not able to change this variable mean final but everyone can access

    void walk();// no need to write public here because in interface it become publiv defaultly

    // void eat();

}

interface Herbivore {

}

// in interface we use implement not extends in interface it is neccesary to
// impelment the all methodsof the base class like walk and eats
class Horse implements Animal, Herbivore {// we can implement two interface clss at once
    public void walk() {

        System.out.println("4 legs" + eye);
    }

}

public class Interface {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walk();

    }

}
