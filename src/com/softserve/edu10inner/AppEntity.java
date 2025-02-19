package com.softserve.edu10inner;

public class AppEntity {
	public static void main(String[] args) {
		System.out.println("\tstart main");
		Entity e1;
		System.out.println("\tEntity e1; done");
		e1 = new Entity();
		System.out.println("\tnew Entity(); done");
		Entity e2 = new Entity();
		Entity e3 = new Entity();
		System.out.println("Count of Entity objects = " 
				+ Entity.getCount());
	}
}