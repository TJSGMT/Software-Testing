import pkg.Advcalc;
import pkg.calc;  // imported from the pkg package (folder) which is outside the pkg folder 

public class pkg_main{

    public static void main(String[] args) {
        calc obj = new calc();
        Advcalc obj1 = new Advcalc();

        System.out.println(obj.add(8, 9));
        System.out.println( obj.sub(40, 60));
        System.out.println(obj1.multi(4, 5));
        System.out.println(obj1.div(40, 6));

    }

}
    /*every java file have java.lang package already imported even not explicitly imported it
    with * you can only access files not folders */