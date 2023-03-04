package sr.unasat.bedrijfgids;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/hello-world")
public class HelloWorld {

    @GET
    @Produces("text/plain")
    public String hello() {
        return "Hello, World! hi dit is een update test";

    }
}
