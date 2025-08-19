public class FirstLastChar {
	    public static void main(String[] args) {
	        String name = "sameera"; 
            char firstChar = name.charAt(0); 
	        char lastChar = name.charAt(name.length() - 1); 
            System.out.println("First character: " + firstChar);
	        System.out.println("Last character: " + lastChar);
	    }
	}