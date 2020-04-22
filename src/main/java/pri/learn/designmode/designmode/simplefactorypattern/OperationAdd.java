package pri.learn.designmode.designmode.simplefactorypattern;

public class OperationAdd extends Operation{
    @Override
    public double getResult() {
        return get_numberA() + get_numberB();
    }
}
