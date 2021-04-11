public class GroceryClient {
    public static void main(String[] args){
        GroceryStore groceryList = new GroceryStore();

        //instantiate GroceryItem values
        GroceryItem milk = new GroceryItem("milk", 2.98);
        GroceryItem eggs = new GroceryItem("eggs", 1.99);
        GroceryItem beef = new GroceryItem("beef", 6.56);
        GroceryItem pork = new GroceryItem("pork", 5.53);
        GroceryItem veggie = new GroceryItem("veggie", 3.21);
        GroceryItem coffee = new GroceryItem("coffee", 9.49);
        GroceryItem rice = new GroceryItem("rice", 11.25);
        GroceryItem shrimp = new GroceryItem("shrimp", 11.25);

        //test add(value) method
        groceryList.add(milk);
        groceryList.add(beef);
        groceryList.add(eggs);
        groceryList.add(pork);
        groceryList.add(veggie);


        System.out.println("Grocery List 1 original list: "+groceryList);  //test .toString method
        System.out.println("Grocery List 1 original list's size: "+groceryList.size()); //test .size() method
        System.out.println(groceryList.get(2));  //test .get(index) method
        System.out.println(groceryList.get(4));
        System.out.println("Index of pork is: "+groceryList.indexOf(pork));  //test .indexOf(value) method when value is found
        System.out.println("Index of coffee is: "+groceryList.indexOf(coffee)+". Not Found!"); //test .indexOf(value) method when value is not found
        System.out.println();

        //test .set(index, value) method
        groceryList.set(3, veggie);
        System.out.println("Grocery List 2 after set veggie at index 3: "+groceryList);
        System.out.println();

        //test add(index, value) at index = 0
        groceryList.add(0, rice);
        System.out.println("Grocery List 3 after added rice at index 0: "+groceryList);
        //test add(index, value) at index != 0
        groceryList.add(2, shrimp);
        System.out.println("Grocery List 3 after added shrimp at index 2: "+groceryList);
        System.out.println();

        //test .remove(index) method at index != 0
        groceryList.remove(5);
        System.out.println("Grocery List 4 after removed veggie at index 5: "+groceryList);
        //test .remove(index) method at index != 0
        groceryList.remove(0);
        System.out.println("Grocery List 4 after removed rice at index 0: "+groceryList);
        System.out.println("Grocery List 4's size: "+groceryList.size());




    }
}
