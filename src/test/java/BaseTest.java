/**
 * @author : Vic.Yin
 * @version : v.0.1
 * @date : 2018/10/01
 * @Description :
 */
public class BaseTest {

    public static void main(String[] args) {
//        ClassLoader loader = new ClassLoader() {
//            @Override
//            public Class<?> loadClass(String name) throws ClassNotFoundException {
//                return super.loadClass(name);
//            }
//        };

        String s = "dfjaof<fjdoa";
        System.out.println(s.replace("<","----"));
        System.out.println(s);
    }
}
