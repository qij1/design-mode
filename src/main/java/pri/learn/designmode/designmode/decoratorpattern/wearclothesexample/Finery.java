package pri.learn.designmode.designmode.decoratorpattern.wearclothesexample;

public class Finery extends Person {

    private Person person;

    public void decorate(Person person){
        this.person = person;
    }

    @Override
    public void show(){
        if(person != null){
            person.show();
        }
    }
}
