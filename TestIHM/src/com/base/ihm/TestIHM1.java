package com.base.ihm;

import com.ihm.panels.PanneauFillOval;
import com.ihm.panels.PanneauImage;
import com.ihm.panels.PanneauRondMove;
import com.ihm.windows.Fenetre2;
import com.ihm.windows.Fenetre3;

public class TestIHM1 {

	public static void main(String[] args) {

		switch(3) {
		case 1 : Fenetre2 fen1 = new Fenetre2(new PanneauFillOval());
				break;
		case 2 : Fenetre2 fen2 = new Fenetre2(new PanneauImage());
				System.out.println("Cas 2");
				break;
		case 3 : Fenetre3 fen3 = new Fenetre3(new PanneauRondMove());
				System.out.println("Cas 3");
				break;
		default : System.out.println("Cas default du switch");
		}

		
	}

}
