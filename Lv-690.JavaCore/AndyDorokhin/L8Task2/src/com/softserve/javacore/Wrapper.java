package com.softserve.javacore;

public class Wrapper<T extends Shape>{
    private T shape;

    public Wrapper(T shape) {
        this.shape = shape;
    }

    public void setShape(T shape) {
        this.shape = shape;
    }

    public T getShape() {
        return shape;
    }
}
