package com.excep;

public class ExceptionEx {

	static void startInstall() throws SpaceException, MemoryException{
		
		// 공간이 부족했을 경우
		if(enoughSpace()) {
			throw new SpaceException("설치할 공간이 부족합니다.");
		}
		
		//메모리가 부족했을 경우
		if(!enoughMemory()) {
			throw new MemoryException("메모리가 부족합니다.");
		}
		
		
	}
	
	static boolean enoughSpace() {
		//설치하는데 필요한 공간이 있는지를 확인하는 코드
		return false;
	}
	
	static boolean enoughMemory() {
		//설치하는데 필요한 공간이 있는지를 확인하는 코드
		return false;
	}
	
	static void copyFiles() {}
	static void deleteTempFiles() {}
	
	
	public static void main(String[] args) {
		 try {
			 startInstall(); //프로그램 설치에 필요한 준비
			 copyFiles();
		 }catch(SpaceException s) {
			  System.out.println("에러메시지:"+s.getMessage());
			  s.printStackTrace();
			 System.out.println("공간을 확보한후 프로그램을 다시 설치하시기 바랍니다.");
			 
		 }catch(MemoryException me) {
			 System.out.println("에러메시지:"+me.getMessage());
			 me.printStackTrace();
			 System.gc();
			 System.out.println("메모리를 충분히 확보한후 프로그램을 다시 설치 바랍니다.");
		 }finally {
			 deleteTempFiles();
		 }

	}

}
