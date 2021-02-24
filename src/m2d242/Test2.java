package m2d242;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Test2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class c=Class.forName("m2d242.Account");
		//��ȡ���й���������
		Field[] fields=c.getFields();
		System.out.println(fields.length);
		
		Field f=fields[0];
		String sf=f.getName();
		System.out.println(sf);
		
		//��ȡ��������
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
			//Modifier.toString�����η���Ӧ����ת������
			System.out.println(Modifier.toString(field.getModifiers()));
		}
		
	}

}
