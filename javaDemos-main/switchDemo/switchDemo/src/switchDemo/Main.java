package switchDemo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char grade='C';

		switch(grade){

			case 'A':
				System.out.println("Mükemmel : Geçtiniz");
				break;
			case 'B':
			case 'C':
				System.out.println("İyi : Geçtiniz");
				break;
			case 'D':
				System.out.println("Fena Değil: Geçtiniz");
				break;
			case 'F':
				System.out.println("Maalesef Kaldınız");
				break;
		}
	}

}
