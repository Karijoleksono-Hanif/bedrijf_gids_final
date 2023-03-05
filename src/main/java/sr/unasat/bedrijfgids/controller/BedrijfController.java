package sr.unasat.bedrijfgids.controller;

import sr.unasat.bedrijfgids.entity.Bedrijf;
import sr.unasat.bedrijfgids.repositoryDAO.BedrijvenRepository;
import sr.unasat.bedrijfgids.service.BedrijfService;
import sr.unasat.bedrijfgids.service.BedrijvenService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("bedrijven")
public class BedrijfController {

    BedrijfService bedrijfService;
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Bedrijf> readBedrijven(){
        System.out.println("getBedrijven called....");

        return bedrijfService.readBedrijven();
    }

}