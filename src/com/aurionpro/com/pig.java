package com.aurionpro.com;

import java.util.*;
import java.util.Random;
import java.util.random.*;
import java.io.*;

public class pig {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int randomNumber = 1;
		int points = 0;
		int turn = 0;
		boolean flag = true;
		while (points<20) {
			turn = turn + 1;
			System.out.println("TURN" + turn);
			flag = true;
			while (flag == true) {
				System.out.println("Roll or Hold(r/h)");
				String ch = sc.nextLine();
				if (ch.equals("r")) {

					randomNumber = random.nextInt(6) + 1;
					System.out.println("DIE:" + randomNumber);
					if (randomNumber == 1) {
						System.out.println("Turn Over,No Score");
						points = 0;
						flag = false;
						break;
					}

					else {
						points = points + randomNumber;
						if(points>20)
							break;
					}

				} else if (ch.equals("h")) {
					System.out.println("Score for turn " + turn + "Equals:" + points);
					flag = false;
					break;

				}
			}
		}
		System.out.println("Total Score:" + points);
		System.out.println("Completed in :" + turn + "Turns");
		sc.close();

	}

}
