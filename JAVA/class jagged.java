class jagged
{
    public static void main(String args[])
    {
            int b[][] = new int[3][];
            b[0]= new int[]{57,81};
            b[1]= new int[]{75,89,88};
            b[2]= new int[]{67,79,77};
            
            for (int i=0;i<b.length;i++)
            {
                for(int j=0;j<b[i].length;j++)
                {
                    b[i][j] = 2*i+1+j-1*2;
                    System.out.print(b[i][j] + " ");
                }    
                System.out.println("");
            }
    }
}