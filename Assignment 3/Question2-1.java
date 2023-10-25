
import java.util.Scanner;

abstract class Bank{
	String accNo;  //customer account number with Bank
	String custName; //customer name
	int custGender;  //customer gender 1 = Male, 2 =Female
	String custJob;  //customer job positions
	double curBal;
	static int totalBalance;
	public Bank(String accNo,String custName,int custGender,String custJob,double curBal) {
		this.accNo=accNo;
		this.custName=custName;
		this.custGender=custGender;
		this.custJob=custJob;
		this.curBal=curBal;
	}
	public String toString() {
		System.out.println("===================================================");
		return "Customer Name: "+custName+"\n"+"Account No: "+accNo+"\n"+"Gender: "+(custGender==1?"Male":"Female")+"\n"+"Current Balance: "+curBal;
	}
	public abstract double calcBalance();
	
}

class Saving extends Bank{
	double savRate;  //percent interest rate per year
	public Saving(String accNo,String custName,int custGender,String custJob,double curBal,double savRate) {
		super(accNo, custName, custGender, custJob, curBal);
		this.savRate=savRate;
		totalBalance+=curBal;
	}
	@Override
	public double calcBalance() {
		return curBal+(savRate*curBal);
	}
}
class Current extends Bank{
	static int countCustomer;
	boolean fixedDep;  //whether the customer keeps the fixed// deposit with the bank of not
	double curRate;  //percent interest rate per year
	public Current(String accNo,String custName,int custGender,String custJob,double curBal,double curRate,boolean fixedDep) {
		super(accNo, custName, custGender, custJob, curBal);
		this.curRate=curRate;
		this.curBal=curBal;
		this.fixedDep=fixedDep;
		countCustomer++;
		totalBalance+=curBal;
	}
	@Override
	public double calcBalance() {
		double bal=curBal+ (curRate*curBal);
		if(fixedDep) {
			return bal-(12*150);
		}
		return bal;
	}
}



public class Question2 {
	
	public static Bank search(Bank[]arr,String accountNo) {
		for(Bank obj:arr) {
			if(obj.accNo.equals(accountNo)) {
				return obj;
			}
		}
		return null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank obj1=new Saving("12345678", "Saif Khan", 1, "Engineer", 2000, 3.5);
//		System.out.println(obj1.calcBalance());
		Bank obj2=new Saving("12345679", "Suvendu Hatua", 1, "Student", 5000, 3.5);
//		System.out.println(obj2.calcBalance());
		Bank obj3=new Saving("12345680", "Tushar Shukla", 1, "Engineer", 15000.25, 3.5);			
		
		Bank obj4=new Current("12345690", "Mayank",2, "Engineer",10000.50 ,2.5,false);
//		System.out.println(obj4.calcBalance());
		Bank obj5=new Current("12345691", "Harsh",1, "Govt. Employee",20000.50 , 6.5,true);
//		System.out.println(obj5.calcBalance());
		Bank obj6=new Current("12345692", "Abhisar",2, "Student",5000.50 , 5.5,true);
		
		Bank[] arr= {obj1,obj2,obj3,obj4,obj5,obj6};
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter your Account Number:");
		String accountNo=scanner.next();
		System.out.println("Searching......................");
		Bank output=search(arr, accountNo);
		if(output!=null) {
			System.out.println(output);
		}
		else {
			System.out.println("Sorry!! No Account found....");
		}
		
		
		System.out.println("Printing total no of current account holder and total balance of all the customer(Saving + current)");
		System.out.println(Current.countCustomer);
		System.out.println(Bank.totalBalance);
	}

}
