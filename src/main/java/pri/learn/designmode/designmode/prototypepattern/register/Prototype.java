package pri.learn.designmode.designmode.prototypepattern.register;

public interface Prototype {
    Prototype clone();
    String getName();
    void setName(String name);
}
