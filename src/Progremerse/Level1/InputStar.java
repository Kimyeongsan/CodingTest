package Progremerse.Level1;

import java.util.Scanner;

//���α׷��ӽ� : ���簢�� �����
public class InputStar {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
    	System.out.print("�� ���� : ");
        int a = sc.nextInt();
        
        for(int i = 0; i < a; i++) {

            System.out.print("*");
        }
    }
}
