
import java.util.Scanner;
import java.io.*;
public class filehandling {
	static void store() {
		try {
			Scanner sc=new Scanner(System.in);
			FileWriter fw=new FileWriter("cse.text");
			BufferedWriter bw=new BufferedWriter(fw);
			while(true) {
				String input=sc.nextLine();
				if(input.equalsIgnoreCase("exit")) {
					bw.close();
					System.out.println("success");
					break;
				}
				 else {
				bw.write(input);
				bw.newLine();
				}
            }
	     }
		catch(Exception e) {
			e.printStackTrace();
		}
    }
	/*static void read() {
		try {
			FileReader fr=new FileReader("cse.txt");
			BufferedReader br=new BufferedReader(fr);
			int line=br.read();
			System.out.println(line);
			}
		catch(Exception e) {
			e.printStackTrace();
		}
	}*/
public static void main(String args[]) {
	store();
	//read();
}
}
