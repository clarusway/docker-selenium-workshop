package utilies;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyReader {

    public static Properties properties(){
        Properties property = null;
        try {
            // what file to read
            String path = "src/main/resources/gui.properties";
            // read the file into java, finds the file using the string path
            FileInputStream input = new FileInputStream(path);
            // properties --> class that store properties in key / value format
            property = new Properties();
            // the values from the file input is loaded / fed in to the properties object
            property.load(input);

            input.close();
        } catch (Exception e) {
            e.printStackTrace();

        }
        return property;
    }

}
