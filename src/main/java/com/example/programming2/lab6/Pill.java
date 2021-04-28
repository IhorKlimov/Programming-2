package com.example.programming2.lab6;

public class Pill extends Drug {

    public Pill(String title, int amount, String directions, String sideEffects) {
        super(title, amount, directions, sideEffects);
    }

    /**
     * Crushes pill into small pieces
     */
    public void crush() {
        // ...
    }

    @Override
    public boolean use() {
        return true;
    }
}