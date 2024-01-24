import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();

        if(a.length() <= 80){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }

        sc.close();
    }
}
