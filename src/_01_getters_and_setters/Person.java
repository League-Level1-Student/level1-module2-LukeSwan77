package _01_getters_and_setters;

public class Person {
private String name;
private String superPower;
String getName() {
	return name;
}
String getSuperPower() {
	return superPower;
}
void setName(String name) {
	this.name = name;
}
void setSuperPower(String superPower) {
	this.superPower = superPower;
}
public String toString() {
	return name + " has " + superPower;
}
}
