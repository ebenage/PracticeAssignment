package practicalTwo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordAndMeaning {

	public static void main(String[] args) throws FileNotFoundException {

		doesFileExist("wordsAndMeaning.txt");
		
	}
	
	// Method to check if file exist
	public static void doesFileExist(String path) {
		
		// LineSeparator
		 		
				System.out.print(System.lineSeparator());
				//System.out.println("File exist!");
				
				try {
					// Declare File object
					//File file = new File("wordsAndMeaning.txt");
					
					System.out.println("**********");
					System.out.print(System.lineSeparator());
					// Create scanner object
					Scanner myReader = new Scanner(new File(path));

					// Iterate through the file line by line
					while (myReader.hasNextLine()) {

						String data = myReader.nextLine();

						// Splitting the file using delimiters
						String[] result = data.split(",|-");

						for (String str : result) {
							System.out.println(str);
						}

					}

					myReader.close();

				} catch (FileNotFoundException e) {
					System.out.println("File does not exist!");
					//e.printStackTrace();
				}

			}
		

	}

