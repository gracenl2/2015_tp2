package tp2;

import java.io.File;
import java.util.Map;



public class Search {
	File[] filelist;
	Map<String,Integer> WordMap;
	
	
	public void SearchInFile(String word[])
	{
	    allFileList(word[0]);
	    setWords(word);
	}
	
		public void setWords(String word[]){
		    for(int i=1;i<word.length;i++)
		    {
		        WordMap = null;
		        WordMap.put(word[i],0);
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
