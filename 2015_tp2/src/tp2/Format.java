// package tp2;

// import java.io.BufferedReader;
// import java.io.File;
// import java.io.FileNotFoundException;
// import java.io.FileReader;
// import java.io.IOException;

// public class Format {
	
// 	public static void main(String[] args) throws IOException {
// 		try {
			
// 			File myObj = new File("/Users/jeongeun.lee/Documents/2015_tp2/2015_tp2/src/tp2/dataset/900.txt");
// 			BufferedReader myReader = new BufferedReader(new FileReader (myObj));
			
// 			String text;
			
// 			while ((text = myReader.readLine()) != null) {
// 				text = text.replaceAll("[^\\w\\s\\ ]", " ");
// 				text = text.toLowerCase();
// 				System.out.println(text);
// 			}
			
// 			myReader.close();
// 		}
// 		catch (FileNotFoundException e) {
// 			System.out.println("No file found.");
// 			e.printStackTrace();
// 	}
	
	 
// }	    

// }
