package l1;

public class rew {
	   public static void main(String args[]) {
	      String str = "amama dud rtyui roroioror posop hytreds dopiuynwf"; 
	      String[] words = str.split("\\s+"); // ��������� ������ �� ����� � ������� �������������� (������)
	      // ����� �� �����
	      for(String subStr:words) {
	    	  if (isPalindrome(subStr))
	         System.out.println(subStr);  
	      }  
	   }
	   
	   public static String reverseString(String s) {
		   String r = "";
		   // ����� ������� �������� ������ � ����� ������ �� ������
		   // � ��������� �� � ������ ������-���������� (���������� r)
		   for (int i = s.length() - 1; i >= 0; --i) r += s.charAt(i);
		   return r;
		   }


		   	

		   public static Boolean isPalindrome(String s) {
		       return s.equals(reverseString(s));
		   }
	}