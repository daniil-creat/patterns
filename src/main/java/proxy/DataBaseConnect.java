package proxy;

public class DataBaseConnect {
    String nameDb = "students";

    public void connect(String url) {
        System.out.println(url + nameDb);
    }
}
