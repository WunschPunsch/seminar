import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;


/**
 * Ein- und Ausgabe für HA11-2
 * @author bkis
 *
 */
public class IO {
	
	/**
	 * Datei schreiben
	 * @param content
	 * @param path
	 * @throws IOException
	 */
	public void writeFile(String content, String path) throws IOException{
		OutputStream os = new FileOutputStream(new File(path));
		BufferedOutputStream bos = new BufferedOutputStream(os);
		
		for (int i = 0; i < content.length(); i++) {
			bos.write((int)content.charAt(i));
		}
		
		bos.close();
	}
	
	/**
	 * Datei lesen
	 * @param path
	 * @return
	 * @throws IOException
	 */
	public String readFile(String path) throws IOException{
		InputStream is = new FileInputStream(new File(path));
		BufferedInputStream bis = new BufferedInputStream(is);
		StringBuffer sb = new StringBuffer();
		
		int i;
		while ((i = bis.read()) != -1){
			sb.append((char)i);
		}
		
		bis.close();
		return sb.toString();
	}

}
