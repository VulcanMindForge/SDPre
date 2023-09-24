public class Objective7Lab4 {
	public static void main(String[] args) {
		int count, sum;

		count = 1;
		sum = 0;

		do {
			sum = sum + count;
			count = count + 1;
		} while (count < 21);

		System.out.println(sum);
	}
}