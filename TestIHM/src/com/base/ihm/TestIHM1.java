package com.base.ihm;

import com.ihm.panels.PanneauFillOval;
import com.ihm.panels.PanneauImage;
import com.ihm.windows.Fenetre2;

public class TestIHM1 {

	public static void main(String[] args) {

		switch(2) {
		case 1 : Fenetre2 fen1 = new Fenetre2(new PanneauFillOval());
				break;
		case 2 : Fenetre2 fen2 = new Fenetre2(new PanneauImage());
				System.out.println("Cas 2");
				break;
		default : System.out.println("Cas default du switch");
		}

		
	}

}
