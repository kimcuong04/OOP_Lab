package hust.soict.ict.garbage;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class GarbageCreator {
    public static void main(String[] args) {
        String filename = "test.exe"; // test.exe is the name or path to an executable file
        byte[] inputBytes = { 0 };
        long start, end;
        try {
            inputBytes = Files.readAllBytes(Paths.get(filename));
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
        start = System.currentTimeMillis();
        String outputString = "";
        for (byte b : inputBytes){
            outputString += (char)b;
        }

        end = System.currentTimeMillis();
        System.out.println(end - start);

    }
}
