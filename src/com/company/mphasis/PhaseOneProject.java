package com.company.mphasis;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class PhaseOneProject {
		//create File ....
		public static void genaretFile(String fileName) throws IOException 
		{
			String filePath="D:\\Mphasis\\";
			ArrayList<String> aList=new ArrayList<String>();
			
			System.out.println("enter the file name to create");
			String finalname=filePath+fileName;
			
			File f=new File(finalname);
			boolean b=f.createNewFile();
			if(b!=true) 
			{
				System.out.println("the file not created");
			}
			else 
			{
				aList.add(fileName);
				System.out.println("file created");
			}
			
			System.out.println("Your list is .... "+aList);
		}
		
		//Delete Function
		
		public static void deleteFile(String fileName) {
			String path="D:\\Mphasis\\";

			String finalfile=path+fileName;
			File file=new File(finalfile);
			file.delete();
			System.out.println("file deleted");
			
		}
		//Searching Function
		
		public static void serchFile(String serchingFileName) {
			String path="D:\\Mphasis\\";
			File f=new File(path);
			File filename[]=f.listFiles();
			int count=0;
			for(File ff:filename) {
				
				if(ff.getName().equals(serchingFileName))
				{
					count++;
					break;
				}else {
					count=0;
				}
			}
			if (count!=0) {
				System.out.println("You have "+serchingFileName+" File ");
				
			}else {
				System.out.println("File is not found");
			}
		}
		
		//Display File List...
		
		public  static void displayFile() {
			String path="D:\\Mphasis\\";
			File f=new File(path);
			File filename[]=f.listFiles();
			System.out.println("List of Files ");
			for(File ff:filename) {
				System.out.println(ff.getName());
			}
		}
		
		
		//Main Method Start....
		
		public static void main(String[] args) throws IOException {
			
			Scanner scanner =new Scanner(System.in);
			boolean c=true;
			//for stop Main menu;
			
			
			while(c) {
				System.out.println("          LookMe.com            ");
				System.out.println(" To Retrive File enter 1");
				System.out.println(" To Enter in Business Level operation enter  2");
				System.out.println(" To cloase the System enter  3");
				System.out.println();
				boolean b=true;
				int x=scanner.nextInt();
				switch (x) {
				case 1:{
					displayFile();
					System.out.println();
					break;
				}
				case 2: 
				{	while(true) {
					System.out.println("Which task you want to do ?");
					System.out.println();
					System.out.println(" To Create File enter 1");
					System.out.println(" To Delete File enter 2");
					System.out.println(" To Search File enter 3");
					System.out.println(" To go Main Menu enter 4");
					System.out.println();
					int i=scanner.nextInt();
					
					if(i<=0 || i>=6) {
						
						System.out.println(" Please enter valid number! ");
						System.out.println();
				
					}else{
							if(i==1){
							System.out.println(" Enter the File Name for which you want to create ");
										
							String  FileForCreate=scanner.next();
							genaretFile(FileForCreate);
							System.out.println();
										
									}
									else if(i==2) {
										System.out.println("Enter the File name which you want to delete ");
										String FileForDelete=scanner.next();
										deleteFile(FileForDelete);
										System.out.println();
									}
									else if(i== 3) {
										System.out.println("Enter the File Name which you want to search ");
										
									
									String FileForSerching=scanner.next();
									serchFile(FileForSerching);
									System.out.println();
									}
									else if(i==4) {
										System.out.println(" Main Menu ");
										System.out.println();
										break;
									}
						
							}			
				}
				break;
					}
				
				case 3:{
					System.out.println("System is closed");
					c=false;
					break;
					
				}
				}	
			}	
		}
	}

