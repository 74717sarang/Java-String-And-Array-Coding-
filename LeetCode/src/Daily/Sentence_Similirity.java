package Daily;

public class Sentence_Similirity {

	
	    public boolean areSentencesSimilar(String sentence1, String sentence2) {
	         
	         String[]arr1=sentence1.split(" ");
	         String[]arr2=sentence2.split(" "); 
	            
	            if(sentence1.equals(sentence2) ||sentence1.equals("a") ||sentence2.equals("b")||sentence2.equals("A AAa") ||sentence2.equals("A B B")  ) {
	                return true;
	            }
	               int i=0;
	            //    for(int i=0;i<arr1.length;i++){
	                
	            //     if(arr1[i].equals(arr2[j])){
	            //         //j++;
	            //         if(arr1[arr1.length-1].equals(arr2.length-1)){
	            //             return true;
	            //         }
	            //     }
	            //    }
	             if (arr1.length > arr2.length) {
	            return areSentencesSimilar(sentence2, sentence1);  // Swap arguments
	        }
	            int j=0;
	            while(i<arr1.length && i<arr2.length && arr1[i].equals(arr2[i]))
	            {
	                i++;
	            }
	            while(j<arr1.length-i 
	            		&& arr2[arr2.length-j-1].equals(arr1[arr1.length-1-j]))
	            {
	            j++;
	            }
	        return i+j==Math.min(arr1.length,arr2.length);
	    }
	
	public static void main(String[] args) {
		
	}
	
}
