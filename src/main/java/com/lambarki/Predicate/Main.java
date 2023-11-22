package com.lambarki.Predicate;

public class Main {
    public static void main(String[] args) {
        Predicate<String> p1 = s-> s != null;
        Predicate<String> p2 = s-> s.isEmpty();

        //Predicate<String> notP2 = p2.negate();
        Predicate<String> p3 = p1.and(p2.negate());

        System.out.println("p3 est false pour une chaine nulle: " + p3.test(null));
        System.out.println("p3 est false pour une chaine vide: " + p3.test(""));
        System.out.println("p3 est true pour une chaine non nulle et non vide : " + p3.test("Bonjour"));
    }
}
