package com.example.demo.model;

import java.util.ArrayList;

public class User {

    private long id;
    private String firstName;
    private String lastName;
    private ArrayList<Book> loans;
    private ArrayList<Book> reservations;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public ArrayList<Book> getLoans() {
        return loans;
    }

    public void setLoans(ArrayList<Book> loans) {
        this.loans = loans;
    }

    public ArrayList<Book> getReservations() {
        return reservations;
    }

    public void setReservations(ArrayList<Book> reservations) {
        this.reservations = reservations;
    }

    @Override
    public boolean equals(Object object) {
        // If the object is compared with itself then return true
        if (object == this) {
            return true;
        }

        // Check if o is an instance of User or not
        // "null instanceof [type]" also returns false
        if (!(object instanceof User)) {
            return false;
        }

        // typecast object to User so that we can compare data members
        User user = (User) object;

        // Compare the data members and return accordingly
        return (this.getId() == ((User) object).getId() &&
                this.getFirstName().equals(((User) object).getFirstName()) &&
                this.getLastName().equals(((User) object).getLastName()) &&
                this.getLoans() == ((User) object).getLoans() &&
                this.getReservations() == ((User) object).getReservations());
    }
}
