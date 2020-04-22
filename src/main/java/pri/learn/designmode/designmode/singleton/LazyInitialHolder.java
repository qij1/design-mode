package pri.learn.designmode.designmode.singleton;

/**
 *  Lazy initialization holder class (延迟初始化持有者类)
 */
public class LazyInitialHolder {

    private static class SingletonHolder {
        private static LazyInitialHolder instance = new LazyInitialHolder();
    }

    public static LazyInitialHolder getInstance() {
        //类级内部类相当于其外部类的成员，只有在第一次被使用的时候才被会装载
        return SingletonHolder.instance;
    }
}
