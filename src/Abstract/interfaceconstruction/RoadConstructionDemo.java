package Abstract.interfaceconstruction;

public class RoadConstructionDemo {
    public static void main(String[] args) {
        RoadConstruction selectedVender = releaseTenderAndSelectContractor();

        String experience = selectedVender.experience();
        System.out.println("Experience is "+ experience);

        float budget = selectedVender.budget();
        System.out.println("Budget is "+budget);

        selectedVender.setLocation("location");
        selectedVender.takeRoadSpecs("length=8km, width = 15ft");

        System.out.println(selectedVender.toString());

    }

    private static RoadConstruction releaseTenderAndSelectContractor(){
        RoadConstruction vender1 = new abcLtdRoadBuilder("ABC limited");

        return vender1;
    }
}
