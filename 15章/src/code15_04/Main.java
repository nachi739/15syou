package code15_04;

public class Main {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < 1000; i++) {
			sb.append("Java");
		}
		String s = sb.toString();
		System.out.println(s);
	}
}
