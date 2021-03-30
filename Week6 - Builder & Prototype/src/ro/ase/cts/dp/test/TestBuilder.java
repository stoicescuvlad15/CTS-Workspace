package ro.ase.cts.dp.test;

import ro.ase.cts.dp.builder.Pistol;
import ro.ase.cts.dp.builder.SuperHero;
import ro.ase.cts.dp.builder.SuperHero.SuperHeroBuilder;
import ro.ase.cts.dp.builder.SuperHeroesDirector;

public class TestBuilder {

	public static void main(String[] args) {

		/*
		 * //1. Create the object SuperHero superHero = new SuperHero(); //2. Initialize
		 * the object | TODO: Don't forget! superHero.name = "Superman";
		 * superHero.lifePoints = 100;
		 */

		/*
		 * SuperHero superHero = new SuperHero("Superman", 100, false, false, null, new
		 * Pistol(), "Laser eyes", null);
		 */

		SuperHero superman = new SuperHero.SuperHeroBuilder("Superman", 100)
				.addSuperPower("Fly")
				.addLeftWeapon(new Pistol())
				.build();

		// superman.superPower = "fly";

		SuperHero joker = new SuperHero.SuperHeroBuilder("Joker", 200)
				.isVillan()
				.addLeftWeapon(new Pistol())
				.addRightWeapon(new Pistol())
				.build();
	}

	SuperHeroesDirector catalogue = new SuperHeroesDirector(new SuperHeroBuilder("Joker", 200));
	
	SuperHero jokerClone = catalogue.buildJoker();
	
}
