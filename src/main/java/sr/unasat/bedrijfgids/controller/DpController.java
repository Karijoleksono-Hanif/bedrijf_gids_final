package sr.unasat.bedrijfgids.controller;

import jakarta.servlet.http.HttpServlet;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import sr.unasat.bedrijfgids.dp_factory.GenereerFactuur;

import java.io.IOException;

//@Path("/designPatterns")
public class DpController extends HttpServlet {

//    @Path("/genereerFactuur")
//    @POST
//    @Consumes(MediaType.APPLICATION_JSON)
//    @Produces(MediaType.APPLICATION_JSON)

    public void doPost(HttpServlet req, HttpServlet res) throws IOException{
        GenereerFactuur.factuur();
    }
}
