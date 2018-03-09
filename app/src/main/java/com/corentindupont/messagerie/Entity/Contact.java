package com.corentindupont.messagerie.Entity;

/**
 * Created by Corentin on 08/03/2018.
 */

public class Contact {

    private String firstName;
    private String lastName;

    public Contact(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getInitials(){
        return firstName.substring(0, 1).toUpperCase()+lastName.substring(0, 1).toUpperCase();
    }

    public String getFullName(){
        return firstName+' '+lastName;
    }
}
