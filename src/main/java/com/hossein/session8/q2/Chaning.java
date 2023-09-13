package com.hossein.session8.q2;

public class Chaning {
    public static void main(String[] args) {
        Consumer<String> f1 = (t) -> System.out.println(t);
        f1.accept("hello");

        Consumer<String> f2 = (t) -> System.out.println(t + " f2 ");
        f2.accept("Bye");

        f1.thenAccept(f2);


        Consumer<String> c3 = s ->
        {
            f1.accept(s);
            f2.accept(s);

        };
        c3.accept("Hello");
    }
}
