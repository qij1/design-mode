package pri.learn.designmode.designmode.singleton;

/**
 * 双重检验加索
 */
public class DoubleCheckLockSingleton {

    // 被volatile修饰的变量的值，将不会被本地线程缓存，所有对该变量的读写都是直接操作共享内存，从而确保多个线程能正确的处理该变量。
    private volatile static DoubleCheckLockSingleton instance = null;

    public static DoubleCheckLockSingleton getInstance(){
        //先判断有没有，没有再进同步
        if(instance == null) {

            synchronized (DoubleCheckLockSingleton.class){

                //再次检查实例是否存在，如果不存在才真正的创建实例

                if(instance == null) {

                    instance = new DoubleCheckLockSingleton();

                }
            }

        }
        return instance;

    }
}
