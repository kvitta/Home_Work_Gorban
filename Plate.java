package ru.gorban.lesson_7;

public class Plate {
   private  int food;
    public  Plate (int food){
        this.food = food;
    }
    public  int getFood() {
        return food;
    }
    public void setFood(int food) {
        this.food = food;
    }
    public void info(){
       System.out.println("Количество рыбы в тарелке: " + food + " шт.");
    }
    public boolean decreaseFood (int amount){
        if (food < amount){
            System.out.println("Недостаточно еды для кота");
            return false;
        }
       food -= amount;
       if (food <= 0){
           food = 0;
       }
        return true;
    }
    public boolean satiety(int amount){
        if (food >= amount){
            return true;
        };
        return false;
    }
    public void increaseFood(int amount) {
        food += amount;
        System.out.println("Пополнение тарелки: " + amount + " шт.");

    }
}
