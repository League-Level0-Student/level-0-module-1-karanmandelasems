package _07_riddler;

import javax.swing.JOptionPane;
public class TheRiddler {
	public static void main(String[] args) {
	int playerHealth1 = 100;
	int playerHealth2 = 100;
		int playerMeleeAttack = 15;
		int playerRangedAttack = 20;
		int playerMagicAttack = 50;
		int IQ = playerMeleeAttack + playerRangedAttack;
		// 5. Create a variable to hold the damage the dragon's attack does each round
		
		// 6.  Delete the slashes at the beginning of the next line.  
	while(playerHealth1 >0 &&playerHealth2 >0) {     
		
		// 7. Add a closing mustache at the very bottom of this program (since we just added an opening mustache on the previous step).
		if (playerHealth2 >= 0) {
			JOptionPane.showMessageDialog(null,"Player 1, You have " + playerHealth1 + " left. the opponent has " + playerHealth2 + " health left,");
			}
		if (playerHealth1 >= 0) {
			JOptionPane.showMessageDialog(null,"Player 2, You have " + playerHealth2 + " left. the opponent has " + playerHealth1 + " health left,");
			}
		// 8. Ask the player in a pop-up if they want to attack the dragon with a yell or a kick
	String attackMethodP1 =	JOptionPane.showInputDialog("Player 1, Do you want to use your Sword,Bow, or Flame Burst Inferno to attack?  Or would you rather use Taunt or Shield?");
	String attackMethodP2 =	JOptionPane.showInputDialog("Player 2, Do you want to use your Sword,Bow, or Flame Burst Inferno to attack?  Or would you rather use Taunt or Shield?");
		// 9. If they typed in "yell":
		if (attackMethodP1.equalsIgnoreCase("Bow")) {
			playerHealth2 = playerHealth2 - playerRangedAttack;
		}
		// 10. If they typed in "kick":
		if (attackMethodP1.equalsIgnoreCase("Sword")) {
			playerHealth2 = playerHealth2- playerMeleeAttack;
		}
		if(attackMethodP1.equalsIgnoreCase("IQ")) {
			playerHealth2 = playerHealth2- IQ;	
		}
		if (attackMethodP1.equalsIgnoreCase("Flame Burst Inferno")) {
			playerHealth2 = playerHealth2 - playerMagicAttack;
			playerHealth1 = playerHealth1 - 10;
		}
		
		if (attackMethodP1.equalsIgnoreCase("Taunt")) {
			playerMagicAttack = playerMagicAttack + 30;
			playerRangedAttack = playerRangedAttack +30;
			IQ = IQ - IQ;
		}
		if (attackMethodP2.equalsIgnoreCase("Shield")) {
			playerMeleeAttack = playerMeleeAttack - 100;
		}
		if (playerHealth1 <= 0) {
		JOptionPane.showMessageDialog(null, "You lost, and your spirit flew out of your body.");
		}
		if (attackMethodP2.equalsIgnoreCase("Flame Burst Inferno")) {
			playerHealth1 = playerHealth1 - playerMagicAttack;
			playerHealth2 = playerHealth2 - 10;
		}
		if(attackMethodP2.equalsIgnoreCase("Bow")) {
			playerHealth1 = playerHealth1 - playerRangedAttack;
		}
		// 10. If they typed in "kick":
		if (attackMethodP2.equalsIgnoreCase("Sword")) {
			playerHealth1 = playerHealth1 - playerMeleeAttack;
		}
		if (playerHealth2 <= 0) {
		JOptionPane.showMessageDialog(null, "You lost, and your spirit flew out of your body.");
		}
		if (attackMethodP2.equalsIgnoreCase("Flame Burst Inferno")) {
			playerHealth1 = playerHealth1 - playerMagicAttack;
			playerHealth2 = playerHealth2 - 10;
		}
		if(attackMethodP2.equalsIgnoreCase("IQ")) {
			playerHealth1 = playerHealth1 - IQ;	
		}	
		if (attackMethodP2.equalsIgnoreCase("Taunt")) {
			playerMagicAttack = playerMagicAttack - 50;
			playerRangedAttack = playerRangedAttack - 10;
			IQ = IQ - IQ;
		}
		if (attackMethodP2.equalsIgnoreCase("Shield")) {
			playerMeleeAttack = playerMeleeAttack - 100;
		}
		if (playerHealth1 <= 50) {
		JOptionPane.showMessageDialog(null, "You've lost half your health! Be careful!");
		}
		if (playerHealth2 <= 50) {
			JOptionPane.showMessageDialog(null, "You've lost half your health! Be careful!");
			}
	}
		}
}