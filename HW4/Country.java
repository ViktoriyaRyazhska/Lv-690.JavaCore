package Homework4;

import Homework4.Main.Cont;

public class Country {
	private String name;
	private Cont cont;
	public Country(String name, Cont cont) {
		this.name = name;
		this.cont = cont;
	}
	public String getname() {
		return name;
	}	
	public Cont getcont() {
		return cont;
	}	
	
}
