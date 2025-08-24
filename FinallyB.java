package Corejava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;

public class FinallyB {

	public static void main(String[] args) {
		
//		try {
//			File file = new File("abc.txt");
//			if(file.createNewFile()) {
//				System.out.println("File created: "+ file.getAbsolutePath());
//			}else {
//				System.out.println("File already exists at: "+ file);
//			}
//		}catch(IOException f) {
//			System.out.println("an error occurred while creating the file.");
//			f.toString();
//		}
//
//		BufferedReader br = null;
//		try {
//			br = new BufferedReader(new FileReader("abc.txt"));
//
//		
//		}catch(IOException e){
//			e.printStackTrace();
//		}
//		finally {
//			try {
//			if(br != null)
//				br.close();
//				System.out.println("BufferedReader closed successfully");
//			}catch(IOException e) {
//				System.out.println("erroe while closing BufferedReader.");
//				e.printStackTrace();
//			}
//		}
		
//		Try - with - resources
		
		try(BufferedReader br = new BufferedReader(new FileReader("abc.txt"))) {
			String line;
			while((line = br.readLine()) != null ) {
				System.out.println(line);
			}
		}catch(IOException i){
			System.out.println(i.toString());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
