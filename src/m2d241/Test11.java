package m2d241;

public class Test11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//文件必须在类路径（src）下
		//getContextClassLoader()获取当前线程的类加载器
		//getResource默认在根路径下获取资源
		
		//这种获取文件绝对路径的方式是通用的
		String str=Thread.currentThread().getContextClassLoader().getResource("mt.properties").getPath();
		System.out.println(str);
	}

}
