package com.marvellous.infosystem.demoproject.game;

public class SuperContraGame implements GamingConsole {
	public void up() {
		System.out.println("Jump");
	}

	public void down() {
		System.out.println("Sit");
	}

	public void left() {
		System.out.println("go to the left side by jump");
	}

	public void right() {
		System.out.println("Fire bullet");
	}

}
