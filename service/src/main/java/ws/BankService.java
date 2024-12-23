package ws;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.Date;
import java.util.List;

@WebService(serviceName = "bankWS")
public class BankService {
    @WebMethod
    public double conversion(@WebParam(name = "amount") double amount){
        double CONVERSION_RATE = 0.0951;
        return Math.round(amount / CONVERSION_RATE * 100.0) / 100.0;
    };

    @WebMethod
    public Account getAccount(@WebParam(name = "code") int code){
        double balance = Math.round(Math.random()*9999 * 100.0) / 100.0;
        return new Account(code, balance, new Date());
    }

    @WebMethod
    public List<Account> AccountList(){
        return List.of(
                new Account(1, Math.round(Math.random()*9999 * 100.0) / 100.0, new Date()),
                new Account(2, Math.round(Math.random()*9999 * 100.0) / 100.0, new Date()),
                new Account(3, Math.round(Math.random()*9999 * 100.0) / 100.0, new Date())
        );
    }
}
