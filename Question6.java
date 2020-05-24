package assignments.day_4;

public class Question6 {

	public static void main(String[] args) {
		
		int numberOfMiligrams=500;
		int gramToMiligram= 10*1000;
		int lethalOverdose= gramToMiligram/numberOfMiligrams;
		
		System.out.println(("Number of miligrams in drink: " + numberOfMiligrams));
		
		System.out.println("It would take about " + lethalOverdose + " drinks for a lethal overdose");
	
	}

}
