package pri.learn.designmode.designmode.decoratorpattern.wearclothesexample;

public class BigTrouser extends Finery {
    @Override
    public void show() {
        super.show();
        System.out.println("垮裤");
    }
}
