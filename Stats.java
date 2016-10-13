public class Stats{
	public static double deviation(double[] x){
		double sum = 0;
		double mean = mean(x);
		for (int i = 0; i < x.length; i++){
			sum += (Math.pow(x[i] - mean,2)); //subtracts mean from data for the iteration with range length of the array then adds to sum
		}
		return (Math.sqrt(sum /(x.length - 1)));//divides the sum of data minus mean by the number of data minus 1 then square roots it (this gets returned)
	}
	public static double mean(double[] x){
		double sum = 0;
		for(int i = 0; i < x.length; i++){
			sum += x[i];
		}
		return (sum / x.length); //returns the mean (sum divided by the number of data)
	}
	}