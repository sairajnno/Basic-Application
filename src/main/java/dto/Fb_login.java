package dto;

import javax.persistence.Entity;

@Entity
public class Fb_login {

	private int id;
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Fb_login [id=" + id + ", name=" + name + "]";
	}
   
	
}
