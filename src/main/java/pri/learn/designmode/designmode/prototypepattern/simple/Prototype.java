package pri.learn.designmode.designmode.prototypepattern.simple;

public interface Prototype{
    /**
     * 克隆自身的方法
     * @return 一个从自身克隆出来的对象
     */
    Prototype clone();
}
