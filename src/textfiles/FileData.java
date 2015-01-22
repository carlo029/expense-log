package textfiles;
import java.io.IOException;

//used http://www.homeandlearn.co.uk/java/read_a_textfile_in_java.html as reference for this code

public class FileData {
	public static void main (String args[]) throws IOException{
	
		
		String file_name = "C:/Users/Carlo/Desktop/cie123project.txt";
		
		try {
			ReadFile file =  new ReadFile(file_name);
			String[] aryLines = file.OpenFile();
			
			int i;
			for ( i=0; i < aryLines.length; i++ ) {
			System.out.println( aryLines[ i ] ) ;
			}
			
		}
		
		catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
	}
	

}
