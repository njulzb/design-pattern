package builder;

public class X201Builder implements ComputerBuilder {
    private X201 computer  = new X201();
    @Override
    public void buildCpu() {
        this.computer.setCpu("i3-350");
    }

    @Override
    public void buildRam() {
        this.computer.setRam("2GB 1333Hz");
    }

    @Override
    public void buildHardDisk() {
        this.computer.setHardDisk("250GB 5400转");
    }

    @Override
    public void buildGraphicCard() {
        return;
    }

    @Override
    public void buildMonitor() {
        this.computer.setMonitor("12inches 1280*800");
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
