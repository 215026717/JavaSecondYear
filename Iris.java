// Mongezi Nene - 215026717, Thandolwakhe Nkosi - 212524486, Maxwell Mahlaba - 215025373, Minenhle Msomi - 214509695
import java.util.*;
//import java.io.*;
public class Iris{
	public static void main(String[] args){
		String data = "";
		List<Double> Averages = new ArrayList<Double>();
		double a,b,c,d,ave;
		int setosa = 0;
		int versi = 0;
		int virgin = 0;
		int counter = 0;
		ArrayList<Double> Setosa = new ArrayList<Double>();
		ArrayList<Double> Versi = new ArrayList<Double>();
		ArrayList<Double> Virgin = new ArrayList<Double>();
		try{
			Scanner input = new Scanner(new File("Iris.data"));
			while (input.hasNext()){
				data = input.nextLine();
				a = Double.parseDouble(data.split(",")[0]);
				b = Double.parseDouble(data.split(",")[1]);
				c = Double.parseDouble(data.split(",")[2]);
				d = Double.parseDouble(data.split(",")[3]);
				ave = (a+b+c+d)/4;
				Averages.add(ave);
				if (data.split(",")[4].equals("Iris-setosa"))
					Setosa.add(ave);
				if (data.split(",")[4].equals("Iris-versicolor"))
					Versi.add(ave);				
				if (data.split(",")[4].equals("Iris-virginica"))
					Virgin.add(ave);
			}
			Collections.sort(Averages);
			for (double i:Averages){
				while (Setosa.contains(i)){
					if (setosa + versi + virgin == 50)
						break;
					setosa += 1;
					Setosa.remove(i);
					counter ++;
				}
				while (Versi.contains(i)){
					if (setosa + versi + virgin == 50)
						break;
					versi += 1;
					Versi.remove(i);
					counter ++;
				}
				while (Virgin.contains(i)){
					if (setosa + versi + virgin == 50)
						break;
					virgin += 1;
					Virgin.remove(i);
					counter ++;
				}
				if (setosa + versi + virgin == 50){
					System.out.println("Classes in Range: "+ (counter-50) + " - " + (counter-1));
					System.out.println(" Iris-setosa\t\t" + setosa);
					System.out.println(" Iris-versicolor\t" + versi);
					System.out.println(" Iris-virginica\t\t" + virgin);
					setosa = 0;
					versi = 0;
					virgin = 0;
				}
				while (Setosa.contains(i)){
					setosa += 1;
					counter ++;
					Setosa.remove(i);
				}
				while (Versi.contains(i)){
					versi += 1;
					Versi.remove(i);
					counter ++;
				}
				while (Virgin.contains(i)){
					virgin += 1;
					Virgin.remove(i);
					counter ++;
				}
			}
		}
		catch(IOException e){
			System.out.println("No File"+ e);
		}
	}
}