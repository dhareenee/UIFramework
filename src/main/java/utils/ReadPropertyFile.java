package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;

import constants.FrameworkConstants;
import enums.ConfigProperties;

public class ReadPropertyFile {
	
	private ReadPropertyFile() {
		
	}
	private static Properties property=new Properties();
	private static final Map<String,String> CONFIGMAP=new HashMap<String, String>();
	
	static {
		FileInputStream file;
		try {
			
			
			file = new FileInputStream(FrameworkConstants.getConfigfilepath());
			property.load(file);
			
			property.entrySet().forEach(entry->CONFIGMAP.put(String.valueOf(entry.getKey()),String.valueOf(entry.getValue())));
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		 catch (IOException e) {
			
			e.printStackTrace();
		}
	}

	
	public static String getValue(ConfigProperties key) throws Exception {
		
		if(Objects.isNull(key.name())||Objects.isNull(CONFIGMAP.get(key.name()))) {
			throw new Exception("Property name " + key.name() + " is not found");
		}
		return CONFIGMAP.get(key.name());
	}

}
