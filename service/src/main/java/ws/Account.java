package ws;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlTransient;

import java.util.Date;

@XmlRootElement(name = "account")

@XmlAccessorType(XmlAccessType.FIELD)
public class Account {
    private int code;
    private double balance;
    @XmlTransient
    private Date createDate;

    public Account() {
    }

    public Account(int code, double balance, Date createDate) {
        this.code = code;
        this.balance = balance;
        this.createDate = createDate;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
