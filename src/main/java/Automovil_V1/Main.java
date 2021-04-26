package Automovil_V1;

import com.automovil.entity.Auto;

public class Main {

	private static Auto auto;
	
	public static void main(String[] args) {
		auto = new Auto("rojo", "mazda", 2016);
		System.out.println(auto);
		System.out.println(auto.arrancar());
	}

}
