package kr.re.kitri.reactive.reactor;

import reactor.core.Disposable;
import reactor.core.publisher.Flux;

import java.time.Duration;

public class Reactor004 {
    public static void main(String[] args) throws InterruptedException {
        Disposable disp = Flux.interval(Duration.ofMillis(500))
                .subscribe(d -> System.out.println(d));

        Thread.sleep(3000);
        disp.dispose();
        Thread.sleep(5000);
    }
}
