package ru.gorban;
//Здраввствуйте, Сабина!
// задание Урока 4 (с начала опираясь на методическое пособие, затем ниже опираясь на урок)
// + пункт 2 ( пррверка выигрыша с помощью циклов)
// Заранее спасибо за проверку!


import java.util.Random;
import java.util.Scanner;


/*public class TicTacToe_lesson4 {
    public static char [][] map;
    public static final int SIZE = 3;
    public static final int DOTS_TO_WIN = 3;
    public static final char DOT_EMPTY = '.';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';
    public static void main(String [] args){
        initMap();
        printMap();
        while (true){
            humanTurn();
            printMap();
            if (checkWin(DOT_X)) {
                System.out.println("Победил человек");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(DOT_O)){
                System.out.println("Победил искуственный интелект");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }

        }
        System.out.println("Игра закончена");
    }
    private static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++){
            for (int j = 0; j < SIZE; j++){
                if (map[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }
    public static void initMap (){
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++){
            for (int j = 0; j < SIZE; j++){
                map [i][j] = DOT_EMPTY;
            }
        }
    }
    public static void printMap (){
        for (int i = 0; i <= SIZE; i++){
            System.out.print(i + " ");
        }
        System.out.println();
        for (int  i = 0; i < SIZE; i++){
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++ ) {
                System.out.print(map[i][j] + " " ) ;
            }
            System.out.println();
        }
        System.out.println();
    }
    public static Scanner sc = new Scanner(System.in);
    public static void humanTurn(){
        int x, y;
        do {
            System.out.println("Введите координаты в формате X Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid (x,y));
        map [y][x]= DOT_X;
    }
    private static boolean isCellValid(int x, int y) {
       if( x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false;
       if(map[y][x] == DOT_EMPTY) return true;
       return false;
    }
    public static Random rand = new Random();
    public static void aiTurn(){
        int x, y;
        do {
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        } while (!isCellValid(x, y));
        System.out.println("Компьютер походит в точку" + (x + 1) + " " + (y + 1 ));
        map[y][x] = DOT_O;
    }
    *//* вариант проверки через условия
    public static boolean checkWin(char symb){
        if (map[0][0] == symb && map[0][1] == symb && map[0][2] == symb) return true;
        if (map[1][0] == symb && map[1][1] == symb && map[1][2] == symb) return true;
        if (map[2][0] == symb && map[2][1] == symb && map[2][2] == symb) return true;
        if (map[0][0] == symb && map[1][0] == symb && map[2][0] == symb) return true;
        if (map[0][1] == symb && map[1][1] == symb && map[2][1] == symb) return true;
        if (map[0][2] == symb && map[1][2] == symb && map[2][2] == symb) return true;
        if (map[0][0] == symb && map[1][1] == symb && map[2][2] == symb) return true;
        if (map[2][0] == symb && map[1][1] == symb && map[0][2] == symb) return true;
        return false;*//*
    *//* Вариант проверки через циклы ( Домашнее задание)*//*
    public static boolean checkWin(char symb){
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if(     map[i][0] == symb && map[i][1] == symb && map[i][2] == symb||
                        map[0][j] == symb && map[1][j] == symb && map[2][j] == symb||
                        map[0][0] == symb && map[1][1] == symb && map[2][2] == symb||
                        map[2][0] == symb && map[1][1] == symb && map[0][2] == symb
                ){
                    return true;
                }
            }
            return false;
        }
        return false;
    }
    }*/
// Выполнение домашенего задание опираясь на код, написанный на уроке

public class TicTacToe_lesson4 {
    Random random;
    Scanner scanner;
    char[][] table;
    TicTacToe_lesson4() {
        table = new char[3][3];
        random = new Random();
        scanner = new Scanner(System.in);
    }
    public static void main(String[] args ){
        new TicTacToe_lesson4().game();
                }
    void game() {
        System.out.println("Game is started!");
        initTable();
        printTable();
         while(true){
        turnHuman();
        if(checkWin('x')){
            printTable();
            System.out.println("YOU WON!");
            break;
        }
        if(isTableFull()){
            System.out.println("DRAW!");
            break;
        }
        turnAI();
        printTable();
        if(checkWin('o')){
            printTable();
            System.out.println("AI WON!");
            break;
        }
    }
}
    boolean isTableFull() {
        for(int x = 0; x < 3; x++){
            for(int y = 0; y < 3; y++){
                if(table[x][y] == '.') return false;
            }
        }
        return true;
    }
    /* Метод проверки условиями
    boolean checkWin(char symbol) {
        if (table[0][0] == symbol && table[0][1] == symbol && table[0][2] == symbol) return true;
        if (table[1][0] == symbol && table[1][1] == symbol && table[1][2] == symbol) return true;
        if (table[2][0] == symbol && table[2][1] == symbol && table[2][2] == symbol) return true;
        if(table[0][0] == symbol && table[1][0] == symbol && table[2][0] == symbol) return true;
        if(table[0][1] == symbol && table[1][1] == symbol && table[2][1] == symbol) return true;
        if(table[0][2] == symbol && table[1][2] == symbol && table[2][2] == symbol) return true;
        if(table[0][0] == symbol && table[1][1] == symbol && table[2][2] == symbol) return true;
        if(table[0][2] == symbol && table[1][1] == symbol && table[2][0] == symbol) return true;
        return false;
    }*/
    //метод проверки циклами
    boolean checkWin(char symbol){
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table.length; j++)
                if (table[i][0] == symbol && table[i][1] == symbol && table[i][2] == symbol ||
                        table[0][j] == symbol && table[1][j] == symbol && table[2][j] == symbol ||
                        table[0][0] == symbol && table[1][1] == symbol && table[2][2] == symbol ||
                        table[2][0] == symbol && table[1][1] == symbol && table[0][2] == symbol
                ) {
                    return true;
                }
            return false;
        }
        return false;
    }
    void turnHuman() {
        int x, y;
        do{
            System.out.println("Enter x y from [0..2]");
            x = scanner.nextInt();
            y = scanner.nextInt();
            //System.out.println(x + ", " + y);
        } while (!isCellValid(x, y));
        table[y][x] = 'x';

    }
    private boolean isCellValid(int x, int y) {
        if (x < 0 || y < 0 || x > 2 || y > 2) {
            return false;
        }
        return table[x][y] == '.';
    }
    void turnAI() {
        int x, y;

        do{
            x = random.nextInt(3);
            y = random.nextInt(3);
        } while (!isCellValid(x, y));
        table[x][y] = 'o';
    }
    void initTable(){
        for(int x = 0; x < 3; x++){
            for(int y = 0; y < 3; y++){
                table[x][y] = '.';
            }
        }
    }
    void printTable() {
        for(int y = 0; y < 3; y++){
            for(int x = 0; x < 3; x++){
                System.out.print(table[x][y] + " ");
            }
            System.out.println();
        }
    }
}