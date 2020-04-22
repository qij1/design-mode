package pri.learn.designmode.designmode.factorymethod;

import lombok.NoArgsConstructor;
import pri.learn.designmode.designmode.factorymethod.Operation;

@NoArgsConstructor
public class OperationMulti extends Operation{
    @Override   
    public double getResult() {
        return get_numberA() * get_numberB();
    }
}
