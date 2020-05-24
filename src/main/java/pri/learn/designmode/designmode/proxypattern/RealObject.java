package pri.learn.designmode.designmode.proxypattern;

/**
 * @Description:目标对象角色
 * @Author:qj
 * @Createtime:2020-05-24 15:33
 */
public class RealObject extends AbstractObject {
    @Override
    public void operation() {
        //一些操作
        System.out.println("一些操作");
    }
}
