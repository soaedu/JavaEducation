package java_regular.data.type.classes.type.nested.static_nested;

/*
    Example from web-site: http://tutorialspoint.com"
 */
public class StaticNestedMain {
    public static void main(String[] args) {
        OuterClass.InnerStaticNested innerClass = new OuterClass.InnerStaticNested();
        innerClass.myMethod();
    }
}
