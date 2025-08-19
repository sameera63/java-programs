public class spattern{
	public static void main(String args[])
	{
		int size=7;
		int i,j;
		for(i=0;i<size;i++){
			if(i==0 || i==size/2 || i==size-1){
				for(j=0;j<size;j++) {
					System.out.print("*");
				}
			}
			else if(i<size/2){
				System.out.print("*");
			}
			else{
				for(j=0;j<size-1;j++)
				System.out.println(" ");
			}
			System.out.print("*");
		}
		System.out.println();
	}
}
