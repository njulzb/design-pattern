package builder;

public class ComputerDirector {
    private ComputerBuilder builder ;

    public T410 constructT410(){
        this.builder = new T410Builder();
        this.builder.buildCpu();
        this.builder.buildRam();
        this.builder.buildHardDisk();
        this.builder.buildGraphicCard();
        this.builder.buildMonitor();
        this.builder.buildOs();
        return (T410) this.builder.getResult();
    }

    public X201 constructX201(){
        this.builder = new X201Builder();
        this.builder.buildCpu();
        this.builder.buildRam();
        this.builder.buildHardDisk();
        this.builder.buildMonitor();
        this.builder.buildOs();
        return (X201) this.builder.getResult();
    }

}
