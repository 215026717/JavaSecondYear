import java.io.*;
import java.util.*;
public class IrisStats_{

public static void addProperty(ArrayList<Double> iList,String token){
	double value = Double.parseDouble(token);
	iList.add(value);
}

public static double getAverage(ArrayList<Double> iList){
	double sum=0;
	for(int i=0;i<iList.size();i++){
		sum+=iList.get(i);
	}
	return sum/iList.size(); 
}

public static double getSD(ArrayList<Double> iList){
	double sd=0;
	for(int i=0;i<iList.size();i++){
		sd += (iList.get(i)-getAverage(iList))*(iList.get(i)-getAverage(iList));
	}
	return Math.sqrt(sd/iList.size());
}

public static double getMin(ArrayList<Double> iList){
	double min = iList.get(0);
	for (int j=1;j<iList.size();j++){
		if (iList.get(j) < min)
			min = iList.get(j);
		}
	return min;

}

public static double getMax(ArrayList<Double> iList){
	double max = iList.get(0);
	for (int j=1;j<iList.size();j++){
		if (iList.get(j) > max)
			max = iList.get(j);
		}
	return max;
}
public static double getMedian(ArrayList<Double> iList){
	double med;
	Collections.sort(iList);
	if(iList.size()%2!=0)
		med = iList.get((iList.size()+1)/2);
	else
		med = (iList.get(iList.size()/2-1) + iList.get((iList.size())/2))/2;
	return med;
}
public static double getMode(ArrayList<Double> iList){
	double freq=Collections.frequency(iList,iList.get(0));
	double mod = iList.get(0);
	for (int i=1;i<iList.size();i++){
		if (mod!=iList.get(i) && Collections.frequency(iList,iList.get(i))>freq){
			freq = Collections.frequency(iList,iList.get(i));
			mod = iList.get(i);
		}
	}
	return mod;
}

public static void displayStats(ArrayList<Double> sl,ArrayList<Double> sw,
										  ArrayList<Double> pl,ArrayList<Double> pw){
	System.out.printf("%-15s%-15s%-15s%-15s%-15s\n","Property","Sepal Length","Sepal Width",
														  "Petal Length","Petal Width");
	System.out.printf("%-15s%-15.2f%-15.2f%-15.2f%-15.2f\n","Average",getAverage(sl),getAverage(sw),
														  getAverage(pl),getAverage(pw));
	System.out.printf("%-15s%-15.2f%-15.2f%-15.2f%-15.2f\n","STD Deviation",getSD(sl),getSD(sw),
														  getSD(pl),getSD(pw));
	System.out.printf("%-15s%-15.2f%-15.2f%-15.2f%-15.2f\n","Min",getMin(sl),getMin(sw),
														  getMin(pl),getMin(pw));
	System.out.printf("%-15s%-15.2f%-15.2f%-15.2f%-15.2f\n","Max",getMax(sl),getMax(sw),
														  getMax(pl),getMax(pw));
	System.out.printf("%-15s%-15.2f%-15.2f%-15.2f%-15.2f\n","Median",getMedian(sl),getMedian(sw),
														  getMedian(pl),getMedian(pw));
	System.out.printf("%-15s%-15.2f%-15.2f%-15.2f%-15.2f\n","Mode",getMode(sl),getMode(sw),
														  getMode(pl),getMode(pw));
}
public static void main(String[] args){
try{
	Scanner input = new Scanner(new File("iris.data"));	
	ArrayList<Double> slList = new ArrayList<Double>();
	ArrayList<Double> swList = new ArrayList<Double>();
	ArrayList<Double> plList = new ArrayList<Double>();
	ArrayList<Double> pwList = new ArrayList<Double>();
	while(input.hasNext()){
	String line = input.nextLine();
	String[] tokens = line.split(",");
	addProperty(slList,tokens[0]);
	addProperty(swList,tokens[1]);
	addProperty(plList,tokens[2]);
	addProperty(pwList,tokens[3]);
	}
	displayStats(slList,swList,plList,pwList);
	}
	catch(IOException e){
	System.out.println("Unable to open file: "+e);
}


}

}
