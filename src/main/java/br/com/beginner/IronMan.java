package br.com.beginner;

public class IronMan extends Hero {

	boolean hasArmorActivated;

	public void wearArmor() {
		this.hasArmorActivated = !this.hasArmorActivated;
		double force = super.getForce();
		if (hasArmorActivated) {
			super.setForce(force + 10);
		} else {
			super.setForce(force - 10);
		}
	}

	public boolean isHasArmorActivated() {
		return hasArmorActivated;
	}

	public void setHasArmorActivated(boolean hasArmorActivated) {
		this.hasArmorActivated = hasArmorActivated;
	}
}
