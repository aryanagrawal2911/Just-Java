import java.io.*;

public class Basic_Datacleaning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileReader fr = new FileReader("C:\\Users\\hp\\Downloads\\[CSE3141] Attendance - Sheet1 (1).csv");
			FileWriter fw = new FileWriter("C:\\Users\\hp\\Desktop\\Untitled.txt");
			BufferedReader br = new BufferedReader(fr);
			BufferedWriter bw = new BufferedWriter(fw);

			String line = br.readLine();
			while (line != null) {
				String ans[] = line.split(",+", 0);
				String res = ans[0];
				for (int i = 1; i < ans.length - 2; i++) {
					res = res + "," + ans[i];
				}
				System.out.println(res);
				bw.write(res + "\n");
				line = br.readLine();
			}
			fr.close();
			bw.close();
			// System.out.println("File Copied");
		} catch (IOException e) {
			System.out.println("Error");
			e.printStackTrace();
		}
	}

}
