package util;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {

    public static void writeToCSV(String path, List<String> data, boolean append) {
        try (BufferedWriter bw =
                     new BufferedWriter(new FileWriter(path, append))) {
            for (String s : data) {
                bw.write(s);
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Lỗi ghi file");
        }
    }

    public static List<String> readFromCSV(String path) {
        List<String> list = new ArrayList<>();

        try (BufferedReader br =
                     new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = br.readLine()) != null) {
                list.add(line);
            }
        } catch (IOException e) {
            System.out.println("Lỗi đọc file");
        }
        return list;
    }
}
