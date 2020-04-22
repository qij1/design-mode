package pri.learn.designmode.designmode.decoratorpattern.wearclothesexample;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Person {

    String name;

    public Person(String name) {
        this.name = name;
    }

    public void show(){
        System.out.println("开始装扮 " + name);
    }
}
