package ru.gorban.lesson_6;

public class Animal {
    private String type;
    private String name;


    public Animal(String type, String name) {
        this.type = type;
        this.name = name;

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean animalRun(int runs) {
        System.out.println(type + name + " пробежал " + runs + " м.");
        return true;
    }

    public boolean animalSwim(int swims) {
        System.out.println(type + name + " проплыл " + swims + " м.");
        return true;
    }

    public String toString() {
        return "- " + type + " " + name;
    }
}



