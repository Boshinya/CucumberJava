package com.boshinya.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by bothees on 12/10/2016.
 */
public class PropertyReader {

    Properties prop = new Properties();

    InputStream inputStream = null;

    public PropertyReader(){
        loadprop();
    }

    public void loadprop() {
        try {
            inputStream = new FileInputStream("src/test/resources/project.properties");
            prop.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String readproperty(String key){
        return prop.getProperty(key);
    }
}
