/**
 * This class opens a text file, gets the lines one by one and passes it to the FileData class for display
 * @author Carlo Antioquia
 * @version 1
 * Reference: http://www.homeandlearn.co.uk/java/read_a_textfile_in_java.html
 */



package textfiles;

import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import textfiles.writetofile;


public class ReadFile {
	
	/**
	 * This function gets the file directory from the FileData class and opens the file
	 */
	private String path;
	/**
	 * @param String file_path
	 * the variable file_path is the directory of the file to be opened
	 */
	public ReadFile(String file_path){
		path = file_path;
	}
	
	public String[] OpenFile() throws IOException {
		
		/**
		 * this gets each line of the text file one by one and stores it in a buffer for display later
		 * @throws IOException
		 * @return textData
		 * textData contains the lines of the text file
		 */
		
		FileReader fr = new FileReader(path);
		BufferedReader textReader = new BufferedReader(fr);
		int numberOfLines = readLines();
		String[ ] textData = new String[numberOfLines];
		
		int i;

		for (i=0; i < numberOfLines; i++) {
		textData[ i ] = textReader.readLine();

		}
		
		textReader.close( );
		return textData;
	}
	
	int readLines() throws IOException{
		/**
		 * this function gets the number of lines in the text file
		 * @return numberOfLines
		 * numberOfLines is the variable that stores the number of lines the text file has
		 */
		FileReader file_to_read =  new FileReader(path);
		BufferedReader bf = new BufferedReader(file_to_read);
		
		String aLine;
		int numberOfLines=0;
		
		while ((aLine=bf.readLine()) !=null){
			numberOfLines++;
		}
		
		bf.close();
		
		return numberOfLines;
	}
}

