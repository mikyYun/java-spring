package ch08;

import java.util.ArrayList;

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

        ArrayList<Animal> animalList = new ArrayList<>();
        animalList.add(hAnimal);
        animalList.add(eAnimal);
        animalList.add(tAnimal);

        for (Animal animal : animalList) {
            animal.move();
        }

        AnimalTest test = new AnimalTest();
//        test.moveAnimals(hAnimal);
//        test.moveAnimals(eAnimal);
//        test.moveAnimals(tAnimal);

        test.testDownCasting(animalList);
    }

    public void testDownCasting(ArrayList<Animal> list) {
        for (int i = 0; i < list.size(); i++) {
            Animal animal = list.get(i);
            if (animal instanceof Human) {
                Human human = (Human)animal;
                human.readBook();
            } else if (animal instanceof Tiger) {
                Tiger tiger = (Tiger)animal;
                tiger.hunting();
            } else if (animal instanceof Eagle) {
                Eagle eagle = (Eagle)animal;
                eagle.flying();
            } else {
                System.out.println("Unsupported animal");
            }
        }
    }

    public void moveAnimals(Animal animal) {
        animal.move();
    }
}
