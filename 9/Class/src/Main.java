public class Main {
    public static void main(String[] args) {
        ReadFile readFile = new ReadFile();
        readFile.start();
        WriteFile writeFile = new WriteFile(readFile.s);
        writeFile.start();
    }
}