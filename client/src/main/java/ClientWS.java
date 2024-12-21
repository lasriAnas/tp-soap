import proxy.Account;
import proxy.BankService;
import proxy.BankWS;

public class ClientWS {
    public static void main(String[] args) {
        BankService stub= new BankWS().getBankServicePort();
        System.out.println(stub.conversion(7600));

        Account account= stub.getAccount(1);
        System.out.println(account.getCode());
        System.out.println(account.getBalance());
    }
}