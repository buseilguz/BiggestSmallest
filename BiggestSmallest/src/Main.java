import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);	
		System.out.println("Ka� adet say� gireceksiniz.");
		int n=scn.nextInt();
		int biggest=0;
		int smallest=0;
		//girilecek say� adedi kadar giri� yap�lmas� i�in d�ng� olu�turuldu.
		for(int i=1;i<=n;i++) {
			System.out.println(i+". say�y� giriniz.");
			int number =scn.nextInt();
			
			if(number<smallest||smallest==0) {
				smallest=number;
			}
			if(number>biggest)
				biggest=number;
		}
		
		System.out.println("En B�y�k Say� : "+biggest);
		System.out.println("En K���k Say� : "+smallest);
	}

}
