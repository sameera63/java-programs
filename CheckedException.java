class schoolageException extends Exception{
	schoolageException(String message){
		super(message);
	}
}
class checkedException{
	static void check() {
		int age=2;
		try {
			if(age<=4) {
				throw new schoolageException("you are not allowed to school because your age is less than 4 ");
			}
			else {
				System.out.println("you are allowed....");
			}
		}
		catch(schoolageException e) {
			e.printStackTrace();
		}
	}
}
