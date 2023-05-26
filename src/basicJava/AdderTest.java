package basicJava;

import basicJava.Adder;

public class AdderTest {
    public static void main(String[] args) {
        Adder adderobj = new Adder(10);

        Adder adderobj2 = new Adder(40,50);

        adderobj.sumandprintresult();
        adderobj2.sumandprintresult();

    }

}
