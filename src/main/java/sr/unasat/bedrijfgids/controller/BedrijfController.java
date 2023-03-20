package sr.unasat.bedrijfgids.controller;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import sr.unasat.bedrijfgids.dto.BedrijfDTO;
import sr.unasat.bedrijfgids.entity.Bedrijf;
import sr.unasat.bedrijfgids.service.BedrijfService;
import java.util.List;

@Path("/bedrijven")
public class BedrijfController {

    private final BedrijfService bedrijfService = new BedrijfService();

    @Path("/getAll")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Bedrijf> readBedrijven(){
        System.out.println("getBedrijven called....");
        return bedrijfService.readBedrijven();
    }

    @Path("/addBedrijf")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Bedrijf createBedrijf (BedrijfDTO bedrijfDTO){
        return bedrijfService.createBedrijfData(bedrijfDTO);
    }

    @Path("/{id}")
    @DELETE
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response deleteBedrijf(@PathParam("id") Integer id){
        boolean deleteBedrijf = bedrijfService.deleteBedrijf(id);
        System.out.println("succesful delete bedrijf....");
        return Response.ok(deleteBedrijf).build();

    }
}