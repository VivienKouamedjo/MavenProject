package com.zoo;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger ;

public class TestLogger {
	
	private static final Logger logger = LogManager.getLogger(Animal.class);
	
	public static void main(String[] args) {
		Chat ani = new Chat("la","Chat");
		// TODO Auto-generated method stub
		logger.debug(" Nouvel animal :" +ani.getClass().toString());
	}

}
