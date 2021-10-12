package myjavaarray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;



public class asending_order {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  List<String> colors = new ArrayList<>(Arrays.asList("r","g","b","b"));
		  
	        Collections.reverse(colors);
	        System.out.println(colors);

}
}