import java.util.*;

public class testLinked {
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
        System.out.print("These numbers added successfully: ");
        a.display();
        
        //3. remove from back
        a.removeFromBack();
        
        //4. display your list
        System.out.println("");
        a.display();
        System.out.println("Number from back has been removed\n");
        
        //5. insert at back 678
        a.insertAtBack(6);
        a.insertAtBack(7);
        a.insertAtBack(8);
        System.out.println("Number 6,7,8 added to the list");
        
        //6. display your list
        a.display();
        System.out.println("");
        
        //7. remove from front (2 times)
        for(int i=0;i<2;i++){
            System.out.println(a.removeFromFront()+" was deleted");
        }
        System.out.println("\n2 Numbers from front deleted(5,4)");
        
        //8. remove from back(2 times)
        a.removeFromBack();
        a.removeFromBack();
        System.out.println("\n2 Numbers at back deleted(7,8)\n");
        
        //9 display your list
        a.display();
    }
}
