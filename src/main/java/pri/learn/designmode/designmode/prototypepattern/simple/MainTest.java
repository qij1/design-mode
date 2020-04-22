package pri.learn.designmode.designmode.prototypepattern.simple;

public class MainTest {

    public static void main(String[] args) {
        Prototype prototype = new ConcretePrototype1();
        Prototype prototype1 = prototype.clone();
        System.out.println(prototype);
        System.out.println(prototype1);

    }
}
