package kr.re.kitri.reactive.rxjava;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;

public class RxJava005 {
    public static void main(String[] args) {

        Single.just("only one")
                .subscribe(data -> System.out.println(data),
                            error -> System.out.println(error));

        Observable<String> just = Observable.just("one", "two");
        Single<String> nil = just.first("Nil");
    }
}
