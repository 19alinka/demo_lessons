package bank;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class Bank {
    private static ConcurrentMap<Long, Account> accMap = new ConcurrentHashMap<>();

    public static void main(String[] args) {

       // Bank bank = new Bank();
        for (int i = 0; i < 10; i++){
            accMap.put((long) Math.random(), new Account());
        }
//        for (Account account : accMap) {
//            account.start();
//        }
    }

    public void transferMoney(long srcAccId, long dstAccTd, double amount){

    }
}
