package com.assignment.assignment.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "counter")
public class Counter {

    private int counter;

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }
}
