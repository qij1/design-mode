package pri.learn.designmode.designmode;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import pri.learn.designmode.designmode.abstractfactory.AbstractFactory;
import pri.learn.designmode.designmode.abstractfactory.AmdFactory;
import pri.learn.designmode.designmode.abstractfactory.ComputerEngineer;
import pri.learn.designmode.designmode.abstractfactory.impovewithsimplefactory.ComputerEngineer2;
import pri.learn.designmode.designmode.decoratorpattern.patternstructure.ConcreteComponent;
import pri.learn.designmode.designmode.decoratorpattern.patternstructure.ConcreteDecoratorA;
import pri.learn.designmode.designmode.decoratorpattern.patternstructure.ConcreteDecoratorB;
import pri.learn.designmode.designmode.decoratorpattern.wearclothesexample.BigTrouser;
import pri.learn.designmode.designmode.decoratorpattern.wearclothesexample.Person;
import pri.learn.designmode.designmode.decoratorpattern.wearclothesexample.Sneaker;
import pri.learn.designmode.designmode.decoratorpattern.wearclothesexample.TShirts;

import pri.learn.designmode.designmode.strategypattern.CashContext;
import pri.learn.designmode.designmode.strategypattern.CashType;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@SpringBootApplication
@Slf4j
public class DesignModeApplication {

    public static void main(String[] args) {
        SpringApplication.run(DesignModeApplication.class, args);
    }

    @Bean
    public void testStringJoin(){
//        Set<String> strin = new HashSet<>();
//        strin.add("111");
//        System.out.println(String.join(",",strin));
    }

    public void testRegex(){
        Pattern pattern = Pattern.compile("insert\\s+into\\s+table\\s+(\\w+\\.?\\w+)\\s+");
        String sql = "insert into table aaaa.bbbb partition select * from fffff";
        Matcher matcher = pattern.matcher(sql);
        while (matcher.find()){
            System.out.println(matcher.group(0));
            System.out.println(matcher.group(1));
        }
    }


    /**
     * 策略模式
     */
    @Bean
    public void strategyPattern() {
        // 定义了一系列算法的方法，从概念上讲这些算法完成的都是相同的工作，只是实现不同，它可以以相同的方式调用所有的算法，减少了各种算法类与使用算法类之间的耦合
        CashContext cashContext = new CashContext(CashType.EightPercent);
        System.out.println(cashContext.getResult(2000));
    }


    /**
     * 装饰模式
     */
    @Bean
    public void decoratorPattern(){
        // 装饰模式架构例子
//        ConcreteComponent concreteComponent = new ConcreteComponent();
//        ConcreteDecoratorA concreteDecoratorA = new ConcreteDecoratorA();
//        ConcreteDecoratorB concreteDecoratorB = new ConcreteDecoratorB();
//        // 使用 setComponent 对对象进行包装，每个装饰对象的实现和如何使用这个对象分开，
//        // 每个装饰对象只关心自己的功能，不需要关心如何被添加到对象链中
//        concreteDecoratorA.setComponent(concreteComponent);
//        concreteDecoratorB.setComponent(concreteDecoratorA);
//        concreteDecoratorB.operation();

        //装饰模式实际例子-----装扮
//        Person person = new Person("小范");
//        BigTrouser bigTrouser = new BigTrouser();
//        Sneaker sneaker = new Sneaker();
//        TShirts tShirts = new TShirts();
//        bigTrouser.decorate(person);
//        sneaker.decorate(bigTrouser);
//        tShirts.decorate(sneaker);
//        tShirts.show();

    }


}
