package pri.learn.designmode.designmode.buildermodel;

public class GoodbyeBuilder extends Builder {

    public GoodbyeBuilder(){
        msg = new GoodbyeMessage();
    }

    @Override
    public void buildSubject() {
        msg.setSubject("欢迎标题");

    }

    @Override
    public void buildBody() {
        msg.setBody("欢迎内容");
    }
}
