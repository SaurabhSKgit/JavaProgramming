import java.util.*;
class LinkedListEx{
    public static void main(String[] args) {
        LinkedList <Integer> ll=new LinkedList<>();
        ll.add(11);
        ll.add(21);
        ll.add(1);
        ll.add(151);
        ll.add(121);
        ll.add(151);
        ll.add(151);


        System.out.println(ll);
        System.out.println(ll.getLast());//151
        System.out.println(ll.getFirst());//11

        ll.removeFirst();
        System.out.println(ll);

        ll.removeLast();
        System.out.println(ll);
        
        ll.addFirst(1);
        System.out.println(ll);

        ll.addLast(9);
        System.out.println(ll);

        ll.removeFirstOccurrence(151);
        System.out.println(ll);

        ll.removeLastOccurrence(1);
        System.out.println(ll);


    }
}