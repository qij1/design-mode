package pri.learn.designmode.designmode.strategypattern;

/**
 * @param:design-mode
 * @description:返利收费
 * @author:qj
 * @create:2019-07-16 15:36
 **/
public class CashReturn extends CashSuper {

    private double moneyCondition = 0.0d;

    private double moneyReturn = 0.0d;

    public CashReturn(String moneyCondition, String moneyReturn) {
        this.moneyCondition = Double.parseDouble(moneyCondition);
        this.moneyReturn = Double.parseDouble(moneyReturn);
    }

    @Override
    public double accepetCash(double money) {
        if(money >= moneyCondition){
            return money - Math.floor(money / moneyCondition) * moneyReturn;
        }else {
            return money;
        }
    }
}
