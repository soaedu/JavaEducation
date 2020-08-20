package java_regular.data.type.classes.type.nested.inner.example2;

public class InnerClassMain {
    public static void main(String[] args) {
        Bank bank = new Bank("Credit-card");

        Bank.Account account = bank.new Account(14151600000L);
        account.deposit(100);
        account.show();

        OuterClass outerClass = new OuterClass();
        outerClass.show();

        OuterClass.MyInner innerClass = outerClass.new MyInner();
        innerClass.showInner();

        OuterClass.MyStaticNested staticNestedClass = new OuterClass.MyStaticNested();
        staticNestedClass.showNested();
    }
}
