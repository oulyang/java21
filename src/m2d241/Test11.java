package m2d241;

public class Test11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//�ļ���������·����src����
		//getContextClassLoader()��ȡ��ǰ�̵߳��������
		//getResourceĬ���ڸ�·���»�ȡ��Դ
		
		//���ֻ�ȡ�ļ�����·���ķ�ʽ��ͨ�õ�
		String str=Thread.currentThread().getContextClassLoader().getResource("mt.properties").getPath();
		System.out.println(str);
	}

}
