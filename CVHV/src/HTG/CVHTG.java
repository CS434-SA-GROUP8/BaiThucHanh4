package HTG;
import java.util.Scanner;
public class CVHTG {
	public static void main(String[] args) {
        float soDoDoan1, soDoDoan2, soDoDoan3, chuVi, dienTich;
        Scanner scanner = new Scanner(System.in);
         
        System.out.println("Nhập vào số đo đoạn thẳng thứ nhất: ");
        soDoDoan1 = scanner.nextFloat();
        System.out.println("Nhập vào số đo đoạn thẳng thứ hai: ");
        soDoDoan2 = scanner.nextFloat();
        System.out.println("Nhập vào số đo đoạn thẳng thứ ba: ");
        soDoDoan3 = scanner.nextFloat();
         
       
        if ((soDoDoan1 + soDoDoan2 > soDoDoan3) && (soDoDoan1 + soDoDoan3 > soDoDoan2) 
            && (soDoDoan2 + soDoDoan3 > soDoDoan1)) {
           
            chuVi = soDoDoan1 + soDoDoan2 + soDoDoan3;
            System.out.println("Chu vi của tam giác bằng = " + chuVi);
        } else {
            System.out.println("Không tồn tại tam giác");
        }
    }
}
