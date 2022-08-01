import java.util.Iterator;

// Singly linked list data structure (also called "linked list"). Uses Iterators.
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
    // adds the kth element to the linked list
    public void add(int k, Item item) 
    {
        int i = 0;   // first element
        for(Node trav = first; trav != null; trav = trav.next)
        {// goes to the node before the kth node
            if(i == k - 1)
            {
                Node before = trav;
                Node after = trav.next;

                // creates new kth node
                trav = new Node();
                trav.item = item;

                before.next = trav;
                trav.next = after;
                N++;
            }
            i++;
        }
    }

    // Write a method delete() that takes an int argument k 
    // and deletes the kth element in a linked list, if it exists.
    public Item remove(int k)
    {
        int i = 0; // starts at element one
        for(Node trav = first; trav != null; trav = trav.next)
        {// goes to node before the kth node.        
            if(i == k - 1)
            {
                Node before = trav;
                Node after = trav.next.next;   //skips the node to remove

                Item item = trav.next.item;
                System.out.println(item);

                before.next = after;
                N--;


                return item;
            }
            i++;
        }
        return null;
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
        for(String item : linkedString)
        {
            System.out.println(item);
        } 
  }

}
