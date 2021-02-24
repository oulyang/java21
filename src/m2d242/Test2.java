package m2d242;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Test2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class c=Class.forName("m2d242.Account");
		//获取类中公开的属性
		Field[] fields=c.getFields();
		System.out.println(fields.length);
		
		Field f=fields[0];
		String sf=f.getName();
		System.out.println(sf);
		
		//获取所有属性
		Field[] fs=c.getDeclaredFields();
		System.out.println(fs.length);
		
		for(Field field:fs) {
			System.out.println(field.getName());
		}
		
		System.out.println();
		
		for(Field field:fs) {
			System.out.println(field.getType());
		}
		
		System.out.println();
		
		for(Field field:fs) {
			//System.out.println(field.getModifiers());
			//Modifier.toString把修饰符对应的数转成名称
			System.out.println(Modifier.toString(field.getModifiers()));
		}
		
	}

}
