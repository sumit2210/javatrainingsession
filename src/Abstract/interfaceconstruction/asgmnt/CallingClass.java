package Abstract.interfaceconstruction.asgmnt;

public class CallingClass {
    public static void main(String[] args) {


        DatabaseConeection selectedDatabase = xyz();

        selectedDatabase.connect("it is connected to ");
        selectedDatabase.checkconnectionStatus();
//           String Oracleresult = selectedDatabase.firequery("connected");
//           System.out.println(Oracleresult);
        selectedDatabase.firequery("fire");
        String result = selectedDatabase.firequery("fire");
        System.out.println(result);


        selectedDatabase.disconnect();
        selectedDatabase.checkconnectionStatus();
        result = selectedDatabase.firequery("fire");
        System.out.println(result);
//            System.out.println(selectedDatabase.checkconnectionStatus());


    }


    private static DatabaseConeection xyz() {

        DatabaseConeection v1 = new OracleDatabaesConnection();

        return v1;
    }


}

