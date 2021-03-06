package in.co.rays.proj4.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.co.rays.proj4.util.ServletUtility;

@WebServlet("/WelcomeCtl")
public class WelcomeCtl extends BaseCtl {
	
@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
//        log.debug("WelcomeCtl Method doGet Started");
    ServletUtility.forward(getView(), req, resp);

}	
	@Override
	protected String getView() {
		return ORSView.WELCOME_VIEW;
	}
	
}