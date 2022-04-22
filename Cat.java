package ru.gorban.lesson_6;

public class Cat extends Animal {
    public Cat(String type, String name) {
        super( type, name);
    }
    @Override
    public boolean animalRun(int runs) {
        if (runs > 200) {
            System.out.println("Некорректное значение " + runs + " (Кот может пробежать только 200 м.)");
            return false;
        }
        System.out.println( getType() + " " + getName() +" пробежал "+ runs + " м.");
        return true;

    }
    @Override
    public boolean animalSwim(int swims){
        System.out.println("Некорректное значение " + swims + " (Кот не умеет плавать)");
        return true;
    }

    }




