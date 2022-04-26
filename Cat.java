package ru.gorban.lesson_7;


public class Cat {
    private String name;
    private int appetite;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAppetite() {
        return appetite;
    }
    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }
    public Cat(String name, int appetite){
        this.name = name;
        this.appetite = appetite;
    }
    public void catEat(Plate plate) {
        System.out.println("Кот " + name + " хочет съесть " + appetite + " шт." );
        plate.decreaseFood(appetite);



    }
    public boolean isCatFull (Plate plate) {
        if (plate.satiety(appetite) == true ){
            System.out.println("Кот съел рыбу и сыт");
            return true;
        }
        return false;
    }




}
