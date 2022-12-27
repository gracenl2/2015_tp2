package tp2;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import com.sun.jdi.Value;
import com.sun.tools.javac.util.Context.Key;

public class Search {
	File[] filelist;
	Map<Key,Value> WordMap;
	
	public void SearchInFile(String word[])
	{
	    allFileList(word[0]);
	    setWords(word);
	}
	
		public void setWords(String word[]){
		    for(int i=1;i<word.length;i++)
		    {
		        Map<Key, Value> WordMap;
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
