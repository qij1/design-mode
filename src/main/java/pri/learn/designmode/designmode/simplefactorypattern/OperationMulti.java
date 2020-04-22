package pri.learn.designmode.designmode.simplefactorypattern;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class OperationMulti extends Operation{
    @Override   
    public double getResult() {
        return get_numberA() * get_numberB();
    }
}
