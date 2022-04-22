package ru.gorban.lesson_6;
//Здраввствуйте, Сабина! Заранее спасибо  за проверку!
public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Кот", "Маркот");
        Dog dog = new Dog("Пес","Барбос");

        System.out.println("Животные: ");
        System.out.println(cat.toString());
        System.out.println(dog.toString());
        System.out.println("-------------------------------");
        System.out.println("Бег: ");
        cat.animalRun(30);
        dog.animalRun(501);
        System.out.println("-------------------------------");
        System.out.println("Плавание");
        cat.animalSwim(200);
        dog.animalSwim(9);

    }
}



