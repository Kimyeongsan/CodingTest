package Progremerse.Level1;

import java.util.Scanner;

//프로그래머스 : 직사각형 별찍기
public class InputStar {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
    	System.out.print("행 갯수 : ");
        int a = sc.nextInt();
        
    	System.out.print("열 갯수 : ");
        int b = sc.nextInt();
        
        for(int i = 0; i < b; i++) {
            for(int j = 0; j < a; j++) {
                System.out.print("*");
            } 
            System.out.print("\n");
        }
    }
}
