package WeightedMean;
/**
 * This class calculates the weighted mean of the inputs
 * @author Marius Haueis
 * @version 30.03.2021
 */
import java.util.List;


	public class WeightedMeanCalculator {
		double x = 0;
		double w = 0;

		public void weightedMean(List<Integer> X, List<Integer> W) {

			for (int i = 0; i < X.size(); i++) {
				x += X.get(i) * W.get(i);
			}

			w = W.stream().reduce(0, (a, b) -> a + b);
			double result = x / w;
			System.out.println(round(result, 1));
		}

		private double round(double value, int precision) {
			int scale = (int) Math.pow(10, precision);
			return ((double) Math.round(value * scale)) / scale;
		}
	}

