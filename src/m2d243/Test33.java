package m2d243;

public class Test33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m();
		m(1);
		m(1,2,3,4,5);
		m1(new int[] {1,3,4,5,6});
	}

	//可变长度参数 int... 变量名 
	//参数个数为0-n个
	//只能出现一个可变长度参数，且为最后一个
	//可变长度参数可以看作一个数组

		private static void m(int... num) {
		// TODO Auto-generated method stub
		System.out.println("aaa");
	}
		private static void m1(int... number) {
		// TODO Auto-generated method stub
			for(int i=0;i<number.length;i++) {
				System.out.println(number[i]);
			}

	}
}
