package Progremerse.Level1;

import java.util.Stack;

//크레인 인형뽑기 문제
public class Crane {

    public static int solution(int[][] board, int[] moves) {
        int answer = 0;
        
        Stack<Integer> stack = new Stack<>(); //int형 스택 선언

        // forEach 구문
        // moves : 1, 5, 3, 5, 1, 2, 1  -> move에 넣어줌
        for (int move : moves) {
            for (int i = 0; i < board.length; i++) {
                if (board[i][move - 1] == 0) { // board[1][0] == 0  >> board[1][5] == 0 
                    continue;  // 해당 배열이 0인경우 넘어감
                } 
                
                else {
                	// 스택이 비어있지 않고, 스택의 맨 위와 옮긴 인형이 같을 경우 pop시키기
                    if (!stack.isEmpty() && board[i][move - 1] == stack.peek()) {
                        answer += 2;  // 인형은 쌍으로 두개씩 사라짐
                        stack.pop(); // 바구니에서 삭제
                    } else {
                    	stack.add(board[i][move-1]); // 스택을 쌓는 함수
                    }
                    
                    board[i][move - 1] = 0; // 뽑은 위치의 인형은 0으로 초기화
                                        
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
