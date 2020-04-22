package pri.learn.designmode.designmode.simplefactorypattern;

import java.lang.reflect.InvocationTargetException;

/**
 * 工厂类
 */
public class OperationFactory {

    private static String package_url = "pri.learn.designmode.designmode.simplefactorypattern";

    public static Operation createOperation(String className){
        //用反射的方法代替switch
        Operation operation = null;
        try {
            Class clazz = Class.forName(String.format("%s.%s", package_url, className));
            operation = (Operation) clazz.getConstructor().newInstance();
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
//        switch (operate){
//            case "+" :
//                operation = new OperationAdd();
//                break;
//            case "-" :
//                operation = new OperationSub();
//                break;
//            case "*" :
//                operation = new OperationMulti();
//                break;
//            case "/":
//                operation = new OperationSub();
//                break;
//        }
        return operation;
    }
}
