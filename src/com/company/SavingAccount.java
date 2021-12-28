package com.company;

public class SavingAccount extends Accounts{
    protected String logstatus;
    public SavingAccount(){
    }

    public SavingAccount(int accountNumber, Customer customer, double balance, String type,double overdraft,String logstatus) {
        super(accountNumber, customer, balance, type,overdraft);
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
    public Boolean withdraw(double withdrawamount){
        if(this.balance >= withdrawamount){
            this.balance -= withdrawamount;
            return true;
        }else{
            return false;
        }
    }
}
