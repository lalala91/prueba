package practica5;

public class Main {
	
	public static void main(String[] args) {
		StudenDAO dao = new MockStudent();
		dao.getStudent(new Student());
	}

}
