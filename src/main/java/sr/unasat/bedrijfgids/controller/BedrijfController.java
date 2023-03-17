package sr.unasat.bedrijfgids.controller;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import sr.unasat.bedrijfgids.entity.Bedrijf;
import sr.unasat.bedrijfgids.service.BedrijfService;
import java.util.List;

@Path("bedrijven")
public class BedrijfController {

    private final BedrijfService bedrijfService = new BedrijfService();
    @GET
    @Path("/getAll")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Bedrijf> readBedrijven(){
        System.out.println("getBedrijven called....");

        return bedrijfService.readBedrijven();
    }
}