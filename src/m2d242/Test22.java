package m2d242;

import java.lang.reflect.Field;

public class Test22 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class c22=Class.forName("m2d242.Account");
		//��������
		Object obj=c22.newInstance();
		//��ȡno����
		Field fn=c22.getDeclaredField("no");
		fn.set(obj, 11);//��obj�����fn���Ը�ֵ11
		System.out.println(fn.get(obj));
		
		Field fb=c22.getDeclaredField("balance");
		//���Ʒ�װ
		fb.setAccessible(true);
		
		fb.set(obj, 11.11);//��obj�����fb���Ը�ֵ11
		System.out.println(fb.get(obj));
	}

}
