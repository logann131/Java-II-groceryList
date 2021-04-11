public class GroceryStore implements GroceryList
{

    private GroceryItem front;
    private int size;

    //construct an empty list
    public GroceryStore()
    {
        front=null;
        size = 0;
    }

    /* Add the implementation for the GroceryList Interface methods below */

    //create nodeAt method
    //helper methods are private
    private GroceryItem nodeAt(int index){
        GroceryItem current = front;
        for (int i=0; i<index; i++) {
            current = current.next;
        }
        return current;
    }

    // returns the current number of elements in the list
    public int size(){
        return size;
    }

    // returns the integer at the given index in the list
    public GroceryItem get(int index) {
        //make use of nodeAt method
        return nodeAt(index);
    }

    //void method modify groceryList value at the index
    public void set(int index, GroceryItem value) {
        if (front != null) {
            //make use of nodeAt method
            nodeAt(index).name = value.name;
            nodeAt(index).price = value.price;
        }

    }

    // creates a comma-separated, bracketed version of the list
    public String toString(){
        //two cases
        if (front == null) {
            return "[ ]";
        }
        String result = "[" +front.name;
        GroceryItem current = front.next;
        while (current != null) {
            result += ", "+current.name;
            current = current.next;
        }
        // current == null here
        result +="]";
        return result;
    }

    // returns the position of the first occurrence of the given
    // return -1 if not found
    public int indexOf(GroceryItem value){
        int index=0;
        GroceryItem current = front;
        while (current != null) {
            if (current.name.equals(value.name)) {
                return index;
            }
            index++;
            current = current.next;
        }

        return -1;
    }

    // appends the given value to the end of the list
    public void add(GroceryItem value){
        //two cases
        if (front == null) {
            //front is a node as well as value is a node
            front = value;
        } else {
            GroceryItem current = front;
            while (current.next != null) {
                current = current.next;
            }
            // current is on last node here
            current.next = value;
        }
        size++;
    }

    // pre: 0 <= index <= size()
    // post: inserts the given value at the given index
    public void add(int index,GroceryItem value) {
        if (index == 0) {
            // reset front to point to new node and next to point to "former" front
            front = new GroceryItem(value.name, value.price, front);
        } else {
            // place the current at the node BEFORE where you need to add
            GroceryItem current = nodeAt(index-1);
            current.next = new GroceryItem(value.name, value.price, current.next);
        }
        size++;
    }

    public void remove(int index) {

        if (front != null) {
            if (index == 0) {
                //reset front to front.next
                front = front.next;
            } else {
                //make use of nodeAt
                //stop at node before the one to remove
                GroceryItem current = nodeAt(index-1);
                current.next = current.next.next;
            }
        }

        //remember to decrement the size
        size--;

    }


}