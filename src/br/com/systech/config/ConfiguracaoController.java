package br.com.systech.config;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfiguracaoController {

    private static final String PROP_FILE = "conf/connection.properties";
    private ConfiguracaoUtil conf = null;
    private Properties prop = null;

    public ConfiguracaoController() {
        super();
        conf = new ConfiguracaoUtil();
        prop = new Properties();
    }

    public boolean loadProperties() {
        boolean returnValue = true;

        FileInputStream propFileStream = null;
        File propFile = new File(PROP_FILE);
        if (propFile.exists()) {
            try {
                propFileStream = new FileInputStream(propFile);
                prop.load(propFileStream);
                propFileStream.close();

                String temp = prop.getProperty("usernameBD");
                if (temp != null) {
                    conf.setUserNameBD(temp);
                }

                temp = prop.getProperty("passwordBD");
                if (temp != null) {
                    conf.setPasswordBD(temp);
                }

                temp = prop.getProperty("portBD");
                if (temp != null) {
                    conf.setPortBD(temp);
                }
                
                temp = prop.getProperty("urlBD");
                if (temp != null) {
                    conf.setUrlBD(temp);
                }
                
                temp = prop.getProperty("hostBD");
                if (temp != null) {
                    conf.setHostBD(temp);
                }

            } catch (FileNotFoundException ex) {
                returnValue = false;
            } catch (IOException ex) {
                returnValue = false;
            }
        } else {
            returnValue = false;
        }
        return returnValue;
    }

    /**
     * Writes the properties to file.
     *
     * @return Whether writing the properties to file was successful.
     */
    public boolean writeProperties() {
        boolean returnValue = true;
        prop.setProperty("usernameBD", conf.getUserNameBD());
        prop.setProperty("passwordBD", conf.getPasswordBD());
        prop.setProperty("portBD", conf.getPortBD());
        prop.setProperty("urlBD", conf.getUrlBD());
        prop.setProperty("hostBD", conf.getHostBD());

        FileOutputStream propFileStream = null;
        try {
            propFileStream = new FileOutputStream(PROP_FILE);
            prop.store(propFileStream, "propriedades");
            propFileStream.close();
        } catch (FileNotFoundException ex) {
            returnValue = false;
        } catch (IOException ex) {
            returnValue = false;
        }
        return returnValue;
    }

    public ConfiguracaoUtil getConfiguracaoUtil() {
        return conf;
    }

}
