package kr.re.kitri.reactive.reactor;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

public class Reactor005 {
    public static void main(String[] args) {
        Flux<Integer> integerFlux = Flux.range(1, 10);
        Mono<List<Integer>> listMono = integerFlux.collectList();

        Mono<Integer> reduce = integerFlux.reduce(1, (a, b) -> a * b);

    }
}
