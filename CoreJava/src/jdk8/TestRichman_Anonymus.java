package jdk8;

import abstract_Interface.Richman;

public class TestRichman_Anonymus  {
	
	public static void main(String[] args) {
		Richman rich = new Richman() {
			
			@Override
			public void party() {
				
				System.out.println("party");
			}
			
			@Override
			public void earnmoney() {
				System.out.println("earn money");
				
			}
			
			@Override
			public void donation() {
				System.out.println("donation");
				
			}
		};
		rich.party();
		rich.earnmoney();
		rich.donation();
	}
}
