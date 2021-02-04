package Rx;

public class RxTest {

    public static void main(String[] args){

        Observable.create(new Observable<String>() {
            @Override
            void subScribe(Observer<String> observer) {
                observer.onNext("sss");
            }
        }).map(s -> s + "123").subScribe(new Observer<String>() {
            @Override
            public void onNext(String s) {
                System.out.print("----------------" + s);
            }

            @Override
            public void onError() {

            }

            @Override
            public void onComplete() {

            }
        });
    }

}
