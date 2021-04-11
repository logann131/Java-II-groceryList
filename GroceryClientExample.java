/* Nam Phu Nguyen (Logan)
   IT220-JAVA II 
   Programing Assignment
 */ 
public class GroceryClientExample {
    public static void main(String[] args){
        //create new list
        GroceryStore list = new GroceryStore();
        list.add(new GroceryItem("apples", 2.99));
        list.add(new GroceryItem("banana", 1.99));
        list.add(new GroceryItem("bacon", 8.99));
        list.add(new GroceryItem("sour cream", 3.99));
        System.out.println(list);

        //test size
        System.out.println(list.size());


        //test get at first index
        System.out.println(list.get(0));
        //test get at last index
        System.out.println(list.get(list.size()-1));


        //test set at first index
        list.set(0, new GroceryItem("aspirin", 1.00));
        System.out.println(list);
        // test set at last index
        list.set(list.size()-1, new GroceryItem("aspirin", 1.00));
        System.out.println(list);


        // test indexOf
        System.out.println(list.indexOf(new GroceryItem("milk",2.99)));
        System.out.println(list.indexOf(new GroceryItem("bacon ",8.99))); //indexOf banana should return 1
                                                                                      //your output: -1


        //test add at first index
        list.add(0,new GroceryItem("coffee", 9.99));
        System.out.println(list);
        // test add at second index
        list.add(2,new GroceryItem("coffee", 9.99));
        System.out.println(list);
        // test add at last index
        list.add(list.size()-1,new GroceryItem("sprite", 4.99)); //fail here. sprite should be added
                                                                                // after the last item, aspirin
        System.out.println(list);


        //test remove at first index
        list.remove(0);
        System.out.println(list);
        // test remove at last index
        list.remove(list.size()-1);
        System.out.println(list);


    }
}
