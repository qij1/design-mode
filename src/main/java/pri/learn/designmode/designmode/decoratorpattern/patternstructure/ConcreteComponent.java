package pri.learn.designmode.designmode.decoratorpattern.patternstructure;

public class ConcreteComponent implements Component{
    @Override
    public void operation() {
        System.out.println("具体对象的操作");
    }
}
