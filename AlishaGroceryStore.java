///*
//   Alisa Llavore
//   GroceryPairProgram
//*/
//public class AlishaGroceryStore implements GroceryList
//{
//
//    private GroceryItem front;
//    private int size;
//
//    public AlishaGroceryStore()
//    {
//        front=null;
//        size = 0;
//    }
//
//    /* Add the implementation for the GroceryList Inteface methods below */
//    public int size(){
//        return size;
//    }
//
//    public GroceryItem get(int index) {
//         /*
//         GroceryItem current = front;
//         for (int i = 0; i < index; i++)
//         {
//            current = current.next;
//		   }
//         return current;
//         */
//        return nodeAt(index);
//    }
//
//    public void set(int index, GroceryItem value) {
//        if(front != null){
//            GroceryItem current = front;
//            for(int i=0; i < index; i++)
//            {
//                current = current.next;
//            }  // end for
//            current.name = value.name;
//            current.price = value.price;
//        }
//    }
//
//    public String toString(){
//        if (front == null)
//            return "[ ]";
//        String result = "[" + front;
//        GroceryItem current = front.next;
//        while(current != null){
//            result  += ", " + current;
//            current = current.next;
//        }
//        result += "]";
//        return result;
//    }
//
//    //EXTRA CREDIT
//    public int indexOf(GroceryItem value){
//        int index = 0;
//        GroceryItem current = front;
//        while (current != null){
//            if (current == value)
//                return index;
//            index++;
//            current = current.next;
//        }
//        return -1;
//    }
//
//    public void add(GroceryItem value){
//        if(front == null){
//            front = value;
//        }else {
//            GroceryItem current = front;
//            while(current.next != null){
//                current = current.next;
//            }
//            current.next = value;
//        }
//        size++;
//    }
//
//    public void add(int index,GroceryItem value) {
//        if(index == 0){
//            GroceryItem current = front;
//            front = value;
//            front.next = current;
//        }else{
//            GroceryItem current = nodeAt(index-1);
//            value.next = current.next;
//            current.next = value;
//        }
//        size++;
//    }
//
//    public void remove(int index) {
//        if(front != null){
//            if(index == 0){
//                front = front.next;
//            }else {
//                GroceryItem current = front;
//                for (int i = 0; i < index-1; i++)
//                {
//                    current = current.next;
//                }
//                current.next = current.next.next;
//            }
//            size--;
//        }
//    }
//    private GroceryItem nodeAt(int index)
//    {
//        GroceryItem current = front;
//        for (int i = 0; i < index; i++)
//        {
//            current = current.next;
//        }
//        return current;
//    }
//
//}