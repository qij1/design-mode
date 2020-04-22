package pri.learn.designmode.designmode.factorymethod;



public class MultiFactory extends Factory{
    @Override
    public Operation createOpertion() {
        return new OperationMulti();
    }
}
