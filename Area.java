package area;

import java.util.*;
public class Area {
     int width; //밑변
     int height; //높이
     
     //사용자가 입력한 밑변과 높이를 입력받는 메소드
     public void printInput(int width, int height) {
    	 System.out.println("당신이 입력한 밑변은 "+width+" 높이는 "+height+" 입니다");
     }
     
     //삼각형 넓이 계산 메소드
	 public void printArea_Triangle(int width, int height) {
		 System.out.println("넓이는 "+(width*height)/2+" 입니다.");
	 }
	 
	 //사각형 넓이 계산 메소드
	 public void printArea_Square(int width, int height) {
		 System.out.println("넓이는 "+(width*height)+" 입니다.");
	 }
	
	
	public static void main(String[] args) {
		
		Area triangle = new Area(); //삼각형 객체 생성
		Area square = new Area(); //사각형 객체 생성
		
		Scanner scanner = new Scanner(System.in); 
	    Scanner width = new Scanner(System.in);
	    Scanner height = new Scanner(System.in);
	    
		System.out.println("어떤 도형의 넓이를 구하고 싶으신가요?");
        System.out.println("1.삼각형 2.사각형");
		int user_input = scanner.nextInt();
		
		if (user_input == 1) {
			System.out.println("넓이를 구하고자 하는 밑변을 입력해주세요");
		    int input_triangle_width = width.nextInt();
		    
		    System.out.println("넓이를 구하고자 하는 밑변을 입력해주세요");
			int input_triangle_height = height.nextInt();
			
			triangle.printInput(input_triangle_width, input_triangle_height);
			triangle.printArea_Triangle(input_triangle_width, input_triangle_height);
			
		}else if(user_input == 2) {
			System.out.println("넓이를 구하고자 하는 밑변을 입력해주세요");
		    int input_Square_width = width.nextInt();
		    
		    System.out.println("넓이를 구하고자 하는 밑변을 입력해주세요");
			int input_Square_height = height.nextInt();
			
			square.printInput(input_Square_width, input_Square_height);
			square.printArea_Square(input_Square_width, input_Square_height);
			
		}else{
			System.out.println("지원하지 않는 도형입니다.");
		}
		
		
		scanner.close();
		width.close();
		height.close();

	}

}
