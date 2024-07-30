package com.arrayEx;
import java.util.*;

public class VectorEx01 {

	public static void main(String[] args) {
		
		Vector<String> v = new Vector<String>(5); // 백터에 스트링을 저장한다. //() 지정하지 않으면 디폴트가 10임 -> 5로 지정 
		v.add("1"); // 스트링안에 저장할 수있는 기능
		v.add("2");
		v.add("3");
		print(v);
		
		// 빈 공간 없애기 ( 용량과 크기를 갖게 하기)
					v.trimToSize();
					System.out.println("==After trimTosize()====");
					print(v);
					
	    // 공간을 제한하는 방법 - 더이상 커지지 않게 
					v.ensureCapacity(6); // 공간 6개 제한 
					System.out.println("==ensureCapacity()====");
					print(v);
					
					v.setSize(7);
					System.out.println("==setSize()====");
					print(v);
					
					v.clear ();
					System.out.println("==clear()====");
					print(v);
					
					
					
	}

		public static void print(Vector v) {
			System.out.println(v);
			System.out.println("size :" +v.size());  // 용량 5개중 3개 들어가 있음 / 빈공간 2개 
			System.out.println("capacity : "+v.capacity()); // 용량 지정 - 5개  지정 x - 10 
			
			
		}
	
	
}
