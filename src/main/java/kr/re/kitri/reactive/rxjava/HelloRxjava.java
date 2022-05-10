package kr.re.kitri.reactive.rxjava;

import io.reactivex.rxjava3.core.Observable;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class HelloRxjava {
    public static void main(String[] args) {
        // Data Producer
        List<String> colors = Arrays.asList("blue", "red", "white", "tan");
        // Data Subscriber (Consumer), Imperative programming
        for (String color : colors) {
            if (color.length() >= 4) {
                System.out.println(color.toUpperCase());
            }
        }
        // Java 8, Declarative programming, Stream Library
        Stream
            .of("blue", "red", "white", "tan")
            .filter(d -> d.length() >= 4)
            .map(d -> d.toUpperCase())
            .forEach(d -> System.out.println(d));
        // RxJava (Reactor) --> Reactive Programming
        // Data Producer
        Observable
            .just("blue", "red", "white", "tan")
            .filter(d -> d.length() >= 4)
            .map(d -> d.toUpperCase())
            .subscribe(d -> System.out.println(d));
    }
}
