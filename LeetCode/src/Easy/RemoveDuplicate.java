package Easy;

public class RemoveDuplicate {

	public static void main(String[] args) {

		int no=106;
		System.out.println(StringConvertner(no));
	}

	private static String StringConvertner(int no) {
           
		String result="";
		String[]unit= {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", 
                "Ten"};
		String tens[]= {"","","Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
		if(no==100) return  result="Hundreed"; 
		
		if(no>100) 
		{
			
			result+=tens[no/10]+"Hundred";
			no%=10;
		}
		
		if(no>20) {
			result+=tens[no/10]+" ";
			no%=10;
		}
		if(no>0) {
			result+=unit[no]; 
		}
		
		return result;
	}

}
