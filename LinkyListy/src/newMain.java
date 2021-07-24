import java.util.*;

public class newMain {
    public static void main(String[] args){
        
/*
1. Insert at front 1,2,3,4,5
2. Display your list
3. remove from back
4. display your list
5. insert at back 678
6. display your list
7. remove from front (2 times)
8. remove from back(2 times)
9 display your list*/

LinkedList a = new LinkedList();

        //1. Insert at front 1,2,3,4,5
        a.insertAtFront(1);
        a.insertAtFront(2);
        a.insertAtFront(3);
        a.insertAtFront(4);
        a.insertAtFront(5);
        
        //2. Display your list
        System.out.print(a.getFirst());
        Integer r = (Integer) a.getNext();
        while (r != null) {
            System.out.print(" "+r);
            r = (Integer) a.getNext();
        }
        System.out.println(" added to list.");

        //3. remove from back
        a.removeFromBack();
        
        //4. display your list
        System.out.println("");
        System.out.print(a.getFirst());
        r = (Integer) a.getNext();
        while (r != null) {
            System.out.print(" "+r);
            r = (Integer) a.getNext();
        }
        System.out.println("\nNumber from back has been removed");

        //5. insert at back 678
        a.insertAtBack(6);
        a.insertAtBack(7);
        a.insertAtBack(8);
        System.out.println("\nNumber 6,7,8 added to the list");
        
        //6. display your list
        System.out.print(a.getFirst());
        r = (Integer) a.getNext();
        while (r != null) {
            System.out.print(" "+r);
            r = (Integer) a.getNext();
        }
       System.out.println("\n");
        
        //7. remove from front (2 times)
        for(int i=0;i<2;i++){
            System.out.println(a.removeFromFront()+" was deleted");
        }
        System.out.println("2 Numbers from front deleted(5,4)");
        
        //8. remove from back(2 times)
        a.removeFromBack();
        a.removeFromBack();
        System.out.println("2 Numbers at back deleted(7,8)\n");
        
        //9 display your list
        System.out.print(a.getFirst());
        r = (Integer) a.getNext();
        while (r != null) {
            System.out.print(" "+r);
            r = (Integer) a.getNext();
        }
        System.out.println("");
    }
}
