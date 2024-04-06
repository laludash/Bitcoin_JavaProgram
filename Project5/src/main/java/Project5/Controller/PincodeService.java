package Project5.Controller;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.stereotype.Service;

@Service
public class PincodeService {

	public static List<PincodeEntity> loadData(String pincode) throws Exception
	{
		List<PincodeEntity> pe = new ArrayList<>();
		String fname = "Pincode_30052019.csv";
		File f1 = new File(fname);
		Scanner sc1 = new Scanner(f1);
		while(sc1.hasNext())
		{
			String[] arr1 = sc1.nextLine().split(",");
			if(arr1.length >= 5 && arr1[4].equals(pincode))
			{
				 pe.add(new PincodeEntity(arr1[4],arr1[0]));
			}
		}
		
		sc1.close();
		return pe;
		
		
		
	}
//	List<String> pincode  = new ArrayList<>();
//	List<String>  circlename   = new ArrayList<>();
//	List<String> li4 = new ArrayList<>();
//	
//	String fname1 = "Pincode_30052019.csv";
//	File f1 = new File(fname1);
//	Scanner sc1 = new Scanner(f1);
//	while(sc1.hasNext())
//	{
//		String[] arr1  = sc1.nextLine().split(",");
//		for(int i=0; i<10; i++)
//		{
//		circlename.add(arr1[0]);
//		pincode.add(arr1[5]);
//		}
//		
//	}
//	sc1.close(); // Close the scanner to release resources
//	
//	return pincode;
//	}

}
