package sr.unasat.bedrijfgids;

public class Alien {

    private int Id;
    private String name;
    private int points;


    @Override
    public String toString() {
        return "Alien{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", points=" + points +
                '}';
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
}
