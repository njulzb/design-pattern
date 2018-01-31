package builder;

public class T410Builder implements ComputerBuilder {
    private T410 computer = new T410();
    @Override
    public void buildCpu() {
        this.computer.setCpu("i5-450");
    }

    @Override
    public void buildRam() {
        this.computer.setRam("4GB 1333Hz");
    }

    @Override
    public void buildHardDisk() {
        this.computer.setHardDisk("500GB 7200转");
    }

    @Override
    public void buildGraphicCard() {
        this.computer.setGraphicCard("Nvidia NVS 3100M");
    }

    @Override
    public void buildMonitor() {
        this.computer.setMonitor("14inches 1280*800");

    }

    @Override
    public void buildOs() {
        this.computer.setOs("Windows7");

    }

    @Override
    public Computer getResult() {
        return this.computer;
    }
}
