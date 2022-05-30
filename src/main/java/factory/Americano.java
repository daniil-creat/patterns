package factory;

public class Americano extends Coffee {

    @Override
    public void pourIntoCup() {
        System.out.println("наливаем американо");
    }
}
