package pri.learn.designmode.designmode.strategypattern;

/**
 * @param:design-mode
 * @description:正常收费
 * @author:qj
 * @create:2019-07-16 15:32
 **/
public class CashNormal extends CashSuper{
    @Override
    public double accepetCash(double money) {
        return money;
    }
}
