package pri.learn.designmode.designmode.proxypattern;

/**
 * @Description:
 * @Author:qj
 * @Createtime:2020-05-24 15:35
 */
public class MainTest {

    public static void main(String[] args) {
        AbstractObject obj = new ProxyObject();
        obj.operation();
    }
}
