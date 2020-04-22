package pri.learn.designmode.designmode.strategypattern;

/**
 * @param:design-mode
 * @description:打折收费
 * @author:qj
 * @create:2019-07-16 15:33
 **/
public class CashRebate extends CashSuper{

    private double moneyRebate = 1d;

    public CashRebate(String moneyRebate) {
        this.moneyRebate = Double.parseDouble(moneyRebate);
    }

    @Override
    public double accepetCash(double money) {
        return money * moneyRebate;
    }
}
