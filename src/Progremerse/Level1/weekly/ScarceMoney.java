package Progremerse.Level1.weekly;

// ��Ŭ�� 1����, ������ �ݾ� ����ϱ�
public class ScarceMoney {
    public long solution(int price, int money, int count) { // 3, 20, 4
        long answer = -1;
        long result = 0;
        
        for(int i = 1; i <= count; i++) {
            result += (price * i); // 3 + 6 + 9 + 12 = 30
        }
        answer = result - money;
        
        if(answer < 0) {
            return 0;
        }
        
        return answer;
    }
}
