package com.cg;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class VehicleFactory {

	public static Vehicle getInstance() {

		String className = readFromFile("vehicle.config");
		System.out.println(className);
		Vehicle v = null;

		try {
			Class cls = Class.forName(className);
			v = (Vehicle) cls.newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		return v;
	}

	private static String readFromFile(String fileName) {
		String className = null;
		FileReader fr = null;
		BufferedReader br = null;

		try {
			fr = new FileReader(fileName);
			br = new BufferedReader(fr);		
			className = br.readLine();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return className;
	}

}
