import services.PensionService;
import services.TaxService;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        TaxService taxService = new TaxService();
        PensionService pensionService = new PensionService();

        System.out.println(taxService.tax(4000.00));
        System.out.println(pensionService.discount(4000.00));

        /*
        System.out.print("Nome: ");
        String name = sc.nextLine();
        System.out.print("Salário bruto: ");
        double grossSalary = sc.nextDouble();

        double netSalary = grossSalary * 0.7;
        System.out.printf("Salário liquido = %.2f\n", netSalary);
        */


        sc.close();

    }
}