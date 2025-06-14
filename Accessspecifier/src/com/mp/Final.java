package com.mp;

import org.maruthu.Default;
import org.maruthu.Private;
import org.maruthu.Protected;
import org.maruthu.Public;

public class Final extends Protected{

	public static void main(String[] args) {
		Protected mult = new Protected();
		Public subraction = new Public();
		Private addition = new Private();
		Default Division = new Default();
		Final obj = new Final();
		
//		mult.multiply();
		subraction.sub();
//		addition.add();
//		Division.divide();
		obj.multiply();
	}

	}


