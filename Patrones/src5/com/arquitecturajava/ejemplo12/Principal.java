package com.arquitecturajava.ejemplo12;

public class Principal {

	public static void main(String[] args) {
		BrazoRobot brazo= new BrazoRobotStandard();
		RobotCocina robot= new RobotCocina(brazo);
		robot.cocinar();
		
		System.out.println("para");
		System.out.println("cambia brazo");
		
		robot.setBrazo(new BrazoMerengue());
		robot.cocinar();
		
	}
}
