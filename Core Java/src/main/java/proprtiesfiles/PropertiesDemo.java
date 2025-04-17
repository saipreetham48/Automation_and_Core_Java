package proprtiesfiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {

	public static void main(String[] args) throws IOException {
		File file = new File("config.properties");
		if (file.exists())
			file.createNewFile();
		Properties prop = new Properties();
		prop.setProperty("url", "localhost");
		prop.setProperty("username", "sai");
		prop.setProperty("password", "sai123");
		prop.put("dummy", "url");
		// to update
		prop.put("url", "196.178.26");
		FileOutputStream fos = new FileOutputStream(file);
		// prop.store(fos, "");

		// prop.remove("url");
		prop.store(fos, "new file data");

		FileInputStream fis = new FileInputStream(file);
		prop.load(fis);
		// to get the keys
//		Set<String> keys=prop.stringPropertyNames();
//		System.out.println(keys);
//		Set<Object> keys=prop.keySet();
//		System.out.println(keys);
		// to get values
//		Collection<Object> values=prop.values();
//		System.out.println(values);
//		
		// to get value by passing key
//		System.out.println(prop.getProperty("url"));
//		System.out.println(prop.getProperty("cake", "cke kavala"));
		// to get keys and values
		// System.out.println(prop);
//		Set<Object> keys=prop.keySet();
//		for (Object key : keys) {
//			System.out.println(key+">>>>>"+prop.getProperty((String)key));
//		}

//		Set<Entry<Object, Object>> entries=prop.entrySet();
//		for (Entry<Object, Object> entry : entries) {
//			System.out.println(entry.getKey()+">>>>>>>"+entry.getValue());
//			
//		}

	}

}
