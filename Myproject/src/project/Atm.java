package project;
import java.util.Scanner;
public class Atm {

	public static void main(String[] args) {
				 int balance = 100000, withdraw, deposit;  
				 int rupees;
			        Scanner sc = new Scanner(System.in);  
			          
			        while(true)  
			        {  
			            System.out.println("Automated Teller Machine");  
			            System.out.println("Choose 1 for Withdraw");  
			            System.out.println("Choose 2 for Deposit");  
			            System.out.println("Choose 3 for Check Balance");  
			            System.out.println("Choose 4 for EXIT");  
			            System.out.print("Choose the operation you want to perform:");  
			              
			              
			            int choice = sc.nextInt();  
			            switch(choice)  
			            {  
			        case 1:  
			        System.out.print("Enter rupees:");  
			        rupees = sc.nextInt();
		            
			        System.out.println("Number of 2000 rs notes is:"+(rupees/2000));
			        System.out.println("Number of 500 rs notes is:"+(rupees%2000/500));
			        System.out.println("Number of 100 rs notes is:"+(rupees%2000%500/200));
			        System.out.println("Number of 50 rs notes is:"+(rupees%2000%500%200/100));
			        System.out.println("Number of 20 rs notes is:"+(rupees%2000%500%200%100/20));
			        System.out.println("Number of 10 rs notes is:"+(rupees%2000%500%200%100%20/10));
			        System.out.println("Number of 5 rs notes is:"+(rupees%2000%500%200%100%20%10/5));
			        System.out.println("Number of 1 rs notes is:"+(rupees%2000%500%200%100%20%10%5/1));
			        System.out.println("withdraw succesfull:");
			        withdraw = sc.nextInt();
			        if(balance >= withdraw)  
			        {  
			              
			            balance = balance - withdraw;  
			            System.out.println("Please collect your money");  
			        }  
			        else  
			        {  
			            
			            System.out.println("Insufficient Balance");  
			        }  
			        System.out.println("");  
			        break;  
			 case 2:  
		         
		         System.out.print("Enter money to be deposited:");  
		                       
		           
		         deposit = sc.nextInt();  
		         
		         
			        System.out.println("Number of 2000 rs notes is:"+(deposit/2000));
			        System.out.println("Number of 500 rs notes is:"+(deposit%2000/500));
			        System.out.println("Number of 100 rs notes is:"+(deposit%2000%500/200));
			        System.out.println("Number of 50 rs notes is:"+(deposit%2000%500%200/100));
			        System.out.println("Number of 20 rs notes is:"+(deposit%2000%500%200%100/20));
			        System.out.println("Number of 10 rs notes is:"+(deposit%2000%500%200%100%20/10));
			        System.out.println("Number of 5 rs notes is:"+(deposit%2000%500%200%100%20%10/5));
			        System.out.println("Number of 1 rs notes is:"+(deposit%2000%500%200%100%20%10%5/1));
			        System.out.println("withdraw succesfull:");
		                       
		         
		         balance = balance + deposit;  
		         System.out.println("Your Money has been successfully depsited");  
		         System.out.println("");  
		         break; 
			 case 3:  
			         
			        System.out.println("Balance : "+balance);  
			        System.out.println("");  
			        break;  
			   
			                case 4:  
			          
			        System.exit(0);  
			  
			            }  
			          
			    }  
		}
		}
		