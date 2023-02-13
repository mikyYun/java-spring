package ch06;

class Animal {
    public void move() {
        System.out.println("Animal moves.");
    }
}

class Human extends Animal {
    @Override
    public void move() {
        System.out.println("Human walks.");
    }

    public void readBook() {
        System.out.println("Human reads a book.");
    }
}

class Tiger extends Animal {
    @Override
    public void move() {
        System.out.println("Tiger runs on four legs.");
    }

    public void hunting() {
        System.out.println("Tiger hunts.");
    }
}

class Eagle extends Animal {
    @Override
    public void move() {
        System.out.println("Eagle flies on the sky.");
    }

    public void flying() {
        System.out.println("Eagle is flying.");
    }
}
public class AnimalTest {

    public static void main(String[] args) {
        Animal hAnimal = new Human();
        Animal eAnimal = new Eagle();
        Animal tAnimal = new Tiger();

        AnimalTest test = new AnimalTest();
        test.moveAnimals(hAnimal);
        test.moveAnimals(eAnimal);
        test.moveAnimals(tAnimal);
    }

    public void moveAnimals(Animal animal) {
        animal.move();
    }
}
