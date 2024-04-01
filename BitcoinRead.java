package bitcoin;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BitcoinRead {

	public static void main(String[] args) throws IOException {
	
		String fname = "bitcoin_2017_to_2023.csv";
		List<String> li1 = new ArrayList<String>();
		List<Double> li2 = new ArrayList<Double>();
		List<Double> li3 = new ArrayList<>();
		List<String> li4 = new ArrayList<>();
		File f1 = new File(fname);
		Scanner sc1 = new Scanner(f1);
		sc1.nextLine();
		for(int i=0;i<20;i++)
		{
			String arr[] = sc1.nextLine().split(",");
			li1.add(arr[0]);
			li2.add(Double.parseDouble(arr[1])); 
		}
		for(int i =0; i<20; i++)
		{
			String s1 = li1.get(i).substring(8,10);
			String s2 = li1.get(i).substring(0,4);
			System.out.print(s1);
			System.out.println(s2);
			if(s1.equals("01") && s2.equals("2023"))
			{
				 li3.add(li2.get(i));
				 li4.add(li1.get(i));
			}
			
		}
		
		
		System.out.println(li3);
	}

}
