package com.GenericUtils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtils {
	public String ReadDataFromPropertyFile(String key) throws IOException
	{
		FileInputStream fis=new FileInputStream(IpathConstant.FilePath);
		Properties p=new Properties();
		p.load(fis);
		String value=p.getProperty(key);
		return value;
		
		
	}
}
