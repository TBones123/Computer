package DZ;

public class Cpu {
    private int numberCores;
    private String frequency;
    ManufacturerCountry manufacturerCountry;

    public Cpu(int numberCores, String frequency, ManufacturerCountry manufacturerCountry) {
        this.numberCores = numberCores;
        this.frequency = frequency;
        this.manufacturerCountry = manufacturerCountry;
    }

    public int getNumberCores() {
        return numberCores;
    }

    public void setNumberCores(int numberCores) {
        this.numberCores = numberCores;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public ManufacturerCountry getManufacturerCountry() {
        return manufacturerCountry;
    }

    public void setManufacturerCountry(ManufacturerCountry manufacturerCountry) {
        this.manufacturerCountry = manufacturerCountry;
    }

    @Override
    public String toString() {
        return "Cpu{" +
                "numberCores=" + numberCores +
                ", frequency='" + frequency + '\'' +
                ", manufacturerCountry=" + manufacturerCountry +
                '}';
    }
}
