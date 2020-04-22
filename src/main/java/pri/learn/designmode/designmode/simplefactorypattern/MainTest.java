package pri.learn.designmode.designmode.simplefactorypattern;

public class MainTest {
    public static void main(String[] args) {
        // 简单的工厂模式
        // 工厂实例化合适的对象
        Operation operation = OperationFactory.createOperation(OperationClassName.Add.getClassName());
        operation.set_numberA(1);
        operation.set_numberB(2);
        try{
            System.out.println(operation.getResult());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
