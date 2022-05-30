package proxy;

public class DataBaseConnectProxy {
    private final DataBaseConnect dataBaseConnect;

    public DataBaseConnectProxy(DataBaseConnect dataBaseProperty) {
        this.dataBaseConnect = dataBaseProperty;
    }

    public void connect() {
        dataBaseConnect.connect("localhost:8080/");
    }
}
