package Abstract.interfaceconstruction.asgmnt;

public interface DatabaseConeection {
    public void connect(String connectionDetail);

    public void disconnect();
    public  String firequery(String query);

    public String checkconnectionStatus();

}
