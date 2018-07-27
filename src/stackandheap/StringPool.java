package stackandheap;

public class StringPool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "abc";
		String str2 = "abc";
		
		System.out.println(str1 == str2); //true- they are pointing same object in String pool in HEAP
		
		String str3 = "abc";
		String str4 = new String("abc");
		
		System.out.println(str3 == str4); //false- one is in pool,str4 is pointing to object outside pool
		
		String str5 = new String("abc");
		String str6 = new String("abc");
		
		System.out.println(str5 == str6); //false- 
		
		System.out.println(str1.equals(str2));
		System.out.println(str3.equals(str4));
		System.out.println(str5.equals(str6));

//		int i = 100 ;
//		int j= 100;
//		
//		i == j;
//		
		
		
		
	}

}
