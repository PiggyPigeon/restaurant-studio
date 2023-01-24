package org.restaurant;

import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

public class Menu {

    private ArrayList<MenuItem> menuItems = new ArrayList<>();
    private Date lastUpdated;


    //    A way to add and remove menu items from the menu.
    public void addMenuItem(MenuItem item) {
        menuItems.add(item);
    }

    public void removeMenuItem(MenuItem item) {
        menuItems.remove(item);
    }

    //getters and setters
    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }


    // A way to determine whether or not two menu items are equal.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Menu menu = (Menu) o;
        return menuItems.equals(menu.menuItems);
    }

    @Override
    public int hashCode() {
        return Objects.hash(menuItems);
    }

    //a way to print the entire menu
    public void printMenu() {
        for (MenuItem item : menuItems) {
            System.out.println(item.getName() + " " + item.getDescription() + " - $" + item.getPrice());
        }

    }

//    public void printMenuItem(int index) {
//        if (index < 0 || index >= menuItems.size()) {
//            System.out.println("Invalid index!");
//            return;
//        }
//        MenuItem item = menuItems.get(index);
//        System.out.println(item.getName() + " - $" + item.getPrice());
//    }

//    public void printMenuItem(String name) {
//        boolean found = false;
//        for (MenuItem item : menuItems) {
//            if (item.getName().equals(name)) {
//                System.out.println(item.getName() + " - $" + item.getPrice());
//                found = true;
//                break;
//            }
//        }
//        if (!found) {
//            System.out.println("Item not found!");
//        }
//    }

    // A way to print out both a single menu item
    public void printMenuItem(String name) {
        boolean found = false;
        for (MenuItem item : menuItems) {
            //will equals() work here or does it need an object arg??
            if (item.getName().equals(name)) {
                System.out.println(item.getName() + " " + item.getDescription() + " - $" + item.getPrice());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Item not found!");
        }
    }
}



// //    A way to add and remove menu items from the menu. Using addItem and removeItem in the Menu class

//        A way to tell if a menu item is new. - > menuItem class, using boolean isNew
//
//        A way to tell when the menu was last updated. -> menuItem class
//
//        A way to print out both a single menu item as well as the entire menu.
//
//        A way to determine whether or not two menu items are equal. - in Menu class