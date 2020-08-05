package HCN;
import java.util.Scanner;
public class CHVHCN {
	public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào chiều dài của hình chữ nhật:");
        double length = scanner.nextDouble();
        System.out.println("Nhập vào chiều rộng của hình chữ nhật:");
        double width = scanner.nextDouble();
        double area = length*width;
        System.out.println("Diện tích hình chữ nhật là:"+area);
        System.out.println("------------------------------------------");
        System.out.println("Chương trình Trần Đình Tin");
    }
}
