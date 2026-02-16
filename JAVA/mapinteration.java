
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

class mapinteration{
    public static void main(String[] args) {
       Map<Integer,String> m = new LinkedHashMap<>();
        m.put(001,"gmt");
        m.put(001,"tjs");
        m.put(007,"gmt");
        m.put(005,"sore");
        System.out.println(m);

        Set s = m.entrySet();
        Iterator it = s.iterator();
        while(it.hasNext()){
            Map.Entry me = (Map.Entry)it.next();
            System.out.print(me.getKey());
            System.out.println(me.getValue());  
        }
    }
}