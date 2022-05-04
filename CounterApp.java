package ru.gorban.counterApp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CounterApp extends JFrame {
    public static void main(String [] args){
        new CounterApp(0);//Первоначальное значение = 0
    }
    private int value;
    public CounterApp(int initialValue){
        setBounds(500,500,300,120);//размер окна
        setTitle("Simple Counter");//название
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);// завершение программы призакрытии
        Font font = new Font ("Arial", Font.BOLD,32);//Создаем шрифт
        JLabel counterValueView = new JLabel(); // Создаем текстовое поле
        counterValueView.setFont(font); // задаем ему шрифт
        counterValueView.setHorizontalAlignment(SwingConstants.CENTER);//размещаем по центру
        add(counterValueView, BorderLayout.CENTER);//Добавляем ее на форму

        JButton decrementButton = new JButton("<"); //Создаем кнопку, отвечающюю за уменьшение счетчика
        decrementButton.setFont(font);// задаем шрифт
        add(decrementButton,BorderLayout.WEST);// размещаем слева

        JButton incrementButton = new JButton(">"); //Создаем кнопку, отвечающюю за увеличение счетчика
        incrementButton.setFont(font);// задаем шрифт
        add(incrementButton, BorderLayout.EAST);// размещаем справа

        decrementButton.addActionListener(new ActionListener() {//добавляем реакцию программы на нажатие левой кнопки
            @Override
            public void actionPerformed(ActionEvent e) {
                value--; // при нажатии значение счетчика уменьшается
                counterValueView.setText(String.valueOf(value));//выводим на экран значение переменной
            }
        });

        incrementButton.addActionListener(new ActionListener() {//добавляем реакцию программы на нажатие правой кнопки
            @Override
            public void actionPerformed(ActionEvent e) {
                value++;// при нажатии значение счетчика увеличивается
                counterValueView.setText(String.valueOf(value));//выводим на экран значение переменной
            }
        });
        setVisible(true);// отображение программы
    }


}
