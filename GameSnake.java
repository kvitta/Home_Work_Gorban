package ru.gorban.GameSnake;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;



public class GameSnake extends JFrame {

    private final String TITLE_OF_PROGRAM = "Classic Game Snake";
    private final String GAME_OVER_MSG = "GAME OVER";
    public final static int CELL_SIZE = 20;
    public final static int CANVAS_WIDTH = 30;
    public final static int CANVAS_HEIGHT = 25;
    public final static Color SNAKE_COLOR = Color.darkGray;
    public final static Color FOOD_COLOR = Color.green;
    public static final Color POISON_COLOR = Color.red;
    public final static int KEY_LEFT = 37;
    public final static int KEY_UP = 38;
    public final static int KEY_RIGHT = 39;
    public final static int KEY_DOWN = 40;
    public final int START_SNAKE_SIZE = 5;
    public final int START_SNAKE_X = CANVAS_WIDTH/2;
    public final int START_SNAKE_Y = CANVAS_HEIGHT/2;
    public final int SNAKE_DELAY = 150; public int snakeSize = 0;
    public static boolean gameOver = false;
    Canvas canvas;
    Snake snake;
    Food food;
    Poison poison;
    public static void main(String[] args) {
        new GameSnake().game();
    }
    public  GameSnake() { setTitle(TITLE_OF_PROGRAM);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        canvas = new Canvas();
        canvas.setBackground(Color.white);
        canvas.setPreferredSize(new Dimension(CELL_SIZE * CANVAS_WIDTH, CELL_SIZE * CANVAS_HEIGHT));
        addKeyListener(new KeyAdapter() {
            @Override
        public void keyPressed(KeyEvent e) {
            snake.setDirection(e.getKeyCode()); }
        });
        add(canvas);
        pack();
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);

    }
    private void game()  {
        snake = new Snake(START_SNAKE_X, START_SNAKE_Y, START_SNAKE_SIZE, KEY_RIGHT);
        food = new Food(snake);
        snake.setFood(food);
        poison = new Poison(snake);
        poison.setFood(food);
        snake.setPoison(poison);
        food.setPoison(poison);

        while (!gameOver) {
            snake.move();
            if (snake.size() > snakeSize) {
            snakeSize = snake.size();
            setTitle(TITLE_OF_PROGRAM + " : " + snakeSize); }
        if (food.isEaten()) {
            food.appear();
            poison.add();
        }
        canvas.repaint();
        sleep(SNAKE_DELAY);
    }
    JOptionPane.showMessageDialog(this, GAME_OVER_MSG);
}
private void sleep (long ms){
        try{
            Thread.sleep(ms);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
}

    class Canvas extends JPanel {
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2D = (Graphics2D) g;
        g2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        snake.paint(g2D);
        food.paint(g2D);
       poison.paint(g2D);
    }
    } }


