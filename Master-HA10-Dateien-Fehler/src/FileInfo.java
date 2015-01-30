import java.io.File;


/**
 * Aufgabe 10-1
 * @author bkis
 *
 */
public class FileInfo {
	
	public static void printFileInfo(File file){
		String name = file.getPath();
		
		//existiert?
		System.out.println("\"" + name + "\" exists: " + file.exists());
		
		//wenn nicht, beenden
		if (!file.exists()) return;
		
		//ist lesbar?
		System.out.println("\"" + name + "\" is readable: " + file.canRead());
		
		//ist Verzeichnis?
		System.out.println("\"" + name + "\" is directory: " + file.isDirectory());
		
		//wenn ja, wieviele Dateien/Verzeichnisse sind drin?
		if (file.isDirectory())
			System.out.println("\"" + name + "\" contains " + file.listFiles().length + " files/directories.");
		
		//wie groﬂ?
		if (!file.isDirectory())
			System.out.println("\"" + name + "\"'s size: " + file.length() + " bytes");
		
		//wann zuletzt ge‰ndert?
		System.out.println("\"" + name + "\" was last changed: " + file.lastModified());
	}

}
