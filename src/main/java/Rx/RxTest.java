package Rx;

public class RxTest {

    public static void main(String[] args){
      Observable.create((ObservableOnSubscribe<String>) emitter -> emitter.onNext("123")).map(Integer::parseInt).subscribe(new Observer<Integer>() {
          @Override
          public void onSubscribe() {

          }

          @Override
          public void onNext(Integer s) {
              System.out.print(s + 1);
          }

          @Override
          public void onError(Throwable t) {

          }

          @Override
          public void onComplete() {

          }
      });
    }

}
