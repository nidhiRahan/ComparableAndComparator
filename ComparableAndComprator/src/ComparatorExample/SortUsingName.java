package ComparatorExample;

import java.util.Comparator;

public class SortUsingName implements Comparator<Emp1>{

	@Override
	public int compare(Emp1 o1, Emp1 o2) {
		return o1.getName().compareTo(o2.getName());
	}

	



}
