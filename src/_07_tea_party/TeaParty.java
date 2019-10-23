package _07_tea_party;

public class TeaParty {
	String name;
	boolean isWoman;
	boolean isKnited;
	public String welcome(String name, boolean isWoman, boolean isKnighted) {
      if(isWoman == true && isKnighted == true) {
    	  return "Lady";
      }
      if(isWoman == true && isKnighted == false){
    	  return "Ms.";
      }
      if(isWoman == false && isKnighted == true) {
    	  return "Sir";
      }
      if(isWoman == false && isKnighted == false){
    	  return "Mr.";
      }
    }
}
