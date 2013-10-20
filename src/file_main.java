/**
 * Created with IntelliJ IDEA.
 */
public class file_main {
    private static String fileName = "a1.txt";
    public static void main(String[] args) {
        String res = work.read(fileName);
        int count = 0;
        if (res.length() != 0)
        {
            count = res.split(" +").length + 2;
        }
        System.out.println(count);
    }
}