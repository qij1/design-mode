package pri.learn.designmode.designmode.bridgepattern;

/**
 * @Description:抽象化角色类
 * @Author:qj
 * @Createtime:2020-05-24 23:38
 */
public abstract class Abstraction {
    protected Implementor impl;

    public Abstraction(Implementor impl){
        this.impl = impl;
    }
    //示例方法
    public void operation(){

        impl.operationImpl();
    }
}
