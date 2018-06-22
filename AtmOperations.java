package com.bankatmsystem.mitsos;

import java.util.ArrayList;

final public class AtmOperations   {
	
	private  ArrayList<Double> moneyList;  //money deposits and withdrawal logs
	private int pass;
	private boolean passToAccept = false;
	private double moneyHere ;
	
	
	
	public AtmOperations(double moneyHere, int pass) {
		this.moneyList = new ArrayList<Double>();
		this.moneyList.add(moneyHere);
		calculateDepositList(); // strictly notation -> this method here if removed we can change Bank rules . If removed the customer must do at least one deposit to do withdrawal afterward.
		this.pass = pass;		//	           if keep the method , the customer can do withdrawal the first he made  when opening the account
	}
	
	public void validationPass(int p) {                  //validation password here , boolean flag PassToAccept must be true to achieve
		if (p == this.pass) {							 // withdrawal or deposit .
			this.passToAccept = true;
			System.out.println("password accepted");
		} else {
			System.out.println("password invalid");
		}
	}
	


	public ArrayList<Double> getMoneyList() {
		return moneyList;
	}


	public int getPass() {
		return pass;
	}
	
	
	
	


	public double getMoneyHere() {
		return moneyHere;
	}


	@Override
	public String toString() {
		
		return " money in bank " + this.moneyList;
	}
	
	
	public boolean addMoney(double amount) {
		if (this.passToAccept == true) {         
		moneyList.add(amount);
		calculateDepositList();
		return true;
		}
		return true;
	}
	
	
	
	public void removeMoney(double amount) {
		double negativeAmount = -amount;
		if (this.passToAccept == true) {
		if ( (moneyHere - amount) >= 0.00 ) {
			moneyList.add(negativeAmount);
			System.out.println("remove money succeed");
			calculateDepositList();	
		} else {
			System.out.println("cant remove money");
			
			}
		}

	}
	

	
	public double calculateDepositList() {      //calculate positive and negative numbers (deposit withdrawal)
		double sum = 0 ;

		for (int i=0; i<moneyList.size(); i++) {
			//moneyHere +=moneyList.get(i);
			sum +=moneyList.get(i);
			//System.out.println("to poso einai --->"  + sum);
		}
		this.moneyHere = sum;
		System.out.println("to poso einai --->"  + this.moneyHere);
		
		return this.moneyHere;

	}
	

	public void takeWallet() {
		System.out.println("TakeWallet info here " + moneyHere);
	}
	

}
