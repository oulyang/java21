package m2d241;
/**
 * ��ȡ����ֽ��루java.lang.Class�������ַ�ʽ��
 * @author yyds
 *
 */
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		//1.Class.forName(�ַ���)��һ����̬�������ַ�����һ���������������а�����
		//ֻϣ��һ����̬�����ִ�п�����Class.forName,�÷���ִ�л���������
		try {
			Class c1=Class.forName("java.lang.String");//c1����String.class�ļ���String����
			Class c2=Class.forName("java.util.Date");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//2.�������getClass����
		String s="123";
		Class cs=s.getClass();
		
		//3.java���κ�һ�����Ͷ���class����
		Class c3=int.class;
		Class c4=String.class;
		*/
		
		
		try {
			Class cu=Class.forName("m2d241.User");
			Object o=cu.newInstance();//�����޲ι�������������
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

