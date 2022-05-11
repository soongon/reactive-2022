package kr.re.kitri.reactive.reactor;

import reactor.core.publisher.Flux;

import java.util.function.Consumer;

public class Reactor002 {
    public static void main(String[] args) {
        // 1. Flux 생성.. range
        Flux<Integer> integerFlux = Flux.range(2020, 10);

        // 2. 데이터 연산 .. filter , map
        // filter -- 짝수 연도만 필터링
        // map -- 2020년 반환
        Flux<String> stringFlux = integerFlux
                .filter(item -> item % 2 == 0)
                .map(item -> item + "년");

        // 3. 데이터 사용 콘솔에 출력
        stringFlux.subscribe(item -> System.out.println(item));
    }
}

/*
class MyConsumer implements Consumer<String> {
    @Override
    public void accept(String s) {
        System.out.println(s);
    }
}*/
