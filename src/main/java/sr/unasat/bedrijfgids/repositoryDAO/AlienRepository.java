package sr.unasat.bedrijfgids.repositoryDAO;

import sr.unasat.bedrijfgids.Alien;

import java.util.ArrayList;
import java.util.List;

public class AlienRepository {
    List<Alien> aliens;

    public AlienRepository(){
        aliens = new ArrayList<>();

        Alien a1 = new Alien();
        a1.setId(101);
        a1.setName("hanif");
        a1.setPoints(50);

        Alien a2 = new Alien();
        a2.setId(102);
        a2.setName("hanif2");
        a2.setPoints(502);

        aliens.add(a1);
        aliens.add(a2);

    }

    public List<Alien> getAliens() {
        return aliens;
    }

    public Alien getAlien(int id){
        Alien a1 = null;

        for(Alien a : aliens){
            if(a.getId()==id){
                return a;
            }
        }
        return null;
    }

    public void create(Alien a1){
        aliens.add(a1);
    }

}
