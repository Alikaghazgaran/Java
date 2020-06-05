import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile extends Thread {
    String s = "";
    @Override
    public void run() {
        try {
            File file = new File("C:\\Users\\alika\\OneDrive\\Desktop\\txt1.txt");
            FileReader fileReader = new FileReader(file);
            int i = fileReader.read();
            while (i != -1) {
                s += (char)i;
                i = fileReader.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}