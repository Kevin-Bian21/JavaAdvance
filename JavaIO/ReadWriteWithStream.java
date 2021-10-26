package JavaIO;

import java.io.*;
import java.util.Arrays;

/**
 * @author BianWenKai
 * @DATE 2021/10/22 - 18:01
 **/
public class ReadWriteWithStream {
    public static void main(String[] args) throws IOException {
        File file = new File("E:\\test1.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        for (int i = 0; i < 1000; i++) {
            fileOutputStream.write(i);
        }
        fileOutputStream.close();
        byte[] buf = new byte[1024];
        int length = 0;
        FileInputStream fileInputStream = new FileInputStream(file);
        while ((length = fileInputStream.read(buf)) != -1){
            System.out.println(Arrays.toString(buf));
        }
        fileInputStream.close();
    }
}
