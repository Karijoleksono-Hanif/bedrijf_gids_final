package sr.unasat.bedrijfgids.dp_ChainofResponsibility;

public abstract class PaymentLogger {
    public static int SUBMIT = 1;
    public static int PAYMENTPROCESS = 2;
    public static int PAYMENTSUCCESFUL = 3;

    protected int level;

    //next element in chain or responsibility
    protected PaymentLogger nextLogger;

    public void setNext(PaymentLogger nextLogger){
        this.nextLogger = nextLogger;
    }
    public void logMessage(String message, int level){
        if(this.level <= level){
            write(message);
        }
        if(nextLogger !=null){
            nextLogger.logMessage(message, level);
        }
    }

    abstract protected void write(String message);
}