package pri.learn.designmode.designmode.factorymethod;

public class AddFactory extends Factory{
    @Override
    public Operation createOpertion() {
        return new OperationAdd();
    }
}
