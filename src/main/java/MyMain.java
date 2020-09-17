import java.util.Scanner;

public class MyMain {
    
    public static int binaryToDecimal(String binary) {
        int bin = Integer.parseInt(binary);
        int dec = 0;  
        int n = 0;  
        while(true){  
            if(bin == 0){  
        break;  
        } 
        else {  
            int k = bin%10;  
            dec += k*Math.pow(2, n);  
            bin = bin/10;  
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
