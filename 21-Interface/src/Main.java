
public class Main {

	public static void main(String[] args) {
		//DeskPhone myPhone=new DeskPhone (7648765,true);
		iTelephone myPhone= new DeskPhone(7648765,true);
		myPhone.powerOn();
		myPhone.callPhone(7648765);
		myPhone.answer();
	}

}
