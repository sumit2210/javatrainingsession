//Create interface called DatabaesConnection which will have below methods
//        connect method which will take string connection detail argument
//        disconnect method which will not take anything
//        fireQuery method which will take query and return string result
//        checkConnectionStatus method which will show the connectin status
//        (hint for this method, create boolean variable called isConnectionAlive and toggle it in connect
//        and disconnect method)
//        Create two child implementer of this interface, OracleDatabaesConnection, and SybaseDatabaseConnnection
//        and implement those methods.
package Abstract.interfaceconstruction.asgmnt;

public class OracleDatabaesConnection implements DatabaseConeection {

    boolean isConnectionAlive;


    @Override
    public void connect(String connection) {
        System.out.println("connecting");
        isConnectionAlive = true;
    }

//    @Override
//    public void disconnect(String dead) {
//        isConnectionAlive = false;
//    }

    @Override
    public void disconnect() {
        System.out.println("disconnecting");

        isConnectionAlive = false;
    }

    @Override
    public String firequery(String query) {
        if (isConnectionAlive) {
            return "result of your query";
        } else {
            return "you are not connected to database";
        }


//        @Override
//        public String checkconnectionStatus() {
//            if (isConnectionAlive) {
//                System.out.println("connection is alive");
//            } else {
//                System.out.println("connection is dead");
//            }
//
//        }

    }

    @Override
    public String checkconnectionStatus() {
        if (isConnectionAlive) {
            System.out.println("connection is alive");
        } else {
            System.out.println("connection is dead");
        }

        return null;
    }

    }





