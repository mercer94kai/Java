package RandomTests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class configRead {

    private Properties prop;

    public Properties readProperty() {
        prop = new Properties();

        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\Kaifa\\Documents\\My Repo\\Java\\PrepJava\\src\\RandomTests\\config.properties");
            prop.load(fis);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }

        return prop;
    }

    public String getPasswd(){

        return prop.getProperty("username");
    }


}
