package aula141021;

public class Contagem {

	public static void main(String[] args) {

		for (int i = 233; i <= 456;) {
			if (i < 300) {
				System.out.println(i);
				i += 3;
			} else if(i >= 300 && i <= 400){
				System.out.println(i);
				i += 5;
			}else {
				System.out.println(i);
				i += 3;
			}
		}
	}
}

