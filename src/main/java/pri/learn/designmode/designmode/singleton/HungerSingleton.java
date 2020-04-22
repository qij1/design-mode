package pri.learn.designmode.designmode.singleton;

/**
 * 饿汉单例
 */
public class HungerSingleton {
    private static HungerSingleton instance = new HungerSingleton();

    private static HungerSingleton getHungerSingleton(){
        return instance;
    }

}
