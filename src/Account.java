import java.util.Scanner;

public class Account {
private String name;
private String id;
private long balance;

Scanner cs = new Scanner(System.in);

    void addAccount(){	   
	   System.out.println("Name person: ");
	   name=cs.next();
	   System.out.println("Personal ID: ");
	   id=cs.next();
	   System.out.println("Ballance : ");
	   balance=cs.nextLong();
    }
    
    void showDataAccount() {    	
    	System.out.println("Name: "+name+" ID: "+id+" Ballance: "+balance);    	
    }
    
    void deposit() {
    	System.out.println("When amount of deposit: ");
    	int money=cs.nextInt(); 
    	balance+=money;
    }
  
    void takeMoney() {
    	System.out.println("When you take: ");
    	int money=cs.nextInt(); 
    	if(balance<money) {
    		System.out.println("Your balance too small.");
    	}else {
    		balance-=money;
    	}    	
    }
    
    boolean search(String acn) {
        if (id.equals(acn)) {
            showDataAccount();
            return (true);
        }
        return (false);
    }
}
    
    

