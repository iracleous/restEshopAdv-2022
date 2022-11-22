package gr.codehub.resteshopadv2022.resource;

import gr.codehub.resteshopadv2022.model.Student;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;

@Path("/eshop")
public class HelloResource {
    @GET
    @Produces("text/plain")
    @Path("1")
    public Student one(){
        Student student = new Student();
        student.setName("George");
        student.setAge(18);
        return student;
    }

    @GET
    @Produces("text/plain")
    @Path("2")
    public String two() {
        return "Hello, World! 2";
    }

    @GET
    @Produces("text/plain")
    @Path("2")
    public String three() {
        return "Hello, World! 3";
    }

}