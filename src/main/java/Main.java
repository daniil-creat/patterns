import adapter.Adapter;
import adapter.MemoryCard;
import factory.CoffeeFactory;
import factory.CoffeeShop;
import factory.CoffeeType;
import proxy.DataBaseConnect;
import proxy.DataBaseConnectProxy;

public class Main {

    public static void main(String[] args) {
        DataBaseConnect dataBaseConnect = new DataBaseConnect();
        DataBaseConnectProxy dataBaseConnectProxy = new DataBaseConnectProxy(dataBaseConnect);
        dataBaseConnectProxy.connect();
    }
}
