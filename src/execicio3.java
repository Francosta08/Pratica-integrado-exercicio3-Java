import java.util.Scanner;

public class execicio3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n =0 , cont=0;
		
		System.out.println("Digite um número : ");
		
		n = sc.nextInt();
		
		System.out.println("Número digitado: " + n);
		
		for(int i = 1;i <=n;i++) {
		
			if(n %1 == 0) {
				cont++;
			}
		
		}
		if(cont == 2) {
			
		System.out.println("O número" + n + "È primo");	
		}else {
		System.out.println("O número : " + n + "  Não é primo");		
		}
		
		
		
		sc.close();
	}

}
