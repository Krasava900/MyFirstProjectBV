import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter num: ");
        int enterNum = new Scanner(System.in).nextInt();
        for(int i = 1; i <= enterNum; i++){
            for (int j = 1; j <= enterNum; j++){
                if(i * j == enterNum){
                    System.out.println(i + " * " + j + " = " + enterNum);
                }
            }
        }


    }
}
