package com.mobile.mykotlinapp;

public class Bank {

    private String name;
    private String address;
    private int rating;

    public Bank(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        if (rating < 0) {
            this.rating = 0;
        } else {
            this.rating = rating;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Bank bank = (Bank) o;

        if (rating != bank.rating) return false;
        if (name != null ? !name.equals(bank.name) : bank.name != null) return false;
        return address != null ? address.equals(bank.address) : bank.address == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + rating;
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Bank{");
        sb.append("name='").append(name).append('\'');
        sb.append(", address='").append(address).append('\'');
        sb.append(", rating=").append(rating);
        sb.append('}');
        return sb.toString();
    }

    public void showAddress(String newAddress) {
        System.out.println(newAddress);
    }
}
