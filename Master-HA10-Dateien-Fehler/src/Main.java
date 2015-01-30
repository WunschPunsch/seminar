import java.io.File;


public class Main {

	public static void main(String[] args) {
		
		//Aufgabe 10-1
		FileInfo.printFileInfo(new File("test.txt"));
		
		
		System.out.println("\n===============\n");
		
		
		//Aufgabe 10-2
		int[] i = {1,2,3,4,5,6,7,8};
		System.out.println("Das Ergebnis ist " + AddNumbers.addNumbers(i));
		
		
	}

}
