/*

Solution to https://rmc15.kattis.com/problems/classy
Rocky Mountain Regional Contest 2015

*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class classypeople {
	public static class person implements Comparable<person>{
		public String name;
		public ArrayList<Integer> rank;
		public person(){}
		public person(String name, String title){
			this.name = name;
			this.rank = new ArrayList<Integer>();
			String[] edit = title.split("-");
			for(int i = edit.length-1; i >= 0; i--){
				if(edit[i].equals("upper")) rank.add(3);
				else if(edit[i].equals("middle")) rank.add(2);
				else rank.add(1);
			}
			String end = edit[edit.length-1];
			int val = 0;
			for(int i = 0; i < 10; i++){
				rank.add(2);
			}

		}

		@Override
		public int compareTo(person o) {
			person p = (person)o;
			for(int i = 0; i < 10; i++){
				if(this.rank.get(i) == p.rank.get(i))
					continue;
				if(this.rank.get(i) > p.rank.get(i))
					return -1;
				if(this.rank.get(i)< p.rank.get(i))
					return 1;
			}
			return this.name.compareTo(p.name);
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for(int z=0; z<t; z++){
			int n = in.nextInt();
			in.nextLine();

			ArrayList<person> list= new ArrayList<person>() ;
			for(int i = 0; i< n; i++){
				String[] s = in.nextLine().split(" ");
				String word = s[0].replaceAll(":","");
				list.add(new person(word, s[1]));
			}

			Collections.sort(list);
			for(person p:list){
				System.out.println(p.name);
			}
			System.out.println("==============================");
		}

	}

}
