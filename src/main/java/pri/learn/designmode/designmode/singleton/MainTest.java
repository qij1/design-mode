package pri.learn.designmode.designmode.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainTest {
    public static void main(String[] args) throws Exception {
        //使用反射的方式改变双重检查加锁单例，成功修改
//        System.out.println(DoubleCheckLockSingleton.getInstance());
//        Field field = DoubleCheckLockSingleton.class.getDeclaredField("instance");
//        field.setAccessible(true);
//        Constructor<?> constructor = DoubleCheckLockSingleton.class.getDeclaredConstructor();
//        constructor.setAccessible(true);
//        Object instance = constructor.newInstance();
//        field.set("instance", instance);
//        System.out.println(DoubleCheckLockSingleton.getInstance());
//
//        //使用反射的方式改变枚举方式实现单例，报错，不可修改
//        System.out.println(EnumSingleton.INSTANCE);
//        System.out.println(EnumSingleton.INSTANCE);
//        Field field2 = EnumSingleton.class.getDeclaredField("INSTANCE");
//        field.setAccessible(true);
//        Constructor<?> constructor2 = EnumSingleton.class.getDeclaredConstructor(String.class, int.class);
//        constructor2.setAccessible(true);
//        Object instance2 = constructor2.newInstance("", 0);
//        field2.set(EnumSingleton.class, instance2);
//        System.out.println(EnumSingleton.INSTANCE);
//        System.out.println(EnumSingleton.INSTANCE);


        Pattern pattern = Pattern.compile("insert\\s+into\\s+table\\s+(\\w+\\.?\\w+)\\s+");
        String sql = "insert into table aaaa.bbbb partition select * from fffff";
        Matcher matcher = pattern.matcher(sql);
        while (matcher.find()){
            System.out.println(matcher.group(0));
            System.out.println(matcher.group(1));
        }

    }
}
