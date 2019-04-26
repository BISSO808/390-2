import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws Exception {
		linkedList list = new linkedList();
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the name of filename");
		String app=input.next();
		ArrayList<Integer> lines = new ArrayList<Integer>();
		try {
			File file = new File(app);
			FileReader fileReader = new FileReader(file+".txt");
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				Integer doubleObject = new Integer(line);
				lines.add(doubleObject);
			}
			for(int p:lines) {
				list.makeNode(p);
			}
			System.out.println("The content of the file is");
			list.showList();

			fileReader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}