package m2d243;

public class Test33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m();
		m(1);
		m(1,2,3,4,5);
		m1(new int[] {1,3,4,5,6});
	}

	//�ɱ䳤�Ȳ��� int... ������ 
	//��������Ϊ0-n��
	//ֻ�ܳ���һ���ɱ䳤�Ȳ�������Ϊ���һ��
	//�ɱ䳤�Ȳ������Կ���һ������

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
