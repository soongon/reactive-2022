package kr.re.kitri.reactive.reactor;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;
import reactor.core.publisher.Flux;


public class Reactor003 {
    public static void main(String[] args) {
        Flux.just("a", "b")
                .subscribe(
                        item -> System.out.println(item),
                        error -> System.out.println(error),
                        () -> System.out.println("the end.."),
                        sub -> {
                            sub.request(1);
                            sub.cancel();
                        }
                );
    }
}

class MySubscriber implements Subscriber<String> {

    @Override
    public void onSubscribe(Subscription subscription) {
        subscription.request(Long.MAX_VALUE);
    }

    @Override
    public void onNext(String s) {

    }

    @Override
    public void onError(Throwable throwable) {

    }

    @Override
    public void onComplete() {

    }
}