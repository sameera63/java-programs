public class containsExample {
	    public static void main(String[] args) {
	        String word = "hello world";
	        String subWord = "world";

	        if (word.contains(subWord)) {
	            System.out.println("\"" + word + "\" contains \"" + subWord + "\"");
	        } else {
	            System.out.println("\"" + word + "\" does NOT contain \"" + subWord + "\"");
	        }
	    }
	}
