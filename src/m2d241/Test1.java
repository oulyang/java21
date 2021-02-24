package m2d241;
/**
 * 获取类的字节码（java.lang.Class）的三种方式：
 * @author yyds
 *
 */
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		//1.Class.forName(字符串)是一个静态方法，字符串是一个完整类名（带有包名）
		//只希望一个静态代码块执行可以用Class.forName,该方法执行会进行类加载
		try {
			Class c1=Class.forName("java.lang.String");//c1代表String.class文件或String类型
			Class c2=Class.forName("java.util.Date");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//2.调对象的getClass方法
		String s="123";
		Class cs=s.getClass();
		
		//3.java中任何一种类型都有class属性
		Class c3=int.class;
		Class c4=String.class;
		*/
		
		
		try {
			Class cu=Class.forName("m2d241.User");
			Object o=cu.newInstance();//调用无参构造来创建对象
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

