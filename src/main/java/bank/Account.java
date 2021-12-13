package bank;

public class Account extends Thread {
    private long id;
    private double amount;
    private long userId;
    private boolean blocked;

//    public Account(long id, double amount, long userId, boolean blocked) {
//        this.id = id;
//        this.amount = amount;
//        this.userId = userId;
//        this.blocked = blocked;
//    }

//    @Override
//    public void run(){
//
//    }
//
//    public static void main(String[] args) {
//        for (int i = 0; i < 10; i++) {
//            Thread acc = new Account();
//            acc.start();
//        }
//    }
}
