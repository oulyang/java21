package m2d243;
/**
 * [���η��б�]@inteface ע����{
	//���Ե����Ϳ����ǣ�8�� String Class ö���Լ��������е�������ʽ
	//int i(); 
	//ʹ�÷�����@ע����(i=123) 
	//��������Ĭ��ֵ int i() default 12;,��ֱ��ʹ��@ע����
	//��������Ϊvalue��ֻ��һ�����ԣ���ʹ��ʱ����ʡ�� @ע����(����)
}
Deprecated����ʾ�ѹ�ʱ��������ʹ������ע�⣬ͨ����Ϊ����Σ�ջ��и��õ�ѡ��
Override��һ����������������д�����е���һ����������
TargetԪע�⣨ע���ע�⣩�����־��ע���ܷ�����Щ�ط�
RetentionԪע�⣺���־��ע�����ձ������ġ�ϣ�����Ա�����
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
