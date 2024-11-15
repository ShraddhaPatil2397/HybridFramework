package GenericUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class PropertyFileUtil {

	public String readDataFormPf(String key) throws Throwable {
		
		FileInputStream fisp=new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\HYBRID_FRAMEWORK\\src\\test\\resources\\CommonData.properties");
		Properties p=new Properties();
		p.load(fisp);
		return p.getProperty(key);
		System.out.println("It is the change made by me from Github");
		
		
	}
	
	
}
