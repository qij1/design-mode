package pri.learn.designmode.designmode.decoratorpattern.thegreatestsage;

/**
 * @Description:
 * @Author:qj
 * @Createtime:2020-05-24 14:43
 */
public class MainTest {

    /**
     * 上面的例子中，系统把大圣从一只猢狲装饰成了一只鸟儿（把鸟儿的功能加到了猢狲身上），
     * 后又把鸟儿装饰成了一条鱼儿（把鱼儿的功能加到了猢狲+鸟儿身上，得到了猢狲+鸟儿+鱼儿）。
     * @param args
     */
    public static void main(String[] args) {

        TheGreatestSage sage = new Monkey();
        // 第一种写法
        TheGreatestSage bird = new Bird(sage);
        TheGreatestSage fish = new Fish(bird);
        // 第二种写法
        //TheGreatestSage fish = new Fish(new Bird(sage));
        fish.move();
    }
}
