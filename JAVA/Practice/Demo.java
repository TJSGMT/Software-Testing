class Demo{
    public static void main(String[] args) {
        int a = 45;
        int b = 12;
        int x = 66;
        int y = 88;
        // this program is for logical operators and some new knowledge purpose
        boolean result = a>b && x>y ;
        boolean results = a>b || x<y ;
        boolean resultss = b > a;
        System.out.println(result);
        System.out.println(results);
        System.out.println(!resultss);
    }
}