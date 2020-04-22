package pri.learn.designmode.designmode.singleton;

/**
 * 包含单个元素的枚举类型实现单例
 *
 */
public enum EnumSingleton {
    INSTANCE;

    public void singletonOpertion(){
        System.out.println("执行");
    }

    public static void main(String[] args) {
        //使用示例
        EnumSingleton singleton = EnumSingleton.INSTANCE;
        singleton.singletonOpertion();
        //使用示例
        EnumSingleton singleton2 = EnumSingleton.INSTANCE;
        singleton2.singletonOpertion();
        System.out.println(singleton==singleton2);
    }
}
