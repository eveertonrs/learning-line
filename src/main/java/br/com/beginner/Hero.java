package br.com.beginner;

public class Hero {

	private String name;
	private String sex;
	private int age;
	private double force;

	public void training() {
		this.force = force + 1;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getForce() {
		return force;
	}

	public void setForce(double force) {
		this.force = force;
	}	
}
