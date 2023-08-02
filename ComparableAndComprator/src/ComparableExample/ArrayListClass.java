package ComparableExample;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListClass {

	public static void main(String[] args) {
		ArrayList<Emp> al=new ArrayList<>();

		 al.add(new Emp("Durgesh","123123123",12));
		 al.add(new Emp("Durgesh","123123123",11));
		 al.add(new Emp("Durgesh","123123123",6));
		 al.add(new Emp("Durgesh","123123123",7));
		 Collections.sort(al);
		 System.out.println(al);
		 
		 
		 
	}

}
