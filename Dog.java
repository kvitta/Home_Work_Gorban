package ru.gorban.lesson_6;

public class Dog extends Animal{
    public Dog (String type, String name){
        super(type,name);
    }
    @Override
    public boolean animalRun(int runs) {
        if ( runs > 500){
            System.out. println( "Некорректное значение " + runs +" (Пес может пробежать только 500 м.)");
            return false;
        } System.out.println( getType() + " " + getName() +"Пес проплыл "+ runs + " м.");
        return true;
    }
    @Override
    public boolean animalSwim(int swims) {
        if ( swims > 10){
            System.out. println( "Некорректное значение " + swims +" (Пес может проплыть только 10 м.)");
            return false;
        } System.out.println( getType() + " " + getName() +" проплыл "+ swims + " м.");
        return true;
    }
}
