package lab16_17;

public class Ex04 {

	public static void main(String[] args) {
		
		boolean passou = false;
		int i = 0;
		double paisA = 80000;
		double paisB = 200000;
		double taxaAnoA = 0.03;
		double taxaAnoB = 0.015;
				
		do {	
			double popA = paisA * taxaAnoA;
			double popB = paisB * taxaAnoB;
			
			paisA = paisA + popA;
			paisB = paisB + popB;
			
			i++;
			
			if (paisA>paisB){
				passou = true;
				System.out.println("Vai levar " + i + " anos para o p�is A passar ou igualar o B em popula��o.");
				System.out.println("Popula��o A: " + paisA);
				System.out.println("Popula��o B: " + paisB);
			}
			
		} while (!passou);

	}

}
