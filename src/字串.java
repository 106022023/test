import java.util.*;
    public class 字串 {

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            String str;
            char a;
            str = in.nextLine();
            a = in.next().charAt(0);

            System.out.println(str.replace(a,'\n'));
        }
    }

