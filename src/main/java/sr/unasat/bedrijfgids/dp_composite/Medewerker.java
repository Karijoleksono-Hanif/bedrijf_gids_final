package sr.unasat.bedrijfgids.dp_composite;

public interface Medewerker {

    public String getName();

    public double getSalary();

    public void print();

    public void add(Medewerker medewerker);

    public Medewerker getChild(int i);

}

