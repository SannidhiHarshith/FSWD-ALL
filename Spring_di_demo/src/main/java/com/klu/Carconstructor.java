package com.klu;

import org.springframework.stereotype.Component;

@Component
public class Carconstructor {
	private Engine eng;
	
	//constructor dependency
	public Carconstructor(Engine engine) {
		this.eng=engine;
	}
	
	public void drive() {
		System.out.println("constructor injection: "+ eng.type());
	}

}
