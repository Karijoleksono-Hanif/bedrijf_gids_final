package dp_ChainofResponsibility;

public class PaymentSuccesfull extends PaymentLogger {

    public PaymentSuccesfull(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println(message + " : Succesfull !!!");
    }
}