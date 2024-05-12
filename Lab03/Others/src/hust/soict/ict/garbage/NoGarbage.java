package hust.soict.ict.garbage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class NoGarbage {
    public static void main(String[] args) {
        String fileName = "test.exe";
        byte[] inputData = { 0 };
        long start, end;
        try {
            inputData = Files.readAllBytes(Paths.get(fileName));
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
        start = System.currentTimeMillis();
        StringBuilder outputStringBuilder = new StringBuilder();
        for (byte byteValue : inputData){
            outputStringBuilder.append((char)byteValue);
        }
        end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
