package org.restaurant;

import java.time.LocalDate;
import java.util.ArrayList;


public class Menu {

    private ArrayList<MenuItem> menuItems = new ArrayList<>();
    public LocalDate lastUpdated;

    @Override
    public String toString() {
        StringBuilder appetizers = new StringBuilder();
        for (MenuItem item : menuItems) {
            if (item.getCategory().equals("appetizer")) {
                appetizers.append("\n" + item.toString() + "\n");
            }
        }
        StringBuilder mainCourses = new StringBuilder();
        for (MenuItem item : menuItems) {
            if (item.getCategory().equals("main course")) {
                mainCourses.append("\n" + item.toString() + "\n");
            }
        }
        StringBuilder desserts = new StringBuilder();
        for (MenuItem item : menuItems) {
            if (item.getCategory().equals("dessert")) {
                desserts.append("\n" + item.toString() + "\n");
            }
        }
        return "\nTONY's PIZZA MENU\n" +
                "APPETIZERS" + appetizers.toString() +
                "\n" + "MAIN COURSES" + mainCourses.toString()
                + "\n" + "DESSERTS" + desserts.toString() + "\n";
    }

    //    A way to add and remove menu items from the menu.
    void addMenuItem(MenuItem newItem) {
        String message = "That item already exists.";
        if (menuItems.contains(newItem)) {
            System.out.println(message);
            return;
        }
        for (MenuItem item : menuItems) {
            if (item.equals(newItem)) {
                System.out.println(message);
                return;
            }
        }
        menuItems.add(newItem);
        lastUpdated = LocalDate.now();
    }

    void removeMenuItem(MenuItem item) {
        menuItems.remove(item);
        lastUpdated = LocalDate.now();
    }

    //getters and setters
    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }
}





    // A way to determine whether or not two menu items are equal.
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Menu menu = (Menu) o;
//        return menuItems.equals(menu.menuItems);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(menuItems);
//    }
//
//    //a way to print the entire menu
//    public void printMenu() {
//        for (MenuItem item : menuItems) {
//            System.out.println(item.getName() + " " + item.getDescription() + " - $" + item.getPrice());
//        }
//
//    }
//
//    // A way to print out both a single menu item
//    public void printMenuItem(String name) {
//        boolean found = false;
//        for (MenuItem item : menuItems) {
//            //will equals() work here or does it need an object arg??
//            if (item.getName().equals(name)) {
//                System.out.println(item.getName() + " " + item.getDescription() + " - $" + item.getPrice());
//                found = true;
//                break;
//            }
//        }
//        if (!found) {
//            System.out.println("Item not found!");
//        }
//    }



// //    A way to add and remove menu items from the menu. Using addItem and removeItem in the Menu class

//        A way to tell if a menu item is new. - > menuItem class, using boolean isNew
//
//        A way to tell when the menu was last updated. -> menuItem class
//
//        A way to print out both a single menu item as well as the entire menu.
//
//        A way to determine whether or not two menu items are equal. - in Menu class