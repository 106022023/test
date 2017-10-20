public class 計算成績 {
        public static  void main (String[] args) {
            java.util.Scanner sc = new java.util.Scanner(System.in);

            System.out.println("請輸入A");
            double a= sc.nextDouble();
            System.out.println("請輸入B");
            double b= sc.nextDouble();
            System.out.println("請輸入Ｃ");
            double c= sc.nextDouble();

            double d=a+b+c;
            double e=(a+b+c)/3;

            System.out.println("A+B+C:"+d);
            System.out.println("(A+B+C)/3:"+e);

        }
    }
