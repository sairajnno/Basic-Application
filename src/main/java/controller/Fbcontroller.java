package controller;

import dto.Fb_login;
import service.login_Service;

public class Fbcontroller {

	public static void main(String[] args) {

		login_Service login_Service = new login_Service();
		Fb_login fb_login = new Fb_login();

		
		login_Service login_Service2 = new login_Service();
                  
		fb_login.setId(3);
		fb_login.setName("saikuamr");
		login_Service2.save(fb_login);
		System.out.println("data is saved");
		

	}
}
