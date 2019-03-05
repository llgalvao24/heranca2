package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<TaxPayer> payers = new ArrayList<>();
		
		System.out.print("Number of tax payers: ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Tax payer #" + i + " data: ");
			System.out.print("Individual or Company (i/c)? ");
			char type = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Anual Income: ");
			double income = sc.nextDouble();
			
			if(type == 'i') {
				System.out.print("Health expeditures: ");
				double healthExp = sc.nextDouble();
				
				payers.add(new Individual(name, income, healthExp));
			}
			
			else {
				System.out.print("Number of employees: ");
				int numberEmployees = sc.nextInt();
				
				payers.add(new Company(name, income, numberEmployees)); 
			}
		}
		
		System.out.println();
		System.out.println("TAXES PAID:");
		for(TaxPayer tp : payers) {
			System.out.println(tp.toString());
		}
		
		System.out.println();
		double sum = 0.0;
		for(TaxPayer tp : payers) {
			sum += tp.taxPaid();
		}
		
		System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));
		
		
		sc.close();


	}

}
