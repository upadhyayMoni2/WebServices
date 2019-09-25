/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myapp;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author 1894220
 */
@Path("cegepgim")
public class GenericResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of GenericResource
     */
    public GenericResource() {
    }

    /**
     * Retrieves representation of an instance of myapp.GenericResource
     * @return an instance of java.lang.String
     */
    
    @GET
    @Path("method1")
    @Produces(MediaType.TEXT_PLAIN)
    public String getText() {
        
        return "Hello !!!!";
    }
    
    @GET
    @Path("method2")
    @Produces(MediaType.TEXT_PLAIN)
    public String getText1() {
        
        return "Hello mornigsss!!!!";
    }

  
    @GET
    @Path("method3&{theName}&{theAge}")
    @Produces(MediaType.TEXT_PLAIN)
    public String getText2(@PathParam("theName")String name,@PathParam("theAge")int age ) {
        
        return "Hello "+name +" your age is "+age;
    }
     @GET
    @Path("method4&{theValue1}&{theValue2}")
    @Produces(MediaType.TEXT_PLAIN)
    public String getText3(@PathParam("theValue1")int value1,@PathParam("theValue2")int value2 ) {
       
        
        return "Sum is "+(value1+value2) ;
    }

     @GET
    @Path("method5")
    @Produces(MediaType.TEXT_HTML)
    public String getText4() {
       
        
        return "<p><i><b><strong>Hello</strong></b></i></p>" ;
    }

       @GET
    @Path("method6")
    @Produces(MediaType.APPLICATION_XML)
    public String getText5() {
        return "<note><to>Tove</to><from>Jami</from><heading>REminder</heading><body>Dont froget this weekend !!!!</body></note>";
    }
  
    
         @GET
    @Path("method7")
    @Produces(MediaType.APPLICATION_JSON)
    public String getText6() {
        return "{ \"id \": 12235 , \"fname\" :\"monika\" , \"lname\" : \"upadhyay\" ,\"GPA\" : 8.09}";
    }
  
         @GET
    @Path("method8&{fName}&{lName}")
    @Produces(MediaType.APPLICATION_JSON)
    public String getText7(@PathParam("fName")String fname,@PathParam("lName")String lname) {
        return  "{ \"id \": 1,\n" +
" \"fname \" :'"+fname+"',\n" +
" \"lname \" :'"+lname+"' ,\n" +
" \"Salary\" : 1000}";
    }
}
