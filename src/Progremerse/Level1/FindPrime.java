package Progremerse.Level1;

// �Ҽ� ã��
public class FindPrime {
    int numberOfPrime(int n) {
        int count = 0;
        int result = 0;

        for(int i = 1 ; i <= n ; i++){
            for(int j = 1 ; j <= i ; j++){
                if ( i % j == 0) count++;
            }
            if(count == 2) result++;
            count = 0;
        }

        return result;
    }
}
