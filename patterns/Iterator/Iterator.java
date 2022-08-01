import java.util.Iterator;

// Singly linked list data structure (also called "linked list"). Uses Iterators.
// To see iterator design pattern, only look at code with words that say Iterable or Iterator.
public class LinkedList<Item> implements Iterable<Item> {

    private Node first = null;
    private Node last = null;
    private int N = 0;
    
    private class Node 
    {
        public Item item = null;
        public Node next = null;
    }   

    public Node getLast() {
        return last;
    }
    
    public Item getLastItem() {
        return last.item;
    }
    
    public void append(Item item)
    {
        Node oldLast = last;    
        last = new Node();
        last.item = item;  
        last.next = null;
        if(isEmpty()) first = last;
        else oldLast.next = last;
        N++;
        //        System.out.println(item);
    }

    public boolean isEmpty() 
    {
        return first == null;
    }

    public Iterator<Item> iterator()
    {
        return new ListIterator();
    }

    private class ListIterator implements Iterator<Item>
    {
        private Node current = null;
        public ListIterator()
        {

            if(isEmpty())
                current = null;
            else
                current = first;
        }

        public boolean hasNext()
        {
            return current != null;
        }

        public Item next()
        {
            Item item = current.item;
            current = current.next;

            return item;
        }

        public void remove() { }
    }
  
  public static void main(String[] args) {
        // Is iterable because of iterator design pattern. Can use the iterator while loop instead.
        LinkedList<String>() list = new LinkedList<String>();
        for(String item : linkedString)
        {
            System.out.println(item);
        } 
  }

}
