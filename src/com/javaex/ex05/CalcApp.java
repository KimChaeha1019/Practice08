package com.javaex.ex05;

import java.util.Scanner;

public class CalcApp {

    public static void main(String[] args) {

    	Scanner sc = new Scanner(System.in);
    	
    	while(true) {
    		System.out.print(">> ");
        	
        	String numLine = sc.nextLine();
        	
        	String ast = numLine.substring(0, 1);
        	String second = numLine.substring(1, 2);
        	String bst = numLine.substring(2, 3);
        	
        	int a = Integer.parseInt(ast);
        	int b = Integer.parseInt(bst);
        
        	//더하기
        	Add sumAdd = new Add();
        	sumAdd.setValue(a, b);
        	
        	//빼기
        	Sub sumSub = new Sub();
        	sumSub.setValue(a, b);
        	
        	//곱하기
        	Mul sumMul = new Mul();
        	sumMul.setValue(a, b);
        	
        	//나누기
        	Div sumDiv = new Div();
        	sumDiv.setValue(a, b);
        	
        
    		if(second.equals("+")) {
        		int result = sumAdd.calculate();
        		System.out.println(">> " + result);
        		
        	} else if(second.equals("-")) {
        		int result = sumSub.calculate();
        		System.out.println(">> " + result);
        		
        	} else if(second.equals("*")) {
        		int result = sumMul.calculate();
        		System.out.println(">> " + result);
        		
        	} else if(second.equals("/")) {
        		int result = sumDiv.calculate();
        		System.out.println(">> " + result);
        		
        	} else {
        		System.out.println("종료합니다.");
        		break;
        		
        	}
    		
    	}
    	
    	
    		
  
    	
    	
    	
    	sc.close();
    	
    }
}
