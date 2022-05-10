package kr.re.kitri.reactive.reactor;

import reactor.core.publisher.Flux;

import java.util.Locale;

public class Reactor001 {
    public static void main(String[] args) {
        Flux.just("blue", "pink", "red", "green")
            .filter(data -> data.length() >= 4)
            .map(data -> data.toUpperCase())
            .subscribe(data -> System.out.println(data));
    }
}
