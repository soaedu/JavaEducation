package java_regular.data.type.classes.type.inner.example3;

public class InnerAnonymousMain {
    public static void main(String[] args) {
        AnonymousInner inner = new AnonymousInner() {
            @Override
            public void myMethod() {
                System.out.println("This is an example of the anonymous inner class");
            }
        };
        inner.myMethod();

        InnerAnonymousMain main = new InnerAnonymousMain();
        /*main.showMessage(new Message() {
            @Override
            public String greet() {
                return "Hello";
            }
        });*/
        main.showMessage(() -> "Hello");    // as Lambda-expression
    }

    public void showMessage(Message msg) {
        System.out.println(msg.greet() + ", This is an example of the anonymous class as an argument");
    }
}

abstract class AnonymousInner {
    public abstract void myMethod();
}

interface Message {
    String greet();
}