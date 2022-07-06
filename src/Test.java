
public class Test {

	public static void main(String[] args) {
		System.out.println("Git Test");
		System.out.println();
		System.out.println("Git-Fork Test");
		
		int limit = 101;
		int[] coins = {1, 5, 7, 10, 16};
		int[] data = new int[limit];
		
		data[0] = 0;
		data[1] = 1;
		
		for(int i = 2; i < limit; i++) {
			data[i] = limit;
		}
		
		for(int coin : coins) {
			for(int i = coin; i < limit; i++) {
				int minValue = Math.min(data[i], data[i - coin] + 1);
				data[i] = minValue;
			}
		}
		
		for(int i = 1; i < limit; i++) {
			System.out.println("인덱스 : " + i + "\t값: " + data[i]);
		}
	}

}
