package _02_sea_creature;

public class SeaCreatureRunner {
public static void main(String[] args) {
	SeaCreature bob = new SeaCreature("SpongeBob");
	bob.eat();
	bob.laugh();
	SeaCreature joe = new SeaCreature("Patrick");
	joe.getName();
	joe.eat();
	joe.laugh();
	SeaCreature jim = new SeaCreature("Squidward");
	jim.getName();
	jim.eat();
	jim.laugh();
}
}
