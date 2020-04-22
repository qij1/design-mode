package pri.learn.designmode.designmode.decoratorpattern.patternstructure;

public class Decorator implements Component{

    Component component;

    public void setComponent(Component component){
        this.component = component;
    }

    @Override
    public void operation() {
        if(component!=null){
            component.operation();
        }
    }
}
