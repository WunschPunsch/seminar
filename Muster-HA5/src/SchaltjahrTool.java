
public class SchaltjahrTool {
	
	boolean istSchaltjahrGregorianisch(int jahr) {
		 return ((jahr % 4 == 0) && (jahr % 100 != 0)) || (jahr % 400 == 0);
	}
	
	boolean istSchaltjahrIslamisch(int jahr) {
		int[] reste = {2,5,7,10,13,16,18,21,24,26,29};
		
		for (int i = 0; i < reste.length; i++){
			if ((jahr % 30 == reste[i])) {
				return true;
			}
		}
		
		return false;
	}
	
	boolean istSchaltjahrGregUndIslam(int jahr) {
		if (istSchaltjahrGregorianisch(jahr) && istSchaltjahrIslamisch(jahr)){
			return true;
		} else {
			return false;
		}
	}
	 
}
