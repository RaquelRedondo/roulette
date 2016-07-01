
public class Outcome {
	private String name;
	private int odds;
	
	Outcome (String name, int odds){
		this.name = name;
		this.odds = odds;
	}
	
	public int winAmount(int amount){
		int product;
		product = amount * odds;
		return product;
	}
	
	public boolean equals(Outcome outcome){
		if (this.name.equals(outcome.name)){
			return true;
		}
		return false;
	}
	
	public String toString(){
		StringBuffer outcomeString = new StringBuffer();
		outcomeString.append(name).append(" (").append(odds).append(":1) ");
		return outcomeString.toString();
	}
	
}
