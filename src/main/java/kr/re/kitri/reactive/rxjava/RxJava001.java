package kr.re.kitri.reactive.rxjava;

import io.reactivex.rxjava3.core.Observable;

public class RxJava001 {
    public static void main(String[] args) {
        // Publisher, Producer
        Observable<String> stringObservable =
                Observable.just("blue", "red", "pink");

        // Operator (filter, map ..)
        Observable<String> stringObservable2 =
                stringObservable
                    .filter(d -> d.length() >= 4)
                    .map(d -> d.toUpperCase());


        // Subscriber, Consumer
        stringObservable.subscribe(d -> System.out.println(d));
    }
}
