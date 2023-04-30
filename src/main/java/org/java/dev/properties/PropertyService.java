package org.java.dev.properties;

import org.java.dev.Main;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyService {
    public static String getProperty(String fileName, String propertyName) {
        String propertyValue = "";
        File file = new File(fileName);
        try (FileInputStream fileInputStream = new FileInputStream(file)) {
            Properties properties = new Properties();
            properties.load(fileInputStream);
            propertyValue = properties.getProperty(propertyName);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return propertyValue;
    }
   public static String getDbProperty(String propertyName) {
       String fileName = Main.class.getClassLoader().getResource("db.property").getPath();
       return getProperty(fileName,propertyName);
   }


}
