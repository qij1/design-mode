package pri.learn.designmode.designmode.abstractfactory;

public class IntelCpu implements Cpu{

    /**
     * CPU的针脚数
     */
    private int pins;
    public  IntelCpu(int pins){
        this.pins = pins;
    }

    @Override
    public void calculate() {
        // TODO Auto-generated method stub
        System.out.println("Intel CPU的针脚数：" + pins);
    }
   }
