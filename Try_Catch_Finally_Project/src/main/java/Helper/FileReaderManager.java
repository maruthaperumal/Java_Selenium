package Helper;

public class FileReaderManager {
	
	public static FileReaderManager fr = new FileReaderManager();
	
	public static FileReaderManager getIntance() 
	{
		
		return fr;
		
	}
	
	public static ConfigurationManager cr;
		
	public static ConfigurationManager getCr() throws Throwable 
	{
		
		
		if(cr==null)
		{
			cr=new ConfigurationManager();
		}
		return cr;
		
		
		
		
		
	}

}
