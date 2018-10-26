package mcy.io;

import org.junit.Test;

import java.io.*;

/**
 * @author : Vic.Yin
 * @version : v.0.1
 * @date : 2018/10/11
 * @Description :
 */
public class InputStreamTest {
    @Test
    public void testIo() throws Exception {
        File file = new File("E:\\test.txt");
        InputStream inputStream = new FileInputStream(file);
//        System.out.println(inputStream.read());
        byte[] bytes = new byte[1];
        while (true) {
            int i = inputStream.read(bytes);
            if (i==-1) break;
            String s = new String(bytes);
            System.out.println(s);
        }
    }
}
