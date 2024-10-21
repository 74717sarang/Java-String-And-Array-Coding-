package Daily;

import java.util.HashSet;
import java.util.Set;

//leetcode 1593
public class SplitStringUniqueSubString {

    public  int maxUniqueSplit(String s) {
    return backTraking(s,0,new HashSet<>());
    }
	
	private int backTraking(String s, int start,Set<String>set) {
        int max=0;
        if(start==s.length()) {
        	return 0;
        }
		for(int i=start+1;i<=s.length();i++) {
			
			String str=s.substring(start,i);
			if(!set.contains(str)) {
				set.add(str);
			  int result=1+backTraking(s, i, set);
				max=Math.max(max, result);
			  set.remove(str);
			}
		}
		return max;
	}

	public static void main(String[] args) {
		String str = "ababccc";
		SplitStringUniqueSubString obj=new SplitStringUniqueSubString();
		System.out.println(obj.maxUniqueSplit(str));
		
		
		
//		List<String> list = new ArrayList<>();
//		for (int i = 0; i < str.length() - 2; i++) {
//			String s = str.substring(i, i + 1);
//			if (!list.contains(s)) {
//				list.add(s);
//			}
//			for (int j = i + 2; j < str.length(); j++) {
//				String s1 = str.substring(i, j);
//				String a = new StringBuffer(s1).reverse().toString();
//				if (!(list.contains(s1))) {
//					list.add(s1);
//					i++;
//				}
//				if (!list.contains(a)) {
//					list.add(a);
//					i++;
//					j++;
//				}
//			}

//		}
//			s=str.substring(i,i+2);
//			String a=new StringBuffer(s).reverse().toString();
//					if(!list.contains(s) || !(list.contains(a))) {
//						list.add(s);
//						}
//
////		}
//		list.stream().forEach(t -> System.out.print(t + " "));
//		System.out.println();
//		System.out.println(list.size());
	}

}
