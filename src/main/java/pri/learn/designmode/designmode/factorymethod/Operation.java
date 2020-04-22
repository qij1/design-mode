package pri.learn.designmode.designmode.factorymethod;

import lombok.Data;

/**
 * 运算类
 */
@Data
public abstract class Operation {
    private double _numberA;
    private double _numberB;
    public double getResult() throws Exception {
        double result = 0;
        return result;
    }
}
