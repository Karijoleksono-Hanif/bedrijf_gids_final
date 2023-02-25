package sr.unasat.bedrijfgids.controller;

import sr.unasat.bedrijfgids.DAO.BedrijfDAO;
import sr.unasat.bedrijfgids.configuration.JPAConfiguration;
import sr.unasat.bedrijfgids.entity.Bedrijf;

import javax.persistence.EntityManager;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("bedrijf")
public class BedrijfController {
    private BedrijfDAO bedrijfDAO = new BedrijfDAO((EntityManager) JPAConfiguration.getEntityManager());

    @Path("/getAll")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Bedrijf> retrieveBedrijfList() {
        return bedrijfDAO.retrieveBedrijfList();
    }
}