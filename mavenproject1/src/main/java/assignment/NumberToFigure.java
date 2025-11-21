package assignment;

public class NumberToFigure {
	 public String converter(long n) {
		 String ones[] = {
			        "", "one", "two", "three", "four", "five", "six",
			        "seven", "eight", "nine", "ten", "eleven", "twelve",
			        "thirteen", "fourteen", "fifteen", "sixteen", "seventeen",
			        "eighteen", "nineteen"
			    };

			    String tens[] = {
			        "", "", "twenty", "thirty", "forty", "fifty",
			        "sixty", "seventy", "eighty", "ninety"
			    };
			    
			    long nunit[]= {
			    		10000000l, 100000l, 1000l, 100l, 1
			    };
			    String sunit[]= {
			    		" crores ", " lakhs ", " thousands ", " hundreds ", " only"
			    };
			    String word="";
			    for(int i=0; i<nunit.length; i++) {
			    	int x=(int) (n/nunit[i]);
			    	n = n%nunit[i];
					
					if(x>0) {
						if(x>19) {
							word = word + tens[x/10]+ones[x%10]+sunit[i];
						}
						else {
							word = word + ones[x]+sunit[i];
						}
					}
			    	
			    }
				return word;
	 }
	 
	 public static void main(String[] args) {
		System.out.println(new NumberToFigure().converter(656778));
	}
	    
	    

}
