package mcy.read;

import org.junit.Test;

import java.io.*;
import java.net.URL;

/**
 * @author : Vic.Yin
 * @version : v.0.1
 * @date : 2018/10/01
 * @Description :
 */
public class Clazzloader {

//    public static void main(String[] args) {
//        URL[] urls = sun.misc.Launcher.getBootstrapClassPath().getURLs();
//        for (int i = 0; i < urls.length; i++) {
//            System.out.println(urls[i].toExternalForm());
//        }
//    }

    @Test
    public void testClazz() {
        ClassLoader loader = Clazzloader.class.getClassLoader();
        while (loader != null) {
            System.out.println(loader);
            loader=loader.getParent();
        }
        System.out.println(loader);
    }

    @Test
    public void testClass() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class<Clazzloader> cl = (Class<Clazzloader>) Class.forName("mcy.read.Clazzloader");
        cl.newInstance().test();
    }

    @Test
    public void testResource() throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("E:\\test.txt")));
        ClassLoader classLoader = Clazzloader.class.getClassLoader();
        InputStream inputStream =classLoader.getResourceAsStream("test.txt");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        while (true) {
            String nextLine = bufferedReader.readLine();
            if (nextLine == null) {
                break;
            }
            System.out.println(nextLine);
        }
        bufferedReader.close();
    }

    public void test() {
        System.out.println("test");
    }
}
