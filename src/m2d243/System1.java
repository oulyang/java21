package m2d243;

public class System1 {
	public boolean login(String name,String password) {
		if("admin".equals(name)&&"123456".equals(password)) {
			return true;
		}
		return false;
	}
	
	public void exit() {
		System.out.println("exit");
	}
}
