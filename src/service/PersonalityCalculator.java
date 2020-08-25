package service;

public class PersonalityCalculator{

	public String findYourBrainType(String options) {
		
		int ans[] = findAnswers(options);
		
		int A = ans[0] + ans[1] + ans[2] + ans[4] + ans[7] + ans[9] + ans[10] + ans[11] + ans[13] + ans[17] + ans[19];
		int B = ans[3] + ans[5] + ans[6] + ans[8] + ans[12] + ans[14] + ans[15] + ans[16] + ans[18];
		int X = 66 - A + B;
		
		if((X>=20) && (X<=55)) {
			return "leftbrained";
		}
		
		else if((X>=56) && (X<=64)) {
			return "noclearpreference";
		}
		
		else {
			return "rightbrained";
		}
	
		
	}
	
	public int[] findAnswers(String options) {
		String[] items = options.split(",");
		
		int[] arr = new int[options.length()];
		
		for(int i=0; i< options.length();i++) {
			arr[i] = Integer.parseInt(items[i]);
		}
		
		return arr;
		
	}
	
	
	
	
}

