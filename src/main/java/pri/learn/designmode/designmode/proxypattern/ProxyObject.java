package pri.learn.designmode.designmode.proxypattern;

/**
 * @Description:代理对象角色
 * @Author:qj
 * @Createtime:2020-05-24 15:34
 */
public class ProxyObject extends AbstractObject{

    RealObject realObject = new RealObject();

    @Override
    public void operation() {
        //调用目标对象之前可以做相关操作
        System.out.println("before");
        realObject.operation();
        //调用目标对象之后可以做相关操作
        System.out.println("after");
    }
}
