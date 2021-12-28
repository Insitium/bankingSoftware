package com.company;
import java.util.Currency;
import java.util.Scanner;
import java.util.ArrayList;
public class Main{

    public static void main(String[] args) {
	// write your code here
        Customer[] customers = new Customer[3];
        customers[0] = new Customer("Bruce","Wayne","Brampton","bWayne",12345);
        customers[1]= new Customer("Thanos","Badman","North York","tBadman",56789);
        customers[2] = new Customer("Wonder","Woman","Oakville","wWoman",39087);




            Accounts[] account = new Accounts[4];
            account[0] = new Accounts(1,customers[0],500,"Savings",0);
            account[1] = new Accounts(2,customers[1],1000.00,"Savings",0);
            account[2] = new Accounts(3,customers[2],500000.00,"Checking",1500);
            account[3] = new Accounts(4,customers[0],400000.00,"Checking",10000);


            Scanner read = new Scanner(System.in);
            System.out.print("Enter the username: ");
            String usernamecustomer = read.next();
            System.out.print("Enter the password: ");
            int passwordCustomer = read.nextInt();
            int check = 0;
            for(int i = 0; i<4;i++){
                if(check ==0 && (account[i].customer.getUsername()).equals(usernamecustomer) && (account[i].customer.getPassword()) == (passwordCustomer)){
                    System.out.println("Welcome "+account[i].customer.getFirstName()+" "+account[i].customer.getLastName());
                    System.out.println("Account Type: ");
                    System.out.println("Enter ‘C’ or ‘c’ for Checkings Account");
                    System.out.println("Enter ‘S’ or ‘s’ for Savings Account");
                   char typeofaccount = read.next().charAt(0);
                    if((typeofaccount == 's' || typeofaccount == 'S') && check == 0) {
                        SavingAccount savingaccount = new SavingAccount(account[i].getAccountNumber(), account[i].getCustomer(), account[i].getBalance(), account[i].getType(), account[i].getOverdraft(), "loggedion");
                        System.out.println("Name: " + savingaccount.customer.getFirstName() + " " + savingaccount.customer.getLastName());
                        System.out.println("balance: " + savingaccount.getBalance());
                        System.out.println("Account Type: " + savingaccount.getType());
                        while(true && check == 0){
                        System.out.println("Operation: ");
                        System.out.println("Enter D or 'd' to deposit");
                        System.out.println("Enter W or 'w' to withdraw");
                        System.out.println("Enter x or 'X' to exit app");
                        char nextstep = read.next().charAt(0);

                        if ((nextstep == 'D' || nextstep == 'd')&& check == 0) {
                            System.out.println("enter the amount: ");
                            double amount = read.nextDouble();
                            savingaccount.deposit(amount);
                            System.out.println("Updates balance: "+savingaccount.getBalance());
                        } else if ((nextstep == 'W' || nextstep == 'w') && check == 0) {
                            System.out.println("enter the amount: ");
                            double amount = read.nextDouble();
                            if (true) {

                                savingaccount.withdraw(amount);
                                System.out.println("Updates balance: "+savingaccount.getBalance());
                            } else {
                                System.out.println("The amount you are trying to withdraw exceeds your current balance");
                                System.out.println("current balance: "+savingaccount.getBalance());
                            }
                        }
                        else if((nextstep == 'x' || nextstep=='X') && check == 0){
                            System.out.println("Goodbye! Thanks for banking with us");
                            savingaccount.setLogstatus("loggedout");
                            check = 1;
                            break;
                        }else{
                            System.out.println("please enter a valid character");
                            break;
                        }
                    }
                    }else if(typeofaccount == 'c' || typeofaccount == 'C' && check ==0){
                        CheckingAccount checkingaccount = new CheckingAccount(account[i].getAccountNumber(),account[i].getCustomer(),account[i].getBalance(),account[i].getType(),account[i].getOverdraft(),"loggedin");
                        System.out.println("Name: " + checkingaccount.customer.getFirstName() + " " + checkingaccount.customer.getLastName());
                        System.out.println("balance: " + checkingaccount.getBalance());
                        System.out.println("Account Type: " + checkingaccount.getType());
                        while(true && check == 0) {
                            System.out.println("Operation: ");
                            System.out.println("Enter D or 'd' to deposit");
                            System.out.println("Enter W or 'w' to withdraw");
                            System.out.println("Enter x or 'X' to exit app");
                            char nextstep = read.next().charAt(0);

                            if ((nextstep == 'D' || nextstep == 'd')&& check == 0) {
                                System.out.println("enter the amount: ");
                                double amount = read.nextDouble();
                                checkingaccount.deposit(amount);
                                System.out.println("Updates balance: "+checkingaccount.getBalance());
                            } else if ((nextstep == 'W' || nextstep == 'w') && check == 0) {
                                System.out.println("enter the amount: ");
                                double amount = read.nextDouble();
                                checkingaccount.withdraw(amount);
                                System.out.println("Updates balance: "+checkingaccount.getBalance());
                                System.out.println("Overdraft balance: "+checkingaccount.getOverdraft());
                            } else if ((nextstep == 'x' || nextstep == 'X') && check == 0) {
                                System.out.println("Goodbye! Thanks for banking with us");
                                checkingaccount.setLogstatus("loggedout");
                                check = 1;
                                break;
                            } else {
                                System.out.println("please enter a valid character");
                                break;
                            }
                        }
                    }else{
                        System.out.println("wrong details");
                    }
                break;
            }
        }

    }
}




