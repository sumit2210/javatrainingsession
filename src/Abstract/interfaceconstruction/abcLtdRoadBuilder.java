package Abstract.interfaceconstruction;

public class abcLtdRoadBuilder implements RoadConstruction{

    private String roadSpec;
    private String location;
    private String vendor;
    private String name;

    public abcLtdRoadBuilder(String name){
        this.name = name;
    }
    @Override
    public String experience() {
        return "contructed 15 roads";
    }

    @Override
    public float budget() {
        return 500000.00f;
    }

    @Override
    public void takeRoadSpecs(String spec) {
        this.roadSpec=spec;
    }

    @Override
    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String getprogress() {
        return "partially completed";
    }

    @Override
    public String toString() {
        return "abcLtdRoadBuilder{" +
                "roadSpec='" + roadSpec + '\'' +
                ", location='" + location + '\'' +
                ", vendor='" + vendor + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
