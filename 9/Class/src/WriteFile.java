import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile extends Thread {
    String s;
    public WriteFile (String s) {
        this.s = s;
    }
    @Override
    public void run() {
        try {
            File file = new File("C:\\Users\\alika\\OneDrive\\Desktop\\txt2.txt");
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(s);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
