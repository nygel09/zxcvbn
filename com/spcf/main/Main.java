package com.spcf.main;

import java.io.IOException;

import com.spcf.methods.Inputs;


public class Main {

	public static void main(String[] args) throws IOException {
		
		Inputs inpmet = new Inputs();
		int tryAgain =1;
		while (tryAgain == 1) {			
			inpmet.loopInput(inpmet.selectType(),inpmet.selectNumber());
			tryAgain = inpmet.tryAgain();
			
		}
	}
	
}
