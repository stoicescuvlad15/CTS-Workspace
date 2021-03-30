package ro.ase.cts.dp.builder;

import ro.ase.cts.dp.builder.SuperHero.SuperHeroBuilder;

public class SuperHeroesDirector {

	SuperHero.SuperHeroBuilder builder;
	
	public SuperHeroesDirector(SuperHeroBuilder builder) {
		this.builder = builder;
	}
	
	public SuperHero buildJoker() {
		return builder.isVillan()
				.addLeftWeapon(new Pistol())
				.addRightWeapon(new Pistol())
				.build();
	}
	
	public SuperHero buildSuperman() {
		return builder.addSuperPower("Fly")
				.addLeftWeapon(new Pistol())
				.build();
	}
	
}
