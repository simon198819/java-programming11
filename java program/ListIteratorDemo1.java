import java.util.*;
class ListIteratorDemo1
{
    public static void main(String[]args)
    {
        LinkedList l=new LinkedList();
        l.add("balakrishna");
        l.add("Venky");
        l.add("Chiru");
        l.add("Nag");
        System.out.println(l);
        ListIterator ltr=l.ListIterator();
        while(ltr.hasNext())
        {
            String s=(String)ltr.next();
            if(s.equals("Venky"))
            {
                ltr.remove();
            }
            else if(s.equals("Nag"))
            {
            ltr.add("Chaithu");
        }
        else if(s.equals("Chiru"))
        {
            ltr.set("Charan");
            System.out.println(l);
        }
    }
}
}

