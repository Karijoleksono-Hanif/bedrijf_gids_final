package sr.unasat.bedrijfgids.dp_ChainofResponsibility;

public class PaymentDemo {

    public static PaymentLogger getChainOfLoggers(){

        PaymentLogger paymentSuccesfull = new PaymentSuccesfull(PaymentLogger.PAYMENTSUCCESFUL);
        PaymentLogger paymentProcess = new PaymentProcess(PaymentLogger.PAYMENTPROCESS);
        PaymentLogger submit = new Submit(PaymentLogger.SUBMIT);

        submit.setNext(paymentProcess);
        paymentProcess.setNext(paymentSuccesfull);
        return submit;
    }

    public static void Transactie(){
        PaymentLogger loggerChain = getChainOfLoggers();
        loggerChain.logMessage("Transaction status", PaymentLogger.PAYMENTSUCCESFUL);
    }

}