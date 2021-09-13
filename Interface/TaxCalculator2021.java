package Interface;

/**
 * @author BianWenKai
 * @DATE 2021/9/13 - 17:40
 **/
public class TaxCalculator2021 implements TaxCalculator {

    private double account;

    public TaxCalculator2021(double account){
        this.account = account;
    }

    @Override
    public double calculator() {
        return account * 0.3;
    }
}
