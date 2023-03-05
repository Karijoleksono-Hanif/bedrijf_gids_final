package sr.unasat.bedrijfgids.controller;

import sr.unasat.bedrijfgids.Alien;
import sr.unasat.bedrijfgids.entity.Bedrijf;
import sr.unasat.bedrijfgids.repositoryDAO.AlienRepository;
import sr.unasat.bedrijfgids.repositoryDAO.BedrijvenRepository;

import javax.annotation.PreDestroy;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;


@Path("aliens")
public class AlienController {

    AlienRepository repo = new AlienRepository();

    @GET
    @Path("getAliens")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Alien> getAlien(){

        System.out.println("getAlien called....");

        return repo.getAliens();
    }

    @POST
    @Path("alien")
    public Alien createAlien(Alien a1){
        System.out.println(a1);
        repo.create(a1);

        return a1;
    }


}
