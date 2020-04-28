package pri.learn.designmode.designmode.builder;

import lombok.Data;

import java.util.Date;

@Data
public abstract class AutoMessage {

    //收件人地址
    private String to;
    //发件人地址
    private String from;
    //标题
    private String subject;
    //内容
    private String body;
    //发送日期
    private Date sendDate;

    public void send(){
        System.out.println("收件人地址：" + to);
        System.out.println("发件人地址：" + from);
        System.out.println("标题：" + subject);
        System.out.println("内容：" + body);
        System.out.println("发送日期：" + sendDate);
    }
}
