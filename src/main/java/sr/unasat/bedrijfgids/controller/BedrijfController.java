package sr.unasat.bedrijfgids.controller;

import sr.unasat.bedrijfgids.DAO.BedrijfDAO;
import sr.unasat.bedrijfgids.configuration.JPAConfiguration;
import sr.unasat.bedrijfgids.entity.Bedrijf;
import sr.unasat.bedrijfgids.service.BedrijfService;

import javax.persistence.EntityManager;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("bedrijf")
public class BedrijfController {


    BedrijfService bedrijfService = new BedrijfService(JPAConfiguration.getEntityManager());


    @Path("/getAll")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Bedrijf> retrieveBedrijfList() {
        List<Bedrijf> b =bedrijfService.readBedrijven();
        return bedrijfService.readBedrijven();
    }
}