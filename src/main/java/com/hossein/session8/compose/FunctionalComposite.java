package com.hossein.session8.compose;

public class FunctionalComposite {
    public static void main(String[] args) {
        Function<Squire, Integer> func1 = (s) -> s.getArea();
        Function<Integer, Double> func2 = (t) -> Math.sqrt(t);

        Squire s = new Squire();
        s.setArea(10);

        Double getSide = func2.apply(func1.apply(s));
        System.out.println(getSide);
    }
}
