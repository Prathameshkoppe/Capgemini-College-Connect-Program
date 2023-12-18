package coolections;
import java.util.ArrayList;

public class Colours {
	
	public static void main(String[] args) {
		
	
	ArrayList<String> color=new ArrayList<String>();
	color.add("red");
	color.add("Green");
	color.add("Blue");
	color.add("Pink");
	color.add("Black");
	color.add("white");
	color.add("Yellow");
	
	System.out.println(color);//1
	
	
	
	for (String clr : color) {
	    System.out.println(clr);//2
	
	}
	
	color.add(1,"Skyblue");//3
	
	
	System.out.println();
	System.out.println(color.get(3));//4
	
	color.set(3,"gray");//5
	
	System.out.println(color);//5
	
	
	System.out.println();
	
	color.remove(3);//6
	System.out.println(color);//6
	
	
	System.out.println(color.contains("red"));//7
	

	
	
	

	
	

}
}
