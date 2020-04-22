package pri.learn.designmode.designmode.factorymethod;

public class OperationDiv extends Operation{
    @Override   
    public double getResult() throws Exception{
        if(get_numberB() == 0)
            throw new Exception("除数不能为0");
        return get_numberA() / get_numberB();
    }
}
