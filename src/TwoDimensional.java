public class TwoDimensional {
    public static void main(String[] args) {
        int [][]dim= new int[10][5];

        for (int i = 0; i < dim.length; i++) {
            for (int j = 0; j <dim[i].length ; j++) {
                System.out.print("row "+i+ " col "+j+" " );
            }
            System.out.println();
        }


        System.out.println();
        for (int i = 1; i <=12 ; i++) {
            for (int j = 1; j <=12 ; j++) {
                System.out.print(i*j+ "\t");
            }
            System.out.println();
        }


    }
}
