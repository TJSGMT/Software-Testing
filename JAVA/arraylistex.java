import java.util.*;

class arraylistex{
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("tjs","gmt","tjs","cog","nac")); 
        System.out.println(list);

    // Traversing
        for (String s:list){
            if(s.equals("gmt"))
            {
                //System.out.println(s);
                continue;
            }
            else
            {
                System.out.println(s);
            }
        }

    // Traversing list through iterator
        Iterator it= list.iterator();
        while(it.hasNext())
        {
            String s1 = (String)it.next();
            if(s1.equalsIgnoreCase("tjs")){
                System.out.println("list through iterator "+s1);
            }
        }

    // traversiong list through Listiterator
        ListIterator lit = list.listIterator();
        System.out.println("listiteratorForward....");
        while(lit.hasNext())
        {
            System.out.println(lit.next());
        }      

    // Previous
       // ListIterator lits = list.listIterator();
        System.out.println("listiterator Backword....");
        while(lit.hasPrevious())
        {
            System.out.println(lit.previous());
        }       

    }
}
