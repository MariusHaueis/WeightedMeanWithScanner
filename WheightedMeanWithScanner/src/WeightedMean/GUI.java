package WeightedMean;
/**
 * This class represents the input and output management of this project.
 * @author Marius Haueis
 * @version 30.03.2021
 */
import java.util.ArrayList;
import java.util.Scanner;


public class GUI {
	public Scanner sc;
	public WeightedMeanCalculator wmc;
	double t =0;
	
	public GUI() {
		wmc = new WeightedMeanCalculator();
		sc = new Scanner(System.in);
	}
	public void action() {
		t = sc.nextInt();
		ArrayList<Integer> numbers = new ArrayList<Integer>((int) t);
		ArrayList<Integer> numbers2 = new ArrayList<Integer>((int) t);
		for (int i = 0; i < t; i++) {
			int k = sc.nextInt();
			numbers.add(k);
		}
		for (int i = 0; i < t; i++) {
			int k = sc.nextInt();
			numbers2.add(k);
		}
		wmc.weightedMean(numbers, numbers2);		
}
}
