package com.marvellous.infosystem.demoproject.game;

public class PacManGame implements GamingConsole{

	public void up() {
		System.out.println("move towards the top of the maze");
	}

	public void down() {
		System.out.println("move towards bottom of the maze");
	}

	public void left() {
		System.out.println("move towards left side of maze");
	}

	public void right() {
		System.out.println("move towards right side of maze");
	}
}
