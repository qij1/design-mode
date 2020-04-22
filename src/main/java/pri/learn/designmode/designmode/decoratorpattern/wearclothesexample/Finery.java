package pri.learn.designmode.designmode.decoratorpattern.wearclothesexample;

import lombok.NoArgsConstructor;


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
