package ru.gorban;

public class lesson2 {
    public static void main(String[] args) {
        int a = 3;
        int b = 15;
        System.out.println("Здравствуйте, Сабина");
        within10and20( a,  b);
        System.out.println(within10and20( a,  b));
        pasitiveOrNagative( a );
        pasitiveOrNagative2( a);
        System.out.println(pasitiveOrNagative2( a));
        printRepeat();
        System.out.println("Спасибо за проверку!");
    }
    public static boolean within10and20(int a, int b) {
    if (a + b <= 20 && a + b >= 10) {
        return true;
    } else {
        return false;
    }
    }
    public static void pasitiveOrNagative(int a) {
        if (a >= 0 ){
            System.out.println("Число положительное");
        }else {
            System.out.println("Число отрицательное");
        }
    }
    public static boolean pasitiveOrNagative2(int a) {
        if ( a < 0 ) {
            return true;
        }else {
            return false;
        }
    }
    public static void printRepeat() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("повтор строки " + i);
        }
    }
}

