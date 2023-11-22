package com.lambarki.consumer;

import com.lambarki.comparator.Comparator;
import com.lambarki.model.User;

import java.util.function.Function;


public class Main {
    public static void main(String[] args) {

        User kylian = new User("Kylian", 20);
        User ngolo = new User("NGolo", 28);
        User blaise = new User("Blaise", 32);
        User frerebBaise = new User("Blaise", 28);


        //Function<User, String> getName = user -> user.getName();
        Function<User, String> getName = User::getName;
        Function<User, Integer> getAge = User::getAge;


        Comparator<User> cmp = Comparator.comparing(getName).thenComparing(Comparator.comparing(getAge));

        System.out.println("Kylian < NGolo : " + (cmp.compare(kylian,ngolo) < 0));
        System.out.println("Blaise < NGolo : " + (cmp.compare(blaise,ngolo) < 0));
        System.out.println("Blaise < NGolo : " + (cmp.compare(blaise,kylian) < 0));
        System.out.println("Frere de Blaise < Blaise : " + (cmp.compare(frerebBaise,blaise) < 0));
    }

}
