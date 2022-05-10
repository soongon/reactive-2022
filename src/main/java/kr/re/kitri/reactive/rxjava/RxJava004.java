package kr.re.kitri.reactive.rxjava;

import io.reactivex.rxjava3.core.Observable;

import java.util.concurrent.TimeUnit;

public class RxJava004 {
    public static void main(String[] args) throws InterruptedException {
        Observable<Long> interval =
                Observable.interval(500, TimeUnit.MILLISECONDS);
        interval.subscribe(d -> System.out.println(d));

        Thread.sleep(5000);
    }
}
