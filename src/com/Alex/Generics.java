package com.Alex;

public class Generics<T> {
    // initiate data
    private T data;

    // set data
    public Generics(T data) {
        this.data = data;
    }

    // return data
    public T getData() {
        return this.data;
    }
}
