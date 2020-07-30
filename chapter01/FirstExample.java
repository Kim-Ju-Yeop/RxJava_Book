import io.reactivex.Observable;

public class FirstExample {

    private void emit() {
         Observable.just("Hello", "RxJava 2!!")
                .subscribe(data -> System.out.println(data));
    }

    public static void main(String[] args) {
        FirstExample demo = new FirstExample();
        demo.emit();
    }
}
