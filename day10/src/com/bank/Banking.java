package com.bank;
import java.io.*;





public class Banking {

	public static void main(String[] args) throws IOException {
		
		Account na = new Account("홍길동");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String strWork =" ";  // 작업을 선택할 때 사용하 변수 // string에는 변수가 항상 필요함   입력받는 값의 변수로 
		
		do {
			System.out.println("\n 업무를 선택해 주세요.");
			System.out.println("====================");
			System.out.println("입	  금===========> 1");
			System.out.println("출	  금===========> 2");
			System.out.println("잔 액 조 회===========> 3");			
			System.out.println("종	  료===========> 0");
			System.out.println("====================");
			
			System.out.println("원하는 업무를 선택하세요");
			strWork = br.readLine();
			
			int switchInt = 0;
		
			
			if (strWork != null) {
				switchInt = Integer.parseInt(strWork);
				
			}else {
				System.out.println("업무를 선택하지 않았습니다.");
				System.exit(0);// return;
			}
			
			switch(switchInt){
				
			case 0 :
				System.out.println("프로그램을 종료합니다.");
			break;
			
			case 1 :
				System.out.println("\n===============");
				System.out.print("입금할 금액 입력 : ");
				String strdepositIn = br.readLine();
				long depositLong = Long.parseLong(strdepositIn);
				na.deposit(depositLong); // 입금금액 매개변수에 넣음 
				break;
			
			case 2 :
				System.out.println("\n===============");
				System.out.print("출금할 금액 입력 : ");
				String strwithdrawIn = br.readLine();
				long withdrawLong = Long.parseLong(strwithdrawIn);
				na.withdraw(withdrawLong);
				break;
				
			case 3 :
				System.out.println(na.getName()+"님의 잔액은 " + na.getBalance()+"원 입니다.");
			break;
			
			default :
				System.out.println("업무 메뉴는 0 ~ 3 사이의 숫자만 가능합니다.");
			
			}
			
			
		}while(!strWork.equals("0"));
		
		
		
		
		
		
		
		
		
	}

}
