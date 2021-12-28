package com.company;

public class CheckingAccount extends Accounts{
    protected String logstatus;
    public CheckingAccount(){
    }

    public CheckingAccount(int accountNumber, Customer customer, double balance, String type,double overdraft, String logstatus) {
        super(accountNumber, customer, balance, type, overdraft);
        this.logstatus = logstatus;
    }

    public String getLogstatus() {
        return logstatus;
    }

    public void setLogstatus(String logstatus) {
        this.logstatus = logstatus;
    }
    public void deposit(double depositamount){
        this.balance+=depositamount;
    }

    public void withdraw(double withdrawamount){
        if(this.balance>=withdrawamount){
            this.balance-=withdrawamount;
        }else{
            this.balance = 0;
            this.overdraft = withdrawamount-this.balance;
        }
    }
}
