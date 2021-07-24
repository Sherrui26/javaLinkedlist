
public class myLinked {
    Node first, last,current ;
   
    public myLinked(){
        
    }
    
    public void insertAtFront(Object insertItem){
        
    Node newNode = new Node(insertItem);
    if( first == null ){ 
        first = newNode;
        last = newNode;
    }else
    {
        newNode.next = first;
        first = newNode;
    }
  }
    
    public Object removeFromFront(){
        Object removeItem = null;
    if (first == null){
          return removeItem;
      }
      removeItem = first.data;
    if ( first == last){
        first = null;
        last = null;
      }else
        first = first.next;
    return removeItem;
}
    
    public void insertAtBack(Object insertItem){

    Node newNode = new Node(insertItem);
    if (first == null){ 
        first = newNode;
        last = newNode;
    }else
    {
        last.next = newNode;
        last = newNode;
    }
  }
    
    public Object removeFromBack(){
        Object removeItem = null;
      if (first == null){
          return removeItem;
      }
    removeItem = last.data;
      
      if ( first == last){
          first = null;
          last = null;
      }else
      {
          current = first;
        while (current.next != last)
            current = current.next;
            last = current;
            last.next = null;
      }
      return removeItem;
}
    
    public Object getFirst(){
        if (first == null)
            return null;
        else{
            current = first;
            return current.data;
        }
    }
    
    public Object getNext(){
        if (current == last)
            return null;
        else{
            current = current.next;
            return current.data;
        }
    }
}
