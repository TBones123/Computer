package DZ;

public class Computer {
    private String model;
    private int yearIssue;
    private int volumeMemory;
    private int price;
    Hdd hdd;
    Cpu cpu;

    public Computer(String model, int yearIssue, int volumeMemory, int price, Hdd hdd, Cpu cpu) {
        this.model = model;
        this.yearIssue = yearIssue;
        this.volumeMemory = volumeMemory;
        this.price = price;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearIssue() {
        return yearIssue;
    }

    public void setYearIssue(int yearIssue) {
        this.yearIssue = yearIssue;
    }

    public int getVolumeMemory() {
        return volumeMemory;
    }

    public void setVolumeMemory(int volumeMemory) {
        this.volumeMemory = volumeMemory;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "\n"+"Computer{" +
                "model='" + model + '\'' +
                ", yearIssue=" + yearIssue  +
                ", volumeMemory=" + volumeMemory +
                ", price=" + price +
                ", hdd=" + hdd +
                ", cpu=" + cpu +
                '}' +"\n";
    }
}
