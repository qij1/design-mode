package pri.learn.designmode.designmode.facadepattern;

/**
 * @Description:
 * @Author:qj
 * @Createtime:2020-05-24 17:16
 */
public class Facade {

    public void test(){
        ModuleA a = new ModuleA();
        a.testA();
        ModuleB b = new ModuleB();
        b.testB();
        ModuleC c = new ModuleC();
        c.testC();
    }
}
