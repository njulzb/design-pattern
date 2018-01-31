package builder;

public class T410 extends Computer {
    private String graphicCard;

    public  T410(){
        this.setType("ThinkPad T410");
    }

    public String getGraphicCard() {
        return graphicCard;
    }

    public void setGraphicCard(String graphicCard) {
        this.graphicCard = graphicCard;
    }

    public String toString(){
        return String.format("型号:\t%s\n" +
                "CPU:\t%s\n" +
                "内存:\t%s\n" +
                "硬盘:\t%s\n" +
                "显卡:\t%s\n" +
                "显示器:\t%s\n" +
                "操作系统:\t%s\n",
        this.getType(),this.getCpu(),this.getRam(),this.getHardDisk(),this.getGraphicCard(),this.getMonitor(),this.getOs());
    }
}
