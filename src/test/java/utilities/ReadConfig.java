package utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
	Properties properties;
	String path="config.properties";
	public ReadConfig(){
		
		try {
			properties=new Properties();
			FileInputStream fis=new FileInputStream(path);
			properties.load(fis);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public String getBrowser() {
		return properties.getProperty("browser");
	}
	

}
