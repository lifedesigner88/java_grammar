package A08_Thread;

// thread 클래스에 이미 구현되어 있는 run 메서드는 아무 작업도 하지 않는 빈 메서드.
// 작업하고 싶은 내용을 run()메서드 안에 overriding 하여 정의할 수 있다.
// runable 상속관계다 보니 다른 클래스 상속 불가. 단점 -> Runnable 대체.
public class ExtendsThreadClass extends Thread {



//    run 메서드는 스레드가 시작되면 실행된다.
    @Override
    public void run(){
        System.out.println("ExtendsThreadClass :"
                + Thread.currentThread().getName());
    }

}
