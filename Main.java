package ru.gorban.lesson_7;
//Здравствуйте,Сабина!Заранее спасибо за проверку!

public class Main {
    public static void main(String[] args) {
        Cat[] cats = new Cat[5];
        cats[0] = new Cat("Василий", 5);
        cats[1] = new Cat("Снежок", 6);
        cats[2] = new Cat("Барсик", 10);
        cats[3] = new Cat("Ириска", 3);
        cats[4] = new Cat("Маркот", 7);
        System.out.println("Кормление котов из общей тарелки ");
        System.out.println("--------------------");
        Plate sharedPlate = new Plate(0);
        sharedPlate.info();
        sharedPlate.increaseFood(20);
        System.out.println("--------------------");
        sharedPlate.info();
        for (int i = 0; i < 5; i++) {
            cats[i].catEat(sharedPlate);
            cats[i].isCatFull(sharedPlate);
            System.out.println("--------------------");
            sharedPlate.info();
        }

        }
    }











