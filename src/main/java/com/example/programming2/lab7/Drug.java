package com.example.programming2.lab7;


import java.util.Objects;

public abstract class Drug {
    private String title;
    private int amount;
    private String directions;
    private String sideEffects;

    public Drug(String title, int amount, String directions, String sideEffects) {
        this.title = title;
        this.amount = amount;
        this.directions = directions;
        this.sideEffects = sideEffects;
    }

    /**
     * @return result of the use. True - success, false - not.
     */
    public abstract boolean use();

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Drug drug = (Drug) o;
        return title.equals(drug.title) &&
                amount == drug.amount &&
                Objects.equals(directions, drug.directions) &&
                Objects.equals(sideEffects, drug.sideEffects);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, amount, directions, sideEffects);
    }

    public String getTitle() {
        return title;
    }

    public int getAmount() {
        return amount;
    }

    public String getDirections() {
        return directions;
    }

    public String getSideEffects() {
        return sideEffects;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setDirections(String directions) {
        this.directions = directions;
    }

    public void setSideEffects(String sideEffects) {
        this.sideEffects = sideEffects;
    }

    @Override
    public String toString() {
        return "Drug{" +
                "title='" + title + '\'' +
                ", amount=" + amount +
                ", directions='" + directions + '\'' +
                ", sideEffects='" + sideEffects + '\'' +
                '}';
    }
}



