package Practice;

import GenericUtils.PropertyFileUtil;

public class PropertyFiletest {
public static void main(String[] args) throws Throwable {
	
	PropertyFileUtil p=new PropertyFileUtil();
	System.out.println(p.readDataFormPf("un")); //admin
	System.out.println(p.readDataFormPf("pwd")); //pass@123
	System.out.println(p.readDataFormPf("url")); //http:localhost:8888
	System.out.println(p.readDataFormPf("browser")); //chrome

}	
	
}
