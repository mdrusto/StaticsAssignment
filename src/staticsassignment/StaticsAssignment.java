package staticsassignment;

import java.util.Scanner;

public class StaticsAssignment {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double dinner, douter, d, l1, l2, l3, E1, E2, E3, pc;
		boolean metric;
		System.out.print("Are your measurements in metric? ");
		metric = scanner.nextBoolean();
		if (metric)
			System.out.println("Please enter your inputs in SI units.");
		else
			System.out.println("Please enter your inputs in inches, kips, and ksi.");
		System.out.print("Please enter di: ");
		dinner = scanner.nextDouble();
		System.out.print("Please enter do: ");
		douter = scanner.nextDouble();
		System.out.print("Please enter d: ");
		d = scanner.nextDouble();
		System.out.print("Please enter l1: ");
		l1 = scanner.nextDouble();
		System.out.print("Please enter l2: ");
		l2 = scanner.nextDouble();
		System.out.print("Please enter l3: ");
		l3 = scanner.nextDouble();
		System.out.print("Please enter e1: ");
		E1 = scanner.nextDouble();
		System.out.print("Please enter e2: ");
		E2 = scanner.nextDouble();
		System.out.print("Please enter e3: ");
		E3 = scanner.nextDouble();
		System.out.print("Please enter pc: ");
		pc = scanner.nextDouble();
		double A1 = Math.PI / 4.0 * (Math.pow(douter, 2) - Math.pow(dinner, 2));
		double A2 = Math.PI / 4.0 * Math.pow(d, 2);
		double sigma1 = pc * l3 * E1 * E2 / (l1 * A2 * E2 * E3 + A1 * l2 * E1 * E3 + A1 * l3 * E2 * E1);
		double sigma2 = sigma1 * A1 / A2;
		double sigma3 = (sigma1 * A1 - pc) / A2;
		System.out.println("Stress in member 1: " + sigma1 + (metric ? " N/m^2" : " ksi"));
		System.out.println("Stress in member 2: " + sigma2 + (metric ? " N/m^2" : " ksi"));
		System.out.println("Stress in member 3: " + sigma3 + (metric ? " N/m^2" : " ksi"));
		System.out.println("displacement of point B: " + sigma1 * l1 / E1 + (metric ? " m" : " in"));
		System.out.println("Displacement of point C: " + (-sigma3 * l3 / E3) + (metric ? " m" : " in"));
		scanner.close();
	}
}
