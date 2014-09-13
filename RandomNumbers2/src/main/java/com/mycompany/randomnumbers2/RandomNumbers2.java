
package com.mycompany.randomnumbers2;

import java.util.Random;

public class RandomNumbers2 {
static Random r = new Random();

    public static void main(String[] args) {
      int one, two, three, four, five, six;
		one = two = three = four = five = six = 0;
		
		for (int count = 0; count < 1000; count++) {
			
			int dice = r.nextInt(6)+1;
			
			switch (dice){
			case 1:
				one++;
				break;
			case 2:
				two++;
				break;	
			case 3:
				three++;
				break;
			case 4:
				four++;
				break;
			case 5:
				five++;
				break;
			case 6:
				six++;
				break;
			}
		}
	
		System.out.println("1: "+ one);
		System.out.println("2: "+ two);
		System.out.println("3: "+ three);
		System.out.println("4: "+ four);
		System.out.println("5: "+ five);
		System.out.println("6: "+ six);
    }

}


