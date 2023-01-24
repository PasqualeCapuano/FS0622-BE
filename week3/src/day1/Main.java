package day1;


public class Main {

	public static void main(String[] args) {
		DBTeoria db = new DBTeoria();
		db.connect();
		
		boolean insertNewStudent = false;
		
		if(insertNewStudent) {
			db.insertStudent("Daysi Princess", 1);
		}
		
		boolean updateStudent = true;
		
		if(updateStudent) {
			db.updateStudent("Pasquale Capuano", 2);
		}
		
		db.disconnect();
	}
}
