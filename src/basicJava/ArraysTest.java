package basicJava;

public class ArraysTest {
    // Array is consecutive memory location

    public static void main(String[] args){

        // 1dimension
        int i[] = new int[10];
        int j[] = {1, 2, 3, 4, 5};


        // 2 dimensionl
        int i_2d[][] = new int[10][5];
        int[][] j_2d =
                {
                        {
                                1, 2, 3, 4, 5
                        },
                        {
                                6, 7, 8, 9, 10
                        }
                };

        //3 dimensional
        int i_3d[][][] = new int[10][5][4];
        int[][][] j_3d = {{{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}}, {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}}};


    }
}

