package org.usfirst.frc.team1699.utils.auto;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Utils {
	
	public static int parseInt(String s){
		try{
			return Integer.parseInt(s);
		}catch(NumberFormatException e){
			e.printStackTrace();
			return 0;
		}
	}
	
	public static int[] loadFileAsArray(String path, int width){
		int[] fileAsString = new int[width];
		try {
			BufferedReader br = new BufferedReader(new FileReader(path));
			String line;
			while((line = br.readLine()) != null){
				String[] l = line.split(" ");
				for(int j = 0; j < l.length; j++){
					fileAsString[j] = Utils.parseInt(l[j]);
				}
				
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return fileAsString;
	}
}
