package Interface;

/**
 * @author BianWenKai
 * @DATE 2021/9/13 - 17:44
 **/
public class Main {
    public static void main(String[] args) {
        TaxCalculator calculator = new TaxCalculator2021(1000);
        TaxExport taxExport = new TaxExport(calculator);
        taxExport.show();

        taxExport.setTaxCalculator(calculator);
        taxExport.show();

        taxExport.show(calculator);
    }
}
