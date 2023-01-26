package dp_composite;

public class BetalingMedewerkers {

    public static void Betalingen(){
        Medewerker med1=new KassaMedewerker("Kassa Med1", 1500.00);
        Medewerker med2=new DevMedewerker("Dev Med1", 3000.00);
        Medewerker eigenaar=new Eigenaar("Karijo Hanif",4500.00);

        eigenaar.add(med1);
        eigenaar.add(med2);
        eigenaar.print();
    }

//    public static void main(String args[]) {
//        BetalingMedewerkers.Betalingen();
//    }
}
