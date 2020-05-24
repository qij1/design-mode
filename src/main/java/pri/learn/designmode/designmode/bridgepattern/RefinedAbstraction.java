package pri.learn.designmode.designmode.bridgepattern;

/**
 * @Description:修正抽象化角色
 * @Author:qj
 * @Createtime:2020-05-24 23:38
 */
public class RefinedAbstraction extends Abstraction{

    public RefinedAbstraction(Implementor impl) {
        super(impl);
    }
    //其他的操作方法
    public void otherOperation(){

    }

}
