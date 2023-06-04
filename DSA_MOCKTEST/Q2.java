public class Q2 {
	
	    public static void main(String[] args)
	    {
	    	
	    	String s = "loveleetcode";
	    	//s="leetcode";
	    	int index=-1;
	    	
	    	for(int i=0; i<s.length(); i++) {
	    		index=i;
	    		char charAtindex = s.charAt(i);
	    		String subString=s.substring(i+1);
	    		
	    		if(!subString.contains(charAtindex+"")) {	
	    			break;
	    		}
	    		
	    	}
	    	System.out.println(index);
	    }

}
