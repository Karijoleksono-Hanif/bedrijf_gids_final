package sr.unasat.bedrijfgids;


import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;

@Path("/hello-world")
public class HelloWorld {

    @GET
    @Produces("text/plain")
    public String hello() {
        return "Hello, World! hi dit is een update test";

    }
}
