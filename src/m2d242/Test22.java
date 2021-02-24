package m2d242;

import java.lang.reflect.Field;

public class Test22 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class c22=Class.forName("m2d242.Account");
		//创建对象
		Object obj=c22.newInstance();
		//获取no属性
		Field fn=c22.getDeclaredField("no");
		fn.set(obj, 11);//给obj对象的fn属性赋值11
		System.out.println(fn.get(obj));
		
		Field fb=c22.getDeclaredField("balance");
		//打破封装
		fb.setAccessible(true);
		
		fb.set(obj, 11.11);//给obj对象的fb属性赋值11
		System.out.println(fb.get(obj));
	}

}
