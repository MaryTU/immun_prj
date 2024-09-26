package com.example;

import java.awt.*; 
import javax.swing.JFrame; // создание окна приложения (или контейнер для всех объектов GUI)
import javax.swing.JButton; // класс кнопки
import javax.swing.JOptionPane; // мэссэджбокс
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import org.jfree.chart.ChartPanel; // график
/**
 * window_app
 */
public class WindowApp extends JFrame{

    private static final long serialVersionUID = 1L; // не понимаю зачем это, но сказали нужно 

    public WindowApp(){
        Container c = getContentPane();
        c.setLayout(new BorderLayout());

        // Добавляем панель с графиком
        ChartPanel chartPanel = ChartExample.createChartPanel();
        // c.add(chartPanel, BorderLayout.CENTER);
        c.add(chartPanel, BorderLayout.WEST);

        // Добавляем кнопку справа
        JButton button = new JButton("Click Me");
        // c.add(button, BorderLayout.CENTER);
        c.add(button, BorderLayout.EAST);

        // Обработчик события нажатия на кнопку
        button.addActionListener(new ActionListener() { // метод добавляет слушателя действий (ActionListener) к кнопке и создается новый анонимный класс, который реализует интерфейс ActionListener
            @Override // аннотация, которая указывает, что метод переопределяет метод суперкласса или интерфейса
            public void actionPerformed(ActionEvent e) { // метод нажатия на кнопку
                JOptionPane.showMessageDialog(null, "Button Clicked!"); // отображение диалового окна
            }
        });
        // MyPanel child = new MyPanel();
        // c.add(child);

        // название окна
        setTitle("vjsnfb"+func.printMessage(5, 6));

        // Получаем размер экрана
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int screenWidth = screenSize.width; // int screenHeight = screenSize.height;
        setPreferredSize(new Dimension(screenWidth-50, 480)); // размер окна

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // операция по умолчанию, при закрытии окна приложение тоже должно закрыться

        pack(); // изменение размера окна в соответствии с предпочтительными размерами всех его компонентов
        setVisible(true); // этот метод делает окно видимым
    }  

    public static void main(String[] args) {
        new WindowApp(); // создаем окошечко
        // System.out.println("dobjne");
    }
}