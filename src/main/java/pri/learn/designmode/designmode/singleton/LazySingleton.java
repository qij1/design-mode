package pri.learn.designmode.designmode.singleton;

/**
 * 懒汉模式
 */
public class LazySingleton {
    private static LazySingleton instance = null;

    public static synchronized LazySingleton getSingleton(){
        if(instance == null) {
            return new LazySingleton();
        }
        return instance;
    }

}
