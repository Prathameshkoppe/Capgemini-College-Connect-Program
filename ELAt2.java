package coolections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ELAt2 {
	
		public static void main(String[] args) {
			
			ArrayList <Integer> num=new ArrayList<>();
			num.add(3);
			num.add(1);
			num.add(11);
			num.add(7);
			num.add(2);
			num.add(9);
			System.out.println("Sorted:");
			System.out.println(num);
			System.out.println();
			Collections.sort(num);
			System.out.println(num);//8
			
			System.out.println("Copy_Clone:");
			ArrayList copynum= new ArrayList();//9
			copynum=(ArrayList)num.clone();//9
			System.out.println(copynum);//9
			
			System.out.println("Shuffled:");//10
			Collections.shuffle(num);
			System.out.println(num);
			
			System.out.println("reverse");//11
			Collections.reverse(num);
			System.out.println(num);
			
			System.out.println("extraction");//12
			List<Integer>sublist=num.subList(0,3);
			System.out.println(sublist);
			
			System.out.println("Compare:");//13
			if(num.containsAll(copynum)== true) {
				System.out.println("Both are Same");
			}else {
				System.out.println("Both are Diffrent");
			}//13
			
			
			System.out.println("Swaping");//14
			System.out.println(num);
			Collections.swap(num,0,3);

			System.out.println(num);//14
			
			System.out.println("Join two List");
			ArrayList<Integer> a = new ArrayList<>();
	        a.addAll(num);
	        a.addAll(sublist);
	        System.out.println(a);
			
				
			
			
			
			
			
			
			
			
			
			
			
			
		}

		private static void Swap(ArrayList<Integer> num, int i, int j) {
			// TODO Auto-generated method stub
			
		}

	}

