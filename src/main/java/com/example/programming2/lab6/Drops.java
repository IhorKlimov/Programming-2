package com.example.programming2.lab6;

public class Drops extends Drug {

    public Drops(String title, int amount, String directions, String sideEffects) {
        super(title, amount, directions, sideEffects);
    }

    @Override
    public boolean use() {
        return true;
    }
}
