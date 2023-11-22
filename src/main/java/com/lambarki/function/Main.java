package com.lambarki.function;
import com.lambarki.function.function.*;
public class Main {
    public static void main(String[] args) {
        Consumer<String> c1 = s-> System.out.println("c1 = " + s);
        Consumer<String> c2 = s-> System.out.println("c2 = " + s);
//        Consumer<String> c3 = s->{
//            c1.accept(s);
//            c2.accept(s);
//        };

        Consumer<String> c3 =  c1.andThen(c2);
        c3.accept("Bonjour");
        System.out.println("Sortie de main");

    }
}
