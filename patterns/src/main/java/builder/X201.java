package builder;

public class X201 extends Computer {
    public X201() {
        this.setType("ThinkPad X201");
    }


    public String toString(){
        return String.format("型号:\t%s\n" +
                        "CPU:\t%s\n" +
                        "内存:\t%s\n" +
                        "硬盘:\t%s\n" +
                        "显示器:\t%s\n" +
                        "操作系统:\t%s\n",
                this.getType(),this.getCpu(),this.getRam(),this.getHardDisk(),this.getMonitor(),this.getOs());
    }
}
