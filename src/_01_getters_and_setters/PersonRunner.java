package _01_getters_and_setters;

public class PersonRunner {
public static void main(String[] args) {
	Person other = new Person();
	other.setName("bobaaaaaaay");
	other.setSuperPower("invisibility");
	other.getName();
	other.getSuperPower();
	System.out.println(other.toString());
}
}
