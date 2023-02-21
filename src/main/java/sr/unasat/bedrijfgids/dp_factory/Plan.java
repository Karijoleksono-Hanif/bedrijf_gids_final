package sr.unasat.bedrijfgids.dp_factory;

abstract class Plan {
    protected double prijs;
    abstract void getPrijs();

    public void calculeerRekening(int aantal) {
        System.out.println(aantal * prijs);
    }
}
