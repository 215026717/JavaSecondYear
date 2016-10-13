public class StatsTest{
	public static void main(String[] args){
		Stats ia = new Stats();
		double [] val = new double[10];
		val[0] = 4;
		val[1] = 5;

		System.out.println(ia.deviation(val));
	}
}