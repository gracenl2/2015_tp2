package tp2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
	
	public static void main(String[] args) throws IOException {
		try {
			
			File myObj = new File("/Users/jeongeun.lee/Documents/2015_tp2/2015_tp2/src/tp2/dataset/900.txt");
			BufferedReader myReader = new BufferedReader(new FileReader (myObj));
			
			String text;
			System.out.println("Search ");
	        
	        while ((text = myReader.readLine()) != null) {
				text = text.replaceAll("[^\\w\\s\\ ]", " ");
				text = text.toLowerCase();
				System.out.println(text);
			}
			
			myReader.close();
			
	        }
			
		
		catch (FileNotFoundException e) {
			System.out.println("No file found.");
			e.printStackTrace();
	}
		
		if (args.length<2)
	    {
	        System.out.println("Invalid argument");
	        System.exit(0);
	    }

	    Search obj=new Search();

	    if(!obj.isFilesAvailable())
	    {
	        System.out.println("There is no files in given directory");
	        System.exit(0);
	    }
	
	 
}	    
}
