package com.hossein.session8.multipleInput;

import com.hossein.session8.compose.Function;

public class Currying {
    public static void main(String[] args) {
        Function<Integer, Function<Integer, Function<Integer, Integer>>> sumFunc = v -> w -> u -> v + w + u;
        Integer sum = sumFunc.apply(10).apply(20).apply(30);
        System.out.println(sum);

    }
}
