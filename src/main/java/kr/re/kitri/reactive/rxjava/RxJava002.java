package kr.re.kitri.reactive.rxjava;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;

public class RxJava002 {
    public static void main(String[] args) {
        Observable<String> stringObservable =
                Observable.just("red", "blue", "brown", "white");
        stringObservable.subscribe(new MyObserver());
    }
}
class MyObserver implements Observer<String> {
    @Override
    public void onSubscribe(@NonNull Disposable d) {
        System.out.println("onSubscribe callback..");
    }
    @Override
    public void onNext(@NonNull String s) {
        System.out.println("onNext callback.. " + s);
    }
    @Override
    public void onError(@NonNull Throwable e) {
        System.out.println("onError.. " + e);
    }
    @Override
    public void onComplete() {
        System.out.println("onComplete callback..");
    }
}