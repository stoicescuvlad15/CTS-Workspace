package ro.ase.cts.dp.builder;

public class SuperHero {

	String name;
	int lifePoints;
	boolean isVillan;
	boolean isWounded;

	WeaponInterface leftWeapon;
	WeaponInterface rightWeapon;

	String superPower;
	String superSuperPower;

	// Default constructor
	private SuperHero() {

	}

	// Constructor with parameters
	private SuperHero(String name, int lifePoints, boolean isVillan, boolean isWounded, WeaponInterface leftWeapon,
			WeaponInterface rightWeapon, String superPower, String superSuperPower) {
		super();
		this.name = name;
		this.lifePoints = lifePoints;
		this.isVillan = isVillan;
		this.isWounded = isWounded;
		this.leftWeapon = leftWeapon;
		this.rightWeapon = rightWeapon;
		this.superPower = superPower;
		this.superSuperPower = superSuperPower;
	}

	// Builder | Inner class
	public static class SuperHeroBuilder {

		private SuperHero superhero = null;

		public SuperHeroBuilder(String name, int lifePoints) {
			superhero = new SuperHero();
			superhero.name = name;
			superhero.lifePoints = lifePoints;
		}

		public SuperHeroBuilder isVillan() {
			superhero.isVillan = true;
			return this;
		}

		public SuperHeroBuilder isWounded() {
			superhero.isWounded = true;
			return this;
		}

		public SuperHeroBuilder addLeftWeapon(WeaponInterface weapon) {
			superhero.leftWeapon = weapon;
			return this;
		}

		public SuperHeroBuilder addRightWeapon(WeaponInterface weapon) {
			superhero.rightWeapon = weapon;
			return this;
		}

		public SuperHeroBuilder addSuperPower(String superPower) {
			superhero.superPower = superPower;
			return this;
		}

		public SuperHeroBuilder addSuperSuperPower(String superSuperPower) {
			superhero.superSuperPower = superSuperPower;
			return this;
		}

		// Don't forget to provide this method
		public SuperHero build() {
			return this.superhero;
		}
	}

}
