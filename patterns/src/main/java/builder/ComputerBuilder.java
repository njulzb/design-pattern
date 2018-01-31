package builder;

public interface ComputerBuilder {
    void buildCpu();
    void buildRam();
    void buildHardDisk();
    void buildGraphicCard();
    void buildMonitor();
    void buildOs();

    Computer getResult();
}
