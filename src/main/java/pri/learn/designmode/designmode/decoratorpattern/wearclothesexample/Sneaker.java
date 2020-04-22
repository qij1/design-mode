package pri.learn.designmode.designmode.decoratorpattern.wearclothesexample;

public class Sneaker extends Finery {
    @Override
    public void show() {
        super.show();
        System.out.println("运动鞋");
    }
}
