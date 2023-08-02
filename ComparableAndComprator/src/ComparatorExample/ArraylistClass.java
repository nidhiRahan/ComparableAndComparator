package ComparatorExample;

import java.util.ArrayList;
import java.util.Collections;

import ComparableExample.Emp;

public class ArraylistClass {

	public static void main(String[] args) {
		ArrayList<Emp1> al=new ArrayList<>();
		al.add(new Emp1("Nidhi",13,"12365"));
		al.add(new Emp1("sandhya",8,"12323"));
		al.add(new Emp1("diksha",19,"123344"));
		al.add(new Emp1("poorvi",11,"123"));
		
		Collections.sort(al,new SortUsingId());
		System.out.println(al);
		
		ArrayList<Emp1> al2=new ArrayList<>(al);
		Collections.sort(al2, new SortUsingName());
		System.out.println(al2);
		
	}

}
