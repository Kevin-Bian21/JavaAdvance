package Practice;

import java.util.Scanner;

/**
 * @author BianWenKai
 * @DATE 2021/10/5 - 21:40
 **/

/*
等额本息还款方式：每月所还的金额相同，本金逐月递增，利息逐月递减。
每月还款金额=[贷款本金×月利率×（1+月利率）^还款月数]÷[（1+月利率）^还款月数－1]
 */
public class Types {
    final static byte MONTHS_IN_YEARS = 12;
    final static byte PERCENTAGE = 100;
    static int year;
    public static void main(String[] args) {
        int count = 2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("贷款时长(年)：");
        judgeInt(scanner,count);

        System.out.print("贷款年利率：");
        float annualInterestRate = scanner.nextFloat();
        System.out.print("贷款总金额：");
        int loanAmount = scanner.nextInt();
        System.out.println("每月需要还:"+Math.round(calculate(loanAmount, annualInterestRate, year))+"￥");
    }

    public static double calculate(int money,float rate, int years){
            double monthRate = rate / PERCENTAGE / MONTHS_IN_YEARS;
            int monthCounts = years*MONTHS_IN_YEARS;
            return (money*(monthRate)*Math.pow((1+ monthRate),monthCounts))/(Math.pow((1+monthRate),monthCounts)-1);
        }

    public static int judgeInt(Scanner scanner,int count) {
        if (scanner.hasNextInt()) {
            year = scanner.nextInt();
            if (year > 0)
                return year;
        } else {
            while (count > 0) {
                System.out.println("还有"+ count-- +"次输入机会");
                scanner = new Scanner(System.in);
                judgeInt(scanner,count);
            }
            System.out.println("次数用完，程序结束");
            System.exit(0);
        }
        return year;
    }
}
