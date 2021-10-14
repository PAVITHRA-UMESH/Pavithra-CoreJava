package Session;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class EmailsDemo {

	public static void main(String[] args) throws IOException {

		String email[] = new String[5];
		String em;
		System.out.println("Enter valid Email id : ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (int i = 0; i < 5; i++) {
			em = br.readLine();
			if (isvalid(em)) {
				email[i] = em;
			} else {
				System.out.println("Invalid!!!!!");
				i--;
			}
		}
		File file1 = new File("MyResource/Emails.txt");
		BufferedWriter br1 = new BufferedWriter(new FileWriter(file1, true));
		for (int i = 0; i < 5; i++) {

			br1.write(email[i]);
			br1.newLine();
		}
		br1.close();

		String line[] = new String[50];
		String dm[] = new String[50];
		File file2 = new File("MyResource/Domains.txt");
		BufferedWriter br3 = new BufferedWriter(new FileWriter(file2, true));
		BufferedReader br2 = new BufferedReader(new FileReader(file1));
		int i = 0;
		while ((line[i] = br2.readLine()) != null) {
			dm[i] = line[i].substring(line[i].indexOf("@") + 1);
			if (dm[i].isEmpty() || line[i].indexOf("@") <= 0) {

			} else {
				br3.write(dm[i]);
				br3.newLine();
				i++;
			}

		}
		br2.close();
		br3.close();
	}

	private static boolean isvalid(String email) {

		if (email.matches("\\w{2,10}[@]\\w{2,10}[.]\\w{3}"))
			return true;
		else
			return false;
	}
}
