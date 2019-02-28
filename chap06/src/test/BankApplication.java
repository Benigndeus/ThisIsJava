package test;

import java.util.Scanner;

public class BankApplication {
    private static Account[] accountArray = new Account[100];
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
    	
    	boolean run = true;
    	while(run) {
		    System.out.println("--------------------------------------------------------");
		    System.out.println("1. ���»��� | 2. ���¸�� | 3. ���� | 4. ��� | 5. ����");
		    System.out.println("--------------------------------------------------------");
		    System.out.print("����> ");
	
		    int selectNo = scanner.nextInt();
	
		    if(selectNo == 1) {
		        createAccount();
		    } else if(selectNo == 2) {
		    	accountList();
		    } else if(selectNo == 3) {
		    	deposit();
		    } else if(selectNo == 4) {
		    	withdraw();
		    } else if(selectNo == 5) {
		    	run = false;
		    }
		}
    	System.out.println("���α׷� ����");
    }

    // ���»����ϱ�
    private static void createAccount() {
    	// �ۼ� ��ġ
    	
    	// \n buffer delete
    	scanner.nextLine();
    	
		System.out.println("--------------");
		System.out.println("���»���");
		System.out.println("--------------");
	
		System.out.print("���¹�ȣ : ");
		String ano = scanner.nextLine();
	
		// ���⿡ ln�� �ٴ� ������ �ѱ��� ��Ŭ������ �Ⱦ��ϱ� �����̴�.
		System.out.println("������ : ");
		String owner = scanner.nextLine();
	
		System.out.print("�ʱ��Աݾ� : ");
		int balance = scanner.nextInt();
		
		// \n buffer delete
    	scanner.nextLine();
	
		// ��¥ �̵� �����ιۿ� �� ��?
		for(int i=0; i<accountArray.length; i++) {
			if(accountArray[i] == null) {
				accountArray[i] = new Account(ano, owner, balance);
				System.out.println("��� : ���°� �����Ǿ����ϴ�.");
				break;
			}
			if(accountArray[accountArray.length-1] != null) {
				System.out.println("��� : ���� ���� ����. ���� �� �ѵ� 100��.");
				break;
			}
		}
    }

    // ���¸�Ϻ���
    private static void accountList() {
    	// �ۼ� ��ġ
    	
    	// \n buffer delete
    	scanner.nextLine();
    	
    	System.out.println("--------------");
		System.out.println("���¸��");
		System.out.println("--------------");
    	
    	for(int i=0; i<accountArray.length; i++) {
    		if(accountArray[i] != null) {
    			System.out.printf("%s\t%s\t%d\n", 
    					accountArray[i].getAno(), accountArray[i].getOwner(), accountArray[i].getBalance());
    		}
    	}
    }

    // �����ϱ�
    private static void deposit() {
    	// �ۼ� ��ġ
    	
    	// \n buffer delete
    	scanner.nextLine();
    	
    	System.out.println("--------------");
		System.out.println("����");
		System.out.println("--------------");
		
		String ano;
		int money = 0;
		
		System.out.print("���¹�ȣ : ");
		ano = scanner.nextLine();
		
		if(findAccount(ano) != null) {
			money += findAccount(ano).getBalance();
			
			System.out.print("���ݾ� : ");
			money += scanner.nextInt();
			findAccount(ano).setBalance(money);
			
			System.out.println("��� : ������ �����Ǿ����ϴ�.");
		} else {
			System.out.println("ã�� ���°� �����ϴ�. ���¹�ȣ�� ��Ȯ�� �Է����ּ���.");
		}
    }

    // ����ϱ�
    private static void withdraw() {
     	//  �ۼ� ��ġ
    	
    	// \n buffer delete
    	scanner.nextLine();
    	
    	System.out.println("--------------");
		System.out.println("���");
		System.out.println("--------------");
		
		String ano;
		int money = 0;
		
		System.out.print("���¹�ȣ : ");
		ano = scanner.nextLine();
		
		if(findAccount(ano) != null) {
			money += findAccount(ano).getBalance();
			
			System.out.print("��ݾ� : ");
			money -= scanner.nextInt();
			
			if(money < 0) {
				System.out.println("��� : ���¿� ���� �����ϴ�.");
				return;
			}
			
			findAccount(ano).setBalance(money);
			
			System.out.println("��� : ����� �����Ǿ����ϴ�.");
		} else {
			System.out.println("ã�� ���°� �����ϴ�. ���¹�ȣ�� ��Ȯ�� �Է����ּ���.");
		}
    }

    // Account �迭���� ano�� ������ Account ��ü ã��
    private static Account findAccount(String ano) {
    	// �ۼ� ��ġ
    	
    	for(int i=0; i<accountArray.length; i++) {
    		if(accountArray[i].getAno().equals(ano)) {
    			return accountArray[i];
    		}
    	}
    	
		return null;
    }
}