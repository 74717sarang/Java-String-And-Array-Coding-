package DailyNew1;

import java.util.ArrayList;
import java.util.List;

public class leetcode1352 {

	
	    List<Integer> prefixProduct;
	    int lastZeroIdx;
	    public leetcode1352() {
	        prefixProduct = new ArrayList<>();
	        prefixProduct.add(1);
	        lastZeroIdx = -1;
	    }

	    public void add(int num) {
	        if (num == 0) {
	            prefixProduct.clear();
	            prefixProduct.add(1);
	            lastZeroIdx = prefixProduct.size() - 1;
	        } else {
	            prefixProduct.add(num * prefixProduct.get(prefixProduct.size() - 1));
	        }
	    }

	    public int getProduct(int k) {
	        int size = prefixProduct.size();
	        if (size - k - 1 < lastZeroIdx) return 0;
	        return prefixProduct.get(size - 1) / prefixProduct.get(size - k - 1);
	    }
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
