package org.junit;

import java.util.stream.DoubleStream;

public class C01Calculator {

    static double sum(double ...numbers){
        return DoubleStream.of(numbers).sum();
    }

    static double multiply(double ...numbers){
        return DoubleStream.of(numbers).reduce(1 , (a,b) -> a*b);
    }

}
