package dp_ChainofResponsibility;

public class Submit extends PaymentLogger {
    public Submit(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println(message + " : Submitted");
    }
}
