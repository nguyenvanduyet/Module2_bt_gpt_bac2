import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("nhập giá trị của a:");
        double a = sc.nextDouble();
        System.out.println("nhập giá trị của b:");
        double b = sc.nextDouble();
        System.out.println("nhập giá trị của c:");
        double c = sc.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        if (quadraticEquation.getDelta() > 0) {
            System.out.println("phương trình có nghiệm x1:" + quadraticEquation.getExperience1() + "x2:" + quadraticEquation.getExperience2());
        } else if (quadraticEquation.getDelta() == 0) {
            System.out.println("phương trình có nghiệm kép x1=x2:"+quadraticEquation.getExperience3());
        }else {
            System.out.println("phương trình vô nghiệm");
        }
    }

}
