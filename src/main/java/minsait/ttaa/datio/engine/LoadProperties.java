package minsait.ttaa.datio.engine;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class LoadProperties {

    public static String inputPath, outputPath ;

    public void LoadFile(){

        try (InputStream input = new FileInputStream("src/test/resources/params.properties")) {

            Properties prop = new Properties();

            prop.load(input);

            inputPath = prop.getProperty("Input_path");
            outputPath = prop.getProperty("Output_path");

        }catch (IOException ex) {
            ex.printStackTrace();
        }

    }


}
