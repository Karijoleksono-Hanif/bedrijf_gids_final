package sr.unasat.bedrijfgids.controller;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import sr.unasat.bedrijfgids.Alien;
import sr.unasat.bedrijfgids.entity.Bedrijf;
import sr.unasat.bedrijfgids.repositoryDAO.AlienRepository;
import sr.unasat.bedrijfgids.repositoryDAO.BedrijvenRepository;


import java.util.List;


@Path("/aliens")
public class AlienController {

    AlienRepository repo = new AlienRepository();

    @GET
    @Path("/getAliens")
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
