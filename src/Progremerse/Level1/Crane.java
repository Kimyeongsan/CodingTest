package Progremerse.Level1;

import java.util.Stack;

//ũ���� �����̱� ����
public class Crane {

    public static int solution(int[][] board, int[] moves) {
        int answer = 0;
        
        Stack<Integer> stack = new Stack<>(); //int�� ���� ����

        // forEach ����
        // moves : 1, 5, 3, 5, 1, 2, 1  -> move�� �־���
        for (int move : moves) {
            for (int i = 0; i < board.length; i++) {
                if (board[i][move - 1] == 0) { // board[1][0] == 0  >> board[1][5] == 0 
                    continue;  // �ش� �迭�� 0�ΰ�� �Ѿ
                } 
                
                else {
                	// ������ ������� �ʰ�, ������ �� ���� �ű� ������ ���� ��� pop��Ű��
                    if (!stack.isEmpty() && board[i][move - 1] == stack.peek()) {
                        answer += 2;  // ������ ������ �ΰ��� �����
                        stack.pop(); // �ٱ��Ͽ��� ����
                    } else {
                    	stack.add(board[i][move-1]); // ������ �״� �Լ�
                    }
                    
                    board[i][move - 1] = 0; // ���� ��ġ�� ������ 0���� �ʱ�ȭ
                                        
                    break;
                }
            }
        }

        return answer;
    }
	
	public static void main(String[] args) {
		int[][] board = {
				{0,0,0,0,0},
				{0,0,1,0,3},
				{0,2,5,0,1},
				{4,2,4,4,2},
				{3,5,1,3,1}
				};
		
		int[] moves = {1, 5, 3, 5, 1, 2, 1, 4};
		int result = solution(board, moves);
		
		System.out.print(result);

	}

}
