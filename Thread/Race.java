package Thread;

/**
 * @author BianWenKai
 * @DATE 2021/9/26 - 18:55
 **/
public class Race implements Runnable {

    private String winner;

    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            if (gameOver(i))
                break;
            System.out.println(java.lang.Thread.currentThread().getName() + "-->跑了" + i + "步");
        }
    }

    public boolean gameOver(int step){
        if (winner != null)
            return true;
        if (step == 100){
            winner = java.lang.Thread.currentThread().getName();
            System.out.println(winner);
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Race race = new Race();
        new java.lang.Thread(race,"兔子").start();
        new java.lang.Thread(race,"乌龟").start();

    }
}
