package dp_composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Eigenaar implements Medewerker {

    private String name;
    private double salary;

    public Eigenaar( String name, double salary)
    {
        this.name = name;
        this.salary = salary;
    }

    List<Medewerker> medewerkers = new ArrayList<Medewerker>();

    @Override
    public void add(Medewerker medewerker)
    {
        medewerkers.add(medewerker);
    }

    @Override
    public Medewerker getChild(int i)
    {
        return medewerkers.get(i);
    }

    @Override
    public String getName()
    {
        return name;
    }

    @Override
    public double getSalary()
    {
        return salary;
    }

    @Override
    public void print()
    {

        System.out.println("==========================+");
        System.out.println("-------- Eigenaar --------");
        System.out.println("Naam:    "+getName());
        System.out.println("Salaris: "+getSalary());


        Iterator<Medewerker> it = medewerkers.iterator();

        while(it.hasNext())
        {
            Medewerker medewerker = it.next();
            medewerker.print();
        }
    }







}
