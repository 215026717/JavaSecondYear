//outputs solution to mathematical expressions (run from terminal) input must resemble 3 + 4 \* 100 / \( 5 \^ 2 - 1 \)
import java.util.*;
public class Mathe{
	public static void main(String[] args){
		Stack<String> rator = new Stack();
		Stack<Integer> rand = new Stack();
		String a;
		for (int i = 0; i < args.length; i++){
			a = args[i];
			if (isInt(a))
				rand.push(Integer.parseInt(a));
			else if (a.equals("("))
				rator.push(a);
			else if (a.equals(")")){
				while (!(rator.peek().equals("("))){
					rand.push(process(rator,rand));
				}
				rator.pop();
			}
			else{
				if (((rator.empty()) || ((a.equals("*") || a.equals("/")) && (rator.peek().equals("+") || rator.peek().equals("-"))) || (a.equals("^") && !(rator.peek().equals("^")))) || rator.peek().equals("(")){
					rator.push(a);
				}
				else{
					while (!(((rator.empty()) || ((a.equals("*") || a.equals("/")) && (rator.peek().equals("+") || rator.peek().equals("-")))) || (a.equals("^") && !(rator.peek().equals("^"))) || rator.peek().equals("("))){
						rand.push(process(rator,rand));
					}
				rator.push(a);
				}
			}
		}
		while (rator.empty() == false){
			rand.push(process(rator,rand));
		}
		System.out.println(rand.peek());
	}
	public static boolean isInt(String str){
		try{
			Integer.parseInt(str);
			return true;
		}
		catch (NumberFormatException e){
			return false;
		}
	}
	public static int expre(String str, int c, int d){
		if (str.equals("+"))
			return (d+c);
		else if (str.equals("-"))
			return (d-c);
		else if (str.equals("/"))
			return (d/c);
		else if (str.equals("^"))
			return ((int)Math.pow(d,c));
		else
			return (d*c);
	}
	public static int process(Stack<String> R, Stack<Integer> D){
		return expre(R.pop(),D.pop(),D.pop());
	}
}
