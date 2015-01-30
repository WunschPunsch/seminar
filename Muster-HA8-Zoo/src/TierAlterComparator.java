import java.util.Comparator;

import tiere.Tier;


public class TierAlterComparator implements Comparator<Tier>{

	@Override
	public int compare(Tier o1, Tier o2) {
		return o1.getAlter() - o2.getAlter();
	}

}
