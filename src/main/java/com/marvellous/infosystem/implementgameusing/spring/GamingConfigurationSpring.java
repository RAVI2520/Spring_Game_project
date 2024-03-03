package com.marvellous.infosystem.implementgameusing.spring;

import org.springframework.context.annotation.Bean;

import com.marvellous.infosystem.demoproject.game.GamingConsole;
import com.marvellous.infosystem.demoproject.game.PacManGame;
import com.marvellous.infosystem.demoproject.runner.GameRunner;

public class GamingConfigurationSpring {

	@Bean
	public GamingConsole gamingConsole() {
		var game = new PacManGame();
		return game;
	}

	@Bean
	public GameRunner gameRunner(GamingConsole game) {
		var gameRunner = new GameRunner(game);
		return gameRunner;
	}

}
