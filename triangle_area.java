package area;

import java.util.*;

public class triangle_area {
      int width;  //밑변
      int height; //높이
      
      
     
     public void printInput(int width, int height) {
    	 System.out.println("당신이 입력한 밑변은 "+width+" 높이는 "+height+"입니다.");
     }
     public void printArea(int width, int height){
    	 System.out.println("넓이는 "+ (width*height)/2 +" 입니다.");
    	 
     }
	
	
	
	
	public static void main(String[] args) {
		triangle_area area = new triangle_area();
		Scanner scanner_width = new Scanner(System.in);
		Scanner scanner_height = new Scanner(System.in);
		
		System.out.println("넓이를 구하고자 하는 밑변을 입력해주세요");
		
		int user_input_width = scanner_width.nextInt();
		
		System.out.println("넓이를 구하고자 하는 높이를 입력해주세요");
		
		int user_input_height = scanner_height.nextInt();
		
		area.printInput(user_input_width,user_input_height);
		area.printArea(user_input_width, user_input_height);
		
		scanner_width.close();
		scanner_height.close();

	}

}
