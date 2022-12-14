package com.leftovers.order.order.exception;


import java.util.NoSuchElementException;

public class NoSuchOrderException extends NoSuchElementException {
    private final Integer id;

    public NoSuchOrderException(Integer id) {
        super("No order found with id = " + id);
        this.id = id;
    }
}