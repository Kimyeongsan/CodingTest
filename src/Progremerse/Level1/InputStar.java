package Progremerse.Level1;

import java.util.Scanner;

public class InputStar {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
    	System.out.print("Çà °¹¼ö : ");
        int a = sc.nextInt();
        
    	System.out.print("¿­ °¹¼ö : ");
        int b = sc.nextInt();
        
        for(int i = 0; i < b; i++) {
            for(int j = 0; j < a; j++) {
                System.out.print("*");
            } 
            System.out.print("\n");
        }
    }
}
