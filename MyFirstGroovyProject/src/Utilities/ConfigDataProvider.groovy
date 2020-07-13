package Utilities

import java.util.Properties
import java.io.File
import java.io.FileInputStream

class ConfigDataProvider {

	Properties pro

	public ConfigDataProvider() {

		File src = new File("E:\\Eclipse_Workspace\\MyFirstGroovyProject\\Config\\Config.properties")
		try {
			FileInputStream fis = new FileInputStream(src)
			pro  = new Properties()
			pro.load(fis)
		}
		catch(Exception e) {
			//println "Not able to load config file"
		}
	}

	public String getDataFormatString(String keyToSearch) {

		return pro.getProperty(keyToSearch)
	}

	public String getBrowser() {

		return pro.getProperty("Browser")
	}

	public String getURL() {

		return pro.getProperty("qaURL")
	}
}
