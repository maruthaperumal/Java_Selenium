package Helper;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigurationManager {

	public Properties ps = new Properties();

	public ConfigurationManager() throws Throwable {

		File file = new File(System.getProperty("user.dir") + "\\src\\main\\resources\\Properties\\Config.properties");

		FileInputStream fis = new FileInputStream(file);

		ps.load(fis);

	}

	public String getbrowser() {

		String property = ps.getProperty("browser");
		return property;
	}

	public String geturl() {

		String property = ps.getProperty("url");
		return property;

	}
}
