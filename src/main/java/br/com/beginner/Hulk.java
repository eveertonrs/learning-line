package br.com.beginner;

public class Hulk extends Hero {
	private boolean superForce;

	
	public void transform() {
		this.superForce = !this.superForce;
		double force = super.getForce();
		if (superForce) {
			super.setForce(force * 10);
		} else {
			super.setForce(force / 10);
		}

	}

	public boolean isSuperForce() {
		return superForce;
	}

	public void setSuperForce(boolean superForce) {
		this.superForce = superForce;
	}

}
