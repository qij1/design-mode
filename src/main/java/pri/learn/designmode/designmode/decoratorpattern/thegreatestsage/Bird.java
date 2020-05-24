package pri.learn.designmode.designmode.decoratorpattern.thegreatestsage;

/**
 *@description:具体装饰角色“鸟儿”
 *@author:qj
 *@createtime:2020-05-24 11:57
 */
public class Bird extends Change {
    public Bird(TheGreatestSage sage) {
        super(sage);
    }

    @Override
    public void move() {
        // 代码
        System.out.println("Bird Move");
    }
}
