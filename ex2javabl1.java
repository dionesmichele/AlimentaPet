/**
 * 
 */
package intro;

import java.util.Scanner;

public class ex2javabl1 {
	 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dias,meses,anos,restd;
		Scanner leia = new Scanner(System.in);
		System.out.println("\nInsira o  número de dias para a conversão  ");
		dias = leia.nextInt();
	

		anos=dias/365;
		meses=dias%12;
		
		restd=(dias%365)%30;
		
          System.out.printf("\n A duraçao é de :" +anos+ "anos," +meses+" meses e " +restd+ " dias");

	}
}
