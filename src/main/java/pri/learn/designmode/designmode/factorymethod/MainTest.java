package pri.learn.designmode.designmode.factorymethod;

/**
 * 工厂方法模式
 */
public class MainTest {
    public static void main(String[] args) {
        Factory factory = new AddFactory();
        Operation operation = factory.createOpertion();
        operation.set_numberA(1);
        operation.set_numberB(2);
        try{
            System.out.println(operation.getResult());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
