package pri.learn.designmode.designmode.abstractfactory.impovewithsimplefactory;

import pri.learn.designmode.designmode.abstractfactory.Cpu;
import pri.learn.designmode.designmode.abstractfactory.Mainboard;
import pri.learn.designmode.designmode.simplefactorypattern.Operation;

import java.lang.reflect.InvocationTargetException;

/**
 * 用简单工厂模式改进抽象工厂模式，增加扩展性
 */
public class ComputerFactory {

    private static String package_url = "pri.learn.designmode.designmode.abstractfactory";

    public static Cpu createCpu(String className){
        Cpu cpu = null;
        int pins = "Intel".equals(className) ? 755 : 938;
        try {
            Class clazz = Class.forName(String.format("%s.%s%s", package_url, className, "Cpu"));
            cpu = (Cpu) clazz.getConstructor(int.class).newInstance(pins);
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return cpu;
    }


    public static Mainboard createMainboard(String className){
        //用反射的方法代替switch
        Mainboard mainboard = null;
        int cpuholes = "Intel".equals(className) ? 755 : 938;
        try {
            Class clazz = Class.forName(String.format("%s.%s%s", package_url, className, "Mainboard"));
            mainboard = (Mainboard) clazz.getConstructor(int.class).newInstance(cpuholes);
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return mainboard;
    }
}
