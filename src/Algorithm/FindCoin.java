package Algorithm;

public class FindCoin {
	static int price = 0;
	static int count = 0;
	
	static int[] coinArr = {500, 100, 10};
	

	public static void main(String[] args) {
		price = 730;
		
		for(int coin : coinArr) {
			getCount(coin);
		}
		 System.out.println(count);
	}
	
	public static void getCount(int coin) {
        count += (price / coin);
        price = price - (coin * (price / coin));
        
		 System.out.println(price);
    }
}
