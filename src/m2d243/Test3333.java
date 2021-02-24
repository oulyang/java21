package m2d243;
/**
 * [修饰符列表]@inteface 注解名{
	//属性的类型可以是：8基 String Class 枚举以及以上所有的数组形式
	//int i(); 
	//使用方法：@注解名(i=123) 
	//若属性有默认值 int i() default 12;,则直接使用@注解名
	//若属性名为value并只有一个属性，则使用时可以省略 @注解名(参数)
}
Deprecated：表示已过时。不鼓励使用这种注解，通常因为它很危险或有更好的选择
Override：一个方法声明打算重写超类中的另一个方法声明
Target元注解（注解的注解）：其标志的注解能放在哪些地方
Retention元注解：其标志的注解最终保留在哪、希望可以被反射
 */
import java.lang.reflect.Method;

public class Test3333 {
	@MyAnnotation(username="admin",password="admin")
	public void dosome() {
		
	}
	public static void main(String[] args) throws Exception {
		Class c=Class.forName("m2d243.MyAnnotation");
		Method method=c.getDeclaredMethod("doSome");
		if(method.isAnnotationPresent(MyAnnotation.class)) {
			MyAnnotation ma=method.getAnnotation(MyAnnotation.class);
			System.out.println(ma.username());
			System.out.println(ma.password());
		}
	}
}
