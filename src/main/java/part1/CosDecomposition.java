package part1;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class CosDecomposition {

    private FileInputStream fs;
    private final Properties properties = new Properties();
    private double result;
    private double current;
    private double previous;
    private double accuracy;

    public CosDecomposition() throws IOException {
        fs = new FileInputStream("src/main/resources/config.properties");
        properties.load(fs);
        result = Double.parseDouble((String) properties.get("result"));
        current = Double.parseDouble((String) properties.get("current"));
        previous = Double.parseDouble((String) properties.get("previous"));
        accuracy = Double.parseDouble((String) properties.get("accuracy"));
    }

    public double customCos(double x) {
        for (int i = 1; Math.abs(current - previous) > accuracy && i < 1000 ; i++) {
            previous = current;
            current *= ( x * x * -1 );
            current /= ( (2 * i) * (2 * i - 1) );
            result += current;
        }
        if (result > 1) return 1;
        if (result < -1) return -1;
        return result;
    }

}
