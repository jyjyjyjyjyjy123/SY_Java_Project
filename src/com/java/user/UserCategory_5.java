package com.java.user;

import java.util.Scanner;

public class UserCategory_5 {
	public static void category(){
		boolean loop = true;
		while (loop) {
			Scanner scan = new Scanner(System.in);
			
			UserPrint.talrent();
			UserPrint.category5();
			System.out.print("                 메뉴 입력: ");

			String inputMenuNum = scan.nextLine();
			String[] inputMenuNumTest = inputMenuNum.split("");
			switch (inputMenuNumTest[0]) {
			case "1":
				UserPage.mypage();
				continue;
			case "2":
				UserItemList.itemList("BAC");
				continue;
			case "3":
				UserItemList.itemList("COU");
				continue;
			case "4":
				UserItemList.itemList("BED");
				continue;
			case "5":
				UserItemList.itemList("TAL");
				continue;
			case "6":
				UserItemList.itemList("BOW");
				continue;
			case "0":
				loop = false;
				break;
			default:
				System.out.println("               잘못된 메뉴 입니다.");
				scan.nextLine();
				continue;
			}
		}
	}

	
	
}
