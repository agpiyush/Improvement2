import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex9 {
	public static void main(String[] args) {
		 String[] s={"red","green","blue","ivory"};
		 int n=1;
		 System.out.println(reverse(s,n));
		}
		public static String reverse(String[] s, int n) {
		 String s1=new String();
		 List<String> l=new ArrayList<String>();
		 for(int i=0;i<s.length;i++)
		  l.add(s[i]);
		 Collections.sort(l,Collections.reverseOrder());
		 for(int i=0;i<l.size();i++)
		  if(i==(n-1))
		   s1=l.get(i);
		 return s1;
		}

}
