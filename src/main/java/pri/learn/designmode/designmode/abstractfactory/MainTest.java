package pri.learn.designmode.designmode.abstractfactory;

import pri.learn.designmode.designmode.abstractfactory.impovewithsimplefactory.ComputerEngineer2;

/**
 * 抽象工厂模式
 */
public class MainTest {
    public static void main(String[] args) {
        //工程师
        ComputerEngineer computerEngineer = new ComputerEngineer();
        //组装电脑
        computerEngineer.makeComputer(new AmdFactory());

        //简单工厂模式改进后的抽象工厂模式
        ComputerEngineer2 computerEngineer2 = new ComputerEngineer2();
        computerEngineer2.makeComputer("Intel");
    }
}
