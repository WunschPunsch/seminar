import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;


public class IO {
	
	public void writeFile(String content, String path) throws IOException{
		OutputStream os = new FileOutputStream(new File(path));
		BufferedOutputStream bos = new BufferedOutputStream(os);
		
		for (int i = 0; i < content.length(); i++) {
			bos.write((int)content.charAt(i));
		}
		
		bos.close();
	}

}
