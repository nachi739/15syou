package code15_10;

public class Main {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		//ここで何らかの時間がかかる処理
		String sb = "Java";
		for (int i = 0; i < 10000; i++) {
			sb += "Java";
		}
		String s = sb.toString();
		 long end = System.currentTimeMillis();
		System.out.println("処理にかかった時間は…" + (end - start) + "ミリ秒でした");
	}

}
