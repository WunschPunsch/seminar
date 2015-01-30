
package spinfo.io;

import java.io.*;
/**
 *
 * @author  jhermes
 */
public class Application {
      
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
    	File inFile = new File("daeumeli.txt");
    	printFile(inFile);
    
    }

	private static void printFile(File inFile) throws FileNotFoundException, IOException {
		FileInputStream in = new FileInputStream(inFile);
		InputStreamReader isr = new InputStreamReader(in, "ISO-8859-1");
    	BufferedReader bufferedReader = new BufferedReader(isr);
        
        StringBuffer textBuffer = new StringBuffer();
       
        String currentLine;
        while((currentLine = bufferedReader.readLine())!=null){
            textBuffer.append(currentLine);
            textBuffer.append("\n"); // Zeilenumbruch hinzufÃ¼gen
        }
        
        bufferedReader.close();
        String text = textBuffer.toString();
        
        //HA 11-1
        System.out.println(text + "\n\n");
        System.out.println("Anzahl Zeilenumbrüche: " + (text.split("\n").length-1));
        System.out.println("Anzahl Leerzeichen: " + (text.split(" ").length-1));
        System.out.println("Anzahl Zeichen: " + text.length());
	}
    
}
