package factory;

public class Espresso extends Coffee {

    @Override
    public void pourIntoCup() {
        System.out.println("наливаем эспрессо");;
    }
}
