package com.hossein.session8.q1;

public class HigherOrderFunction {
    public static void main(String[] args) {
        IFactory<Integer> out = createFactory(() -> Math.random() * 1000, (t) -> t.intValue());
        System.out.println(out.create());
    }

    public static <T, R> IFactory<R> createFactory(IProducer<T> iproducer, IConfigurator<T, R> iConfigurator) {
        return () -> {
            T product = iproducer.produce();
            return iConfigurator.configure(product);
        };
    }
}
