
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.FileWriter;

public class InputTest{
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter Integer:");
        FileWriter file = new FileWriter("data_java.txt");
        try {
            int num = Integer.parseInt(br.readLine());
            for (int i = 0; i < num ; i++){
            	file.write("Hello java!\n");
            }
        	
        } catch(NumberFormatException nfe) {
            System.err.println("Invalid Format!");
            file.close();
        }
        file.close();
    }
}