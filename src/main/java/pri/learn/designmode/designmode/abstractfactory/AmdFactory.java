package pri.learn.designmode.designmode.abstractfactory;

public class AmdFactory implements AbstractFactory{
    @Override
    public Cpu createCpu() {
        return new AmdCpu(938);
    }

    @Override
    public Mainboard createMainboard() {
        return new AmdMainboard(938);
    }
}
