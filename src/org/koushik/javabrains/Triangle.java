package org.koushik.javabrains;

public class Triangle {
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	private String type;
	
	public void draw(){
		System.out.println(getType() + " Triangle drawn");
	}

}
