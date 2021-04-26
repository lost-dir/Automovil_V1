package com.automovil.entity;

public class Auto {
	private String color;
	private String marca;
	private int modelo;
	
	public Auto(String color, String marca, int modelo) {
		this.color = color;
		this.marca = marca;
		this.modelo = modelo;
	}
	
	public String toString() {
		return "[color: " + this.color + ", marca: " + this.marca + ", modelo: " + this.modelo + "].";
	}
	
	public String arrancar() {
		return "El auto arrancó!";
	}
}
