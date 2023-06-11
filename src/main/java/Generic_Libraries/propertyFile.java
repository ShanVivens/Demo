package src.main.java.Generic_Libraries;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class propertyFile {
    public String getPropertyFileData(String key) throws IOException {
        Properties p = new Properties();
        p.load(new FileInputStream(Autoconstant.propertyfilePath));
        p.getProperty(key);
        return p.getProperty(key);
    }
}
