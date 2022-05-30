package adapter;

public class Adapter implements USB {

    private MemoryCard memoryCard;

    public Adapter(MemoryCard memoryCard) {
        this.memoryCard = memoryCard;
    }

    @Override
    public void connectWithUsbCable() {
        this.memoryCard.insert();
        this.memoryCard.readindData();
    }
}
