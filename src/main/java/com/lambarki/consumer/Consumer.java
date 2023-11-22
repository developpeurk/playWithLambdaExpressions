package com.lambarki.consumer;

@FunctionalInterface
public interface Consumer <T>{
    void accept(T t);
}
