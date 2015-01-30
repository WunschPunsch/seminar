
public class Application {

	public static void main(String[] args) {
		
		VokalZaehler zaehler = new VokalZaehler();
		
		zaehler.zaehleVokale("hallo!");
		zaehler.zaehleVokale("In diesem Satz gibt es nicht besonders viele a's.");
		zaehler.zaehleVokale("aabaabaaaaaaabbbaeiou");
		zaehler.zaehleVokale("AABAABAAAAAAABBBAEIOU");
		
	}

}
