package service;

import dao.FbDao;
import dto.Fb_login;

public class login_Service {

	FbDao dao = new FbDao();
   Fb_login fb_login=new Fb_login();
	

	public Fb_login save(Fb_login fb_login) {

		return dao.save(fb_login);
	}
	
	
	
}
