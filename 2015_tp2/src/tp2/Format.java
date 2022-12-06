package tp2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Format {
	
	public static void main(String[] args) throws IOException {
		try {
			
			File myObj = new File("filename.txt");
			BufferedReader myReader = new BufferedReader(new FileReader (myObj));
			
			String text;
			
			while ((text= myReader.readLine()) != null) {
				text=text.replaceAll("[^\\w\\s\\ ]", " ");
				System.out.println(text);
			}
			
			myReader.close();
		}
		catch (FileNotFoundException e) {
			System.out.println("No file found.");
			e.printStackTrace();
	}
	
	 
}	    

}
