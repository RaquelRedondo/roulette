import java.util.Collection;
import java.util.Set;
import java.util.TreeSet;


public class Bin {
	Set<Outcome> outcomes = new TreeSet<Outcome>();
	
	//TODO Bin constructor
	Bin(Outcome[] array){
		
	}
	
	//TODO Bin constructor
	Bin(Collection<Outcome> collection){
		
	}
	
	public  void add(Outcome oc){
		outcomes.add(oc);
	}
	
	public String toString(){
		StringBuffer outcomeString = new StringBuffer();
		for (Outcome oc : outcomes){
			outcomeString.append(oc);
		}
		return outcomeString.toString();
	}
}
