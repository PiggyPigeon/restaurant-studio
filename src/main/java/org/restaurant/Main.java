package org.restaurant;

public class Main {
    public static void main(String[] args) {
        MenuItem item1 = new MenuItem("Pepperoni Pizza", "The classic slice, hot and delicious!", 7.39, "main course");
        MenuItem item2 = new MenuItem("Toasted Ravioli", "A St. Louis favorite, served with a size of pizza sauce", 6.89, "appetizer");
        MenuItem item3 = new MenuItem("Chocolate Cake", "Rich, moist cake with dark chocolate cream cheese frosting", 4.99, "dessert");
        MenuItem item4 = new MenuItem("Veggie Pizza", "Peppers, onions, mushrooms, olives, and tomatoes make a delicious combo", 6.39, "main course");
        MenuItem item5 = new MenuItem("Garlic Bread Sticks", "Hot, garlicky carbs FTW", 4.59, "appetizer");

        Menu menu = new Menu();
//why is this printing out as per the isNew() method??
        menu.addMenuItem(item1);
        menu.addMenuItem(item2);
        menu.addMenuItem(item3);
        menu.addMenuItem(item4);
        menu.addMenuItem(item5);

        //print entire menu
        System.out.println(menu);
        //print single item
        System.out.println(item1);

        //remove an item and reprint the menu
        menu.removeMenuItem(item3);
        System.out.println(menu);

        System.out.println(item1.equals(item2));




    }
}