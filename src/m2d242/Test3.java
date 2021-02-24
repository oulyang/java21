package m2d242;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Test3 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//创建字符串拼接对象
		StringBuilder sb=new StringBuilder();
		
		Class ca=Class.forName("m2d242.Account");
		
		sb.append(Modifier.toString(ca.getModifiers())+" class "+ca.getSimpleName() +"{\n");
		
		Field[] f=ca.getDeclaredFields();
		for(Field field:f) {
			sb.append("\t");
			sb.append(Modifier.toString(field.getModifiers()));
			sb.append(" ");
			sb.append(field.getType().getSimpleName());
			sb.append(" ");
			sb.append(field.getName());
			sb.append(";\n");
			
		}
		sb.append("}");
		System.out.println(sb);
	}

}
