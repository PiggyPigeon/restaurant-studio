package org.restaurant;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Menu {
    private ArrayList<MenuItem> menuItems;
    private LocalDateTime whenUpdated;

    public Menu(){
        this.menuItems = new ArrayList<>();
        this.whenUpdated =  LocalDateTime.now();
    }
    public void addMenuItem(MenuItem item) {
        menuItems.add(item);
    }
    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }
    public void setMenuItems(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }
    public LocalDateTime getWhenUpdated() {
        return whenUpdated;
    }
    public void setWhenUpdated(LocalDateTime whenUpdated) {
        this.whenUpdated = whenUpdated;
    }


}
