package sr.unasat.bedrijfgids;

import jakarta.persistence.EntityManager;
import sr.unasat.bedrijfgids.configuration.JPAConfiguration;
import sr.unasat.bedrijfgids.dao.BedrijfRepository;
import sr.unasat.bedrijfgids.entity.Bedrijf;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.List;

@Path("/hello-world")
public class HelloWorld {

    @GET
    @Produces("text/plain")
    public String hello() {
        return "Hello, World!";

    }
}
