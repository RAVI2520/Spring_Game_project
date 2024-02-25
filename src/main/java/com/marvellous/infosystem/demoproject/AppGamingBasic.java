package com.marvellous.infosystem.demoproject;

import com.marvellous.infosystem.demoproject.game.MarioGame;
import com.marvellous.infosystem.demoproject.game.SuperContraGame;
import com.marvellous.infosystem.demoproject.runner.GameRunner;

public class AppGamingBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 var superContra = new SuperContraGame();
	 var marioGame = new MarioGame();
	 System.out.println("This is for Super Contra Game");
	 var gameRunner = new GameRunner(superContra);
	 gameRunner.run();
	 System.out.println("This is for Mario Game");
	  gameRunner = new GameRunner(marioGame);
	 gameRunner.run();
	 
	}
 
}
