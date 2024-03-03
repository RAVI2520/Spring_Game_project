package com.marvellous.infosystem.implementgameusing.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.marvellous.infosystem.demoproject.game.GamingConsole;
import com.marvellous.infosystem.demoproject.game.MarioGame;
import com.marvellous.infosystem.demoproject.game.PacManGame;
import com.marvellous.infosystem.demoproject.game.SuperContraGame;
import com.marvellous.infosystem.demoproject.runner.GameRunner;

public class App03GamingSpring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	try(	var context = new AnnotationConfigApplicationContext(GamingConfigurationSpring.class)) {
		context.getBean(GamingConsole.class).up();
		
		context.getBean(GameRunner.class).run();
	}
	
		

	}

}
