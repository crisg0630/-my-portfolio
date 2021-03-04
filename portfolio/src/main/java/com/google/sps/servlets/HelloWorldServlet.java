
package com.google.sps.servlets;
 
import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import com.google.gson.Gson;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*; 

 
/** Handles requests sent to the /hello URL. Try running a server and navigating to /hello! */
@WebServlet("/hello")
public class HelloWorldServlet extends HttpServlet {
       ArrayList<String> facts = new ArrayList<String>();

    public HelloWorldServlet (){
       facts.add("I was born and raised in the San Francisco Bay Area");
       facts.add("I started a custom jersey business in high school");
       facts.add("I am fluent in English and Spanish");
       facts.add("I started a coding program to teach students at my former high school how to code");
       facts.add("I was first introduced to coding when I was 15");
    }
  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
       Gson gson = new Gson();
       String json = gson.toJson(facts);

    response.setContentType("application/json;");
    response.getWriter().println(json);
  }
 
}
