class Students{
    String name;
    int roll,marks;
}
class recrods{
    public static void main(String[] args) {
        
        Students s = new Students();
        s.name =  "tejas";
        s.roll = 001;
        s.marks = 45;
    
        Students s1 = new Students();
        s1.name =  "miraj";
        s1.roll = 002;
        s1.marks = 78;

        Students s2 = new Students();
        s2.name =  "cognac";
        s2.roll = 003;
        s2.marks = 73;

        Students std[] = new Students[3];  //defined array
        std[0] = s;
        std[1] = s1;
        std[2] = s2;

        for (int i = 0; i < std.length; i++) {
               System.out.println("Name = "+std[i].name +
               "\nRoll =  "+std[i].roll +
                "\nMarks = "+std[i].marks);            
                System.out.println();
        }
    }
}