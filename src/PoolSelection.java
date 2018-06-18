
public class PoolSelection {

	public static void main(String args[]) {
		
		double weight[] = { 0.30, -0.15, -0.80, 40, 50, 10 };
	
		int sum = 0;
	
		for (int i = 0; i < weight.length; i++) {
			sum += weight[i];
		}
	
		for (int i = 0; i < weight.length; i++) {
			weight[i] /= sum;
		}
		
		for (int i = 0; i < weight.length; i++) {
			System.out.println(weight[i]);
		}
	}
}