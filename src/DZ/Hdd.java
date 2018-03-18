package DZ;

public class Hdd {
    private String modelHDD;
    TypHDD typHDD;
    private int volumeHardDisk;
    ManufacturerCountry manufacturerCountry;

    public Hdd(String modelHDD, TypHDD typHDD, int volumeHardDisk, ManufacturerCountry manufacturerCountry) {
        this.modelHDD = modelHDD;
        this.typHDD = typHDD;
        this.volumeHardDisk = volumeHardDisk;
        this.manufacturerCountry = manufacturerCountry;
    }

    public String getModelHDD() {
        return modelHDD;
    }

    public void setModelHDD(String modelHDD) {
        this.modelHDD = modelHDD;
    }

    public TypHDD getTypHDD() {
        return typHDD;
    }

    public void setTypHDD(TypHDD typHDD) {
        this.typHDD = typHDD;
    }

    public int getVolumeHardDisk() {
        return volumeHardDisk;
    }

    public void setVolumeHardDisk(int volumeHardDisk) {
        this.volumeHardDisk = volumeHardDisk;
    }

    public ManufacturerCountry getManufacturerCountry() {
        return manufacturerCountry;
    }

    public void setManufacturerCountry(ManufacturerCountry manufacturerCountry) {
        this.manufacturerCountry = manufacturerCountry;
    }

    @Override
    public String toString() {
        return "Hdd{" +
                "modelHDD='" + modelHDD + '\'' +
                ", typHDD=" + typHDD +
                ", volumeHardDisk=" + volumeHardDisk +
                ", manufacturerCountry=" + manufacturerCountry +
                '}';
    }
}
