package dp_ChainofResponsibility;

public class PaymentProcess extends PaymentLogger {

    public PaymentProcess(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println(message + " : Processing...");
    }
}