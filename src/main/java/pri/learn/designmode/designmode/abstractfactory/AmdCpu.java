package pri.learn.designmode.designmode.abstractfactory;

public class AmdCpu implements Cpu{

    /**
     * CPU的针脚数
     */
    private int pins;
    public AmdCpu(int pins){
        this.pins = pins;
    }

    @Override
    public void calculate() {
        // TODO Auto-generated method stub
        System.out.println("Amd CPU的针脚数：" + pins);
    }
   }
