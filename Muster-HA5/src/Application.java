
public class Application {

	public static void main(String[] args) {
		
		SchaltjahrTool sjt = new SchaltjahrTool();
		int jahr = 2008;
		
		System.out.println("Das Jahr " + jahr
				+ (sjt.istSchaltjahrGregorianisch(jahr) ? " IST ein " : " ist KEIN ")
				+ "Schaltjahr im gregorianischen Kalender!");

		System.out.println("Das Jahr " + jahr
				+ (sjt.istSchaltjahrIslamisch(jahr) ? " IST ein " : " ist KEIN ")
				+ "Schaltjahr im islamischen Kalender!");
		
		System.out.println("Das Jahr " + jahr
				+ (sjt.istSchaltjahrGregUndIslam(jahr) ? " IST ein " : " ist KEIN ")
				+ "Schaltjahr in BEIDEN Kalendern!");
		
	}

}
