package m2d243;

import java.lang.reflect.Method;

public class Test333 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class cs=Class.forName("m2d243.System1");
		Object obj=cs.newInstance();
		
		Method loginMethod=cs.getDeclaredMethod("login",String.class,String.class);
		//ret 返回值
		//loginMethod方法名
		//obj 对象
		//admin 123456实参
		Object ret=loginMethod.invoke(obj, "admin","123456");
		System.out.println(ret);
	}

}


