package pri.learn.designmode.designmode.strategypattern;

public enum CashType {

    Normal("01"),
    ThreeHundred_Sub_OneHundred("02"),
    EightPercent("03");

    private String cashType;

    CashType(String cashType){
        this.cashType = cashType;
    }

    public String getCashType(){
        return this.cashType;
    }

}
