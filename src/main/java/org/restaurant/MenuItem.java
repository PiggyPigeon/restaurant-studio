package org.restaurant;

import java.util.Date;
import java.util.Objects;
import java.util.Calendar;

public class MenuItem {
    private String name;
    private String description;
    private String category;
    private double price;
    private Date dateAdded;
    private Date dateUpdated;

    public MenuItem(String name, String description, double price, String category) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
        this.dateAdded = new Date();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        setDateUpdated();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
        setDateUpdated();
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
        setDateUpdated();
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
        this.dateUpdated = new Date();
    }

    public Date getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(Date dateAdded) {
        this.dateAdded = dateAdded;
    }

    public Date getDateUpdated() {
        return dateUpdated;
    }

    public void setDateUpdated() {
        this.dateUpdated = new Date();
    }

//  A way to tell if a menu item is new.
    public boolean isNew() {
        //determine what is "new". we're gonna say within 3 months (a season)
        // a variable as a new date subtracting 3 months
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.MONTH, -3);
        Date date3MonthsAgo = cal.getTime();
        //if it was added after 3 months ago, its new. if added before, it's false.
        if (this.dateAdded.after(date3MonthsAgo)) {
            return true;
        } else {
            return false;
        }
    }

}



