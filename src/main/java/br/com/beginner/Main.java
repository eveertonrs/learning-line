package br.com.beginner;

public class Main {


	public static void main(String[] args) {

		Hulk hulk = new Hulk();
		
		hulk.setName("Bruce Banner");
		hulk.setForce(1.5);
		hulk.training();
		hulk.setSuperForce(false);
		hulk.transform();

		IronMan ironMan = new IronMan();
		
		ironMan.setName("Tony Stark");
		ironMan.setForce(1.0);
		ironMan.training();
		ironMan.setHasArmorActivated(false);
		ironMan.wearArmor();
		
		
		System.out.println("this name hero is " + ironMan.getName());
		System.out.println("this power hero is " + ironMan.getForce());
		
		
	}
}
