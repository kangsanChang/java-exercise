package helloworld;

public class HelloWorld {
	public static void main(String args[]) {
		System.out.println("안녕 세상아!");
		
		for(int i=1; i<10 ; i++) {
			for(int j=1; j<10; j++) {
				System.out.println(i + " X "+ j + " = " + i*j);
			}
		}
	}
}
