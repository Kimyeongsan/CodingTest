package Progremerse.Level1;

import java.util.Scanner;

//프로그래머스 : 직사각형 별찍기
public class InputStar {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
    	System.out.print("행 갯수 : ");
        int a = sc.nextInt();
        
        for(int i = 0; i < a; i++) {

            System.out.print("*");
        }
    }
}
