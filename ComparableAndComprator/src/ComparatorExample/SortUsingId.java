package ComparatorExample;

import java.util.Comparator;

public class SortUsingId  implements Comparator<Emp1>{

	

	@Override
	public int compare(Emp1 o1, Emp1 o2) {
		
		return o1.getId()-o2.getId();
	}

}
