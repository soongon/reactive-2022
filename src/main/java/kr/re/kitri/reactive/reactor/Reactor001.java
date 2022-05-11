package kr.re.kitri.reactive.reactor;

import reactor.core.publisher.Flux;

import java.util.Locale;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reactor001 {
    public static void main(String[] args) {
        Flux.just("blue", "pink", "red", "green")
                .filter(s -> s.length() >= 4) // Flux<String>
                .map(String::toUpperCase)
                .subscribe(System.out::println);
    }
}


    //(String s) -> { return s.toUpperCase(); }



    //(String s) -> { return s.length() >= 4; }