package com.api.tut.utilities;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

public class ConfigManager {
    private static ConfigManager manager;
    private static final Properties prop = new Properties();
    public static CSVReader reader = null;
    public static List<String[]> Body;

    private ConfigManager() throws IOException {
        FileReader reader = new FileReader(System.getProperty("user.dir") + "/Resources/config.properties");
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

    public String getString(String key) {
        // System.getProperty(key, prop.getProperty(key));another way of access property file

        return prop.getProperty(key);

    }

    public static void GetEndPointData() {
        try {
            reader = new CSVReader(new FileReader(System.getProperty("user.dir") + "/Resources/testData.csv"));
            try {
                //Body.get(1)=array return array accessing a array using Body.get(1)[0]
                Body = reader.readAll();
                //  System.out.println("body:"+Body.get(1)[1]);//accessing array elements we can use [] to access element

            } catch (IOException e) {
                throw new RuntimeException(e);
            } catch (CsvException e) {
                throw new RuntimeException(e);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

}