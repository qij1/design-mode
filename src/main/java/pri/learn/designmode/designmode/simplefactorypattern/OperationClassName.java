package pri.learn.designmode.designmode.simplefactorypattern;

public enum OperationClassName {

    Add("OperationAdd"),
    Sub("OperationSub"),
    Multi("OperationMulti"),
    DIV("OperationDiv");

    private String className;

    OperationClassName(String className){
        this.className = className;
    }

    public String getClassName(){
        return this.className;
    }

}
