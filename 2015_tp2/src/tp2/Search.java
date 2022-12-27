package tp2;

import java.io.File;
import java.util.HashMap;
import java.util.Scanner;

public class Search {
	File[] filelist;
	
	public void SearchInFile(String arg[])
	{
	    allFileList(arg[0]);
	    HashMap<String, Integer> worddictionary = new HashMap<String,Integer>();
	    setWords(arg);
	}
	
		public void setWords(String arg[]){
		    for(int i=1;i<arg.length;i++)
		    {
		        HashMap<String, Integer> worddictionary;
				worddictionary.put(arg[i],0);
		    }
		
	}

	private void allFileList(String directory) {
		File direct= new File(directory);
		filelist=direct.listFiles();

	    if(filelist==null)
	    {
	        System.out.println("Wrong Directory");
	    }
		
	}

	public boolean isFilesAvailable() {
		if(filelist==null)
	    {
	        return false;
	    }
	    else
	    {
	        return true;
	    }
	}


}
