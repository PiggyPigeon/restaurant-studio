package org.restaurant;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Objects;
import java.util.Calendar;

public class MenuItem {
    private String name;
    private String description;
    private String category;
    private double price;
    private LocalDate dateAdded;
    //private Date dateUpdated;

    public MenuItem(String name, String description, double price, String category) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
        this.dateAdded = LocalDate.now();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        //setDateUpdated();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
        //setDateUpdated();
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
        //setDateUpdated();
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
        //this.dateUpdated = new Date();
    }

    public LocalDate getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(LocalDate dateAdded) {
        this.dateAdded = dateAdded;
    }

    //public LocalDate getDateUpdated() {
    //    return dateUpdated;
    //}

    //public void setDateUpdated() {
    //    this.dateUpdated = new Date();
    //}

    //add category to below?
    @Override
    public String toString(){
        String newText = isNew() ? " - NEW!" : "";
        return name + newText + '\n' +
                description + " | $" + price;
    }

    @Override
    public boolean equals(Object toBeCompared) {
        if (this == toBeCompared) {
            return true;
        }
        if (toBeCompared == null) {
            return false;
        }
        if (getClass() != toBeCompared.getClass()) {
            return false;
        }

        MenuItem otherItem = (MenuItem) toBeCompared;
        return this.name.equals(otherItem.getName());
    }

//  A way to tell if a menu item is new.
    public boolean isNew() {
        LocalDate today = LocalDate.now();
        double daysBetween = dateAdded.until(today, ChronoUnit.DAYS);
        System.out.println(daysBetween + " days since " + name + " was added");
        return daysBetween < 90;
    }

}



