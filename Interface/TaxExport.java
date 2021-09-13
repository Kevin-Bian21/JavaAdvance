package Interface;

/**
 * @author BianWenKai
 * @DATE 2021/9/13 - 17:44
 **/
public class TaxExport {

    private TaxCalculator taxCalculator;

    //使用构造器进行依赖注入
    public TaxExport(TaxCalculator taxCalculator){
        this.taxCalculator = taxCalculator;
    }

    //使用setter进行注入
    public void setTaxCalculator(TaxCalculator taxCalculator){
        this.taxCalculator = taxCalculator;
    }
    public void show(){
        System.out.println(taxCalculator.calculator());
    }
    public void show(TaxCalculator taxCalculator){
        System.out.println(taxCalculator.calculator());
    }

}
