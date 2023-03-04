package sr.unasat.bedrijfgids.controller;

import sr.unasat.bedrijfgids.Alien;
import sr.unasat.bedrijfgids.repositoryDAO.AlienRepository;

import javax.annotation.PreDestroy;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;


@Path("aliens")
public class AlienController {

    AlienRepository repo = new AlienRepository();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Alien> getAlien(){
        System.out.println("getAlien called....");

        return repo.getAliens();
    }

}
