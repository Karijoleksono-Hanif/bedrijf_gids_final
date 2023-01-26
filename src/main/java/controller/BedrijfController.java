package controller;

import entity.Bedrijf;
import service.BedrijfService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

public class BedrijfController {

        @Path("bedrijf")
        public class bedrijfController {
            private BedrijfService bedrijfService = new BedrijfService();

            @Path("/list")
            @GET
            @Produces(MediaType.APPLICATION_JSON)
            public List<Bedrijf> findAll() {
                return bedrijfService.readBedrijven();
            }
//
//        @Path("/add")
//        @POST
//        @Consumes(MediaType.APPLICATION_JSON)
//        @Produces(MediaType.APPLICATION_JSON)
//        public Book add(Book book) {
//            return bookService.add(book);
//        }
//
//        @Path("/update")
//        @PUT
//        @Consumes(MediaType.APPLICATION_JSON)
//        @Produces(MediaType.APPLICATION_JSON)
//        public Book update(Book book) {
//            return bookService.update(book);
//        }
//
//        @Path("/remove")
//        @DELETE
//        @Consumes(MediaType.APPLICATION_JSON)
//        @Produces(MediaType.APPLICATION_JSON)
//        public Book remove(Book book) {
//            return bookService.delete(book);
//        }
//
//        @Path("/getBook")
//        @POST
//        @Consumes(MediaType.APPLICATION_JSON)
//        @Produces(MediaType.APPLICATION_JSON)
//        public Book getBook(Book book) {
//            return bookService.getBook(book);
//        }


        }
}
