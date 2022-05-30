package singleton;

import java.util.Arrays;

public class Log {

    private final static Log log = new Log();

    private Log(){};

    public static Log getInstance(){
        return log;
    }

    public void getInfo(Object o){
        Class clazz = o.getClass();
        System.out.println("Имя класса: " + clazz);
        System.out.println("Поля класса: " + Arrays.toString(clazz.getDeclaredFields()));
        System.out.println("Родительский класс: " + clazz.getSuperclass());
        System.out.println("Методы класса: " +  Arrays.toString(clazz.getDeclaredMethods()));
        System.out.println("Конструкторы класса: " + Arrays.toString(clazz.getConstructors()));
    }
}
