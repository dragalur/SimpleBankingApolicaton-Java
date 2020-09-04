import java.util.Scanner;

 class BankingApplication {
	 
public static void main(String[] args) {
	int personNum = 0;
	System.out.println("How peaple you want add: ");
	Scanner sc = new Scanner(System.in);
	try {
		 personNum = sc.nextInt();
	}
	catch(Exception e) {
		 System.out.println("Enter number!");
	}
	Account person[]=new Account[personNum];
	for(int i=0; i< personNum; i++ ) {
		person[i]=new Account();
		person[i].addAccount();
	}
	
	int choise=0;
	do {
        System.out.println("Main Menu\n"
        		+ "1. Display All\n "
        		+ "2. Search By Account\n "
        		+ "3. Deposit\n "
        		+ "4. Withdrawal\n "
        		+ "5. Exit ");
        System.out.println("Your choise: ");
        		choise=sc.nextInt();
        		switch(choise) {
        		case 1:
        			for(int i=0; i<person.length; i++) {
        				person[i].showDataAccount();
        			}
        			break;
        		case 2:
        	        System.out.println("Enter what account you want search: ");
        	        String id =sc.next();
        	        boolean found =false;
        	        for(int i=0; i<person.length; i++) {
        	        		found=person[i].search(id);
        				if(found) {
        					break;
        				}
        				}
        				if(!found) {
                            System.out.println("Search Failed..Account Not Exist..");
        				}
        			break;
        		case 3:
        			System.out.println("Enter what account you want search: ");
        	         id =sc.next();
        	         found =false;
        	        for(int i=0; i<person.length; i++) {
        	        		found=person[i].search(id);
        				if(found) {
        					person[i].deposit();
        					break;
        				}
        				}
        				if(!found) {
                            System.out.println("Search Failed..Account Not Exist..");
        				}
        			break;
        			
        		case 4:
        			System.out.println("Enter what account you want search: ");
        	         id =sc.next();
        	         found =false;
        	        for(int i=0; i<person.length; i++) {
        	        		found=person[i].search(id);
        				if(found) {
        					person[i].takeMoney();
        					break;
        				}
        				}
        				if(!found) {
                            System.out.println("Search Failed..Account Not Exist..");
        				}
        			break;
        		case 5:
                    System.out.println("Good Bye..");
                    break;
        		}
	}while(choise!=5);
	
}

}
