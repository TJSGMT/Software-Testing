import java.util.*;
class problem{
    
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(44,77,55,77,88)); 
        System.out.println(list);

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