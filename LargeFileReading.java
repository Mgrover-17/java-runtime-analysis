import java.io.*;

public class LargeFileReading {

    public static void main(String[] args) {
        String filePath = "file";

        long startTime = System.nanoTime();
        try (FileReader fileReader = new FileReader(filePath)) {
            while (fileReader.read() != -1);
        } catch (IOException e) {
            e.printStackTrace();
        }
        long fileReaderTime = System.nanoTime() - startTime;

        startTime = System.nanoTime();
        try (InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(filePath))) {
            while (inputStreamReader.read() != -1);
        } catch (IOException e) {
            e.printStackTrace();
        }
        long inputStreamReaderTime = System.nanoTime() - startTime;

        System.out.println("Large File Reading Performance:");
        System.out.println("Using FileReader: " + (fileReaderTime / 1_000_000.0) + " ms");
        System.out.println("Using InputStreamReader: " + (inputStreamReaderTime / 1_000_000.0) + " ms");
    }
}
