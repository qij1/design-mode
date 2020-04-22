package pri.learn.designmode.designmode.factorymethod;


public class DivFactory extends Factory {
    @Override
    public Operation createOpertion() {
        return new OperationDiv();
    }
}
