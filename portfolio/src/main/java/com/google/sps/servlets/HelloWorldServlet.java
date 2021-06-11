package com.google.sps.servlets;

import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/** Handles requests sent to the /hello URL. Try running a server and navigating to /hello! */
@WebServlet("/hello")
public class HelloWorldServlet extends HttpServlet {

  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
    response.setContentType("text/html;");
    response.getWriter().println("<h1>Hello Iann Sebastian!</h1>");
    response.getWriter().println("<h1>You must be the change you wish to see in the world.</h1>");
    response.getWriter().println("<h1>That which does not kill us makes us stronger.</h1>");
    response.getWriter().println("<h1>There are mysteries to the universe we were never meant to solve, but who we are and why we are here are not among them. Those answers we carry inside.</h1>");
  }
}
