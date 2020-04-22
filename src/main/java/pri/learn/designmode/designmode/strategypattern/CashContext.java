package pri.learn.designmode.designmode.strategypattern;

import static pri.learn.designmode.designmode.strategypattern.CashType.*;

/**
 * @param:design-mode
 * @description: 现金收费上下文类
 * @author:qj
 * @create:2019-07-16 15:42
 **/
public class CashContext {

    private static String package_url = "pri.learn.designmode.designmode.strategypattern";

    private CashSuper cashSuper;   // Cash上下文类聚合(引用)收费抽象类，定义了一系列可供重用的算法或行为

    public CashContext(CashType type) {  // 通过构造方法传入具体的收费策略
        switch (type){
            case Normal:{
                cashSuper = new CashNormal();
                break;
            }
            case ThreeHundred_Sub_OneHundred:
                cashSuper = new CashReturn("300","100");
                break;
            case EightPercent:
                cashSuper = new CashRebate("0.8");
                break;
            default:
                cashSuper = new CashNormal();
                break;
        }
    }

    public double getResult(double money){
        return cashSuper.accepetCash(money);   // 根据收费策略的不同,获得计算结果
    }
}
