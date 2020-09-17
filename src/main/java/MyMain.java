import java.util.Scanner;

public class MyMain {
    
    public static int binaryToDecimal(int binary) {
        int dec = 0;  
        int n = 0;  
        while(true){  
            if(binary == 0){  
        break;  
        } 
        else {  
            int k = binary%10;  
            dec += k*Math.pow(2, n);  
            binary = binary/10;  
            n++;  
        }  
    }  
    return dec;
    }
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Binary: ");
        String x = scan.next();
        System.out.println(Integer.parseInt(x, 2));  
        scan.close();
    }
}
