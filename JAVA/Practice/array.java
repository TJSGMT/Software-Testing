class array{
    public static void main(String[] args) {

        int num[][] = new int[3][4];
//        double numb =(int)Math.random()/100;
        int random = 0;

        for (int i = 0; i < 3; i++)  // represents row
        {

            for (int j = 0; j < 4; j++) // represenets column
            { 
                num[i][j] = (int)(Math.random() * 10); 
                System.out.print(num[i][j]+" ");
            }
            System.out.println();
        }



        // for (int i = 0; i < 3; i++)  // represents row
        // {

        //     for (int j = 0; j < 4; j++) // represenets column
        //     { 
        //         System.out.print(num[i][j]+" ");
        //     }
        //    System.out.println();
        // }
    }
}

