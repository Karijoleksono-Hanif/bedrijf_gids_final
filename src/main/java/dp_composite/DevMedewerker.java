package dp_composite;


public class DevMedewerker implements Medewerker {
    private String name;
    private double salary;

    public DevMedewerker(String name, double salary)
    {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public void add(Medewerker medewerker) {
    }

    @Override
    public Medewerker getChild(int i) {
        return null;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getSalary() {
        return salary;
    }

    @Override
    public void print() {
        System.out.println("==========================+");
        System.out.println("----- Dev Medewerker -----");
        System.out.println("Naam:    "+getName());
        System.out.println("Salaris: "+getSalary());

    }
}
