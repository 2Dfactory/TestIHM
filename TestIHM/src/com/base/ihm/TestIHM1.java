package com.base.ihm;

import com.ihm.panels.PanneauFillOval;
import com.ihm.panels.PanneauImage;
import com.ihm.panels.PanneauRondMove;
import com.ihm.windows.FLayoutBox;
import com.ihm.windows.Fenetre2;
import com.ihm.windows.FRondMove;
import com.ihm.windows.FJButton;

public class TestIHM1 {

	public static void main(String[] args) {

		switch(5) {
		case 1 : Fenetre2 fen1 = new Fenetre2(new PanneauFillOval());
				break;
		case 2 : Fenetre2 fen2 = new Fenetre2(new PanneauImage());
				System.out.println("Cas 2");
				break;
		case 3 : FRondMove fen3 = new FRondMove(new PanneauRondMove());
				System.out.println("Cas 3");
				break;
		case 4 : FJButton fen4 = new FJButton();
				System.out.println("Cas 4");
				break;
		case 5 : FLayoutBox fen5 = new FLayoutBox();
		System.out.println("Cas 4");
		break;
		default : System.out.println("Cas default du switch");
		}

		
	}

}
