package com.api.tut.utilities;

import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigManager {
    private static ConfigManager manager;
    private static final Properties prop = new Properties();

    private ConfigManager() throws IOException {
        FileReader reader = new FileReader(System.getProperty("user.dir")+"/Resources/config.properties");
        prop.load(reader);


    }

    public static ConfigManager getInstance() {
        if (manager == null) {
            synchronized (ConfigManager.class) {
                try {
                    manager = new ConfigManager();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return manager;
    }

    public  String getString(String key) {
       // System.getProperty(key, prop.getProperty(key));another way of access property file

        return prop.getProperty(key);

    }

//    public static void main(String[] args) {
//
//        String Props = getInstance().getString("baseUrl");
//        System.out.print("baseUrl is:" + Props);
//    }
}