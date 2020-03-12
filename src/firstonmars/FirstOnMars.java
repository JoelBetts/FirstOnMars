// Joel Betts

package firstonmars;

import java.util.Scanner;

/**
 *
 * @author jobet9976
 */
public class FirstOnMars {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Scanner keyedInput = new Scanner(System.in); 
        
        
        String rsp1, rsp2, rsp3, rsp4, rsp5, rsp6, rsp7, rsp8, rsp9, rsp10;
        String rsp11, rsp12, rsp13;
        
        
        System.out.println("Shaking in your seat. Alarms, sounds and lights going off.");
        System.out.println("Your heart beating in your chest. You my friend are the");
        System.out.println("first person on Mars.");
        System.out.println("");
        System.out.println("Would you like to leave the space craft right away? (Yes/No)");
   
        rsp1 = keyedInput.nextLine();
        
        if (rsp1.equals ("No"))
        {
            System.out.println("");
            System.out.println("You get some rest and do your procedures. You are off to a good start!");
            System.out.println("You wake up due to a loud alarm. 'Fuel leak' 'Explostion Alert'");
            System.out.println("Do you stay and fix it? (Yes/No)");
            
            rsp2 = keyedInput.nextLine();
            
            if (rsp2.equals("No"))
            {
                System.out.println("");
                System.out.println("The spacecraft explodes! You are on mars without life support and after 12hrs your suit runs out of oxygen. You die.");
                System.out.println("Restart by clicking the play button.");
              
            }
            else 
            {
                System.out.println("");
                System.out.println("You manage to stop the leak and avoid the explosion.");
                System.out.println("One day out you see some Martians");
                System.out.println("Do you go see them? (Yes/No)");
                
                rsp3 = keyedInput.nextLine();
            
                if (rsp3.equals("No"))
                {
                    System.out.println("");
                    System.out.println("After sometime you believe the martians are all gone. You thought to off heard some music one night then you heard a riot.");
                    System.out.println("You think a dance battle had occured and broke out into a big fight.");
                    System.out.println("You are on mars alone.");
                    System.out.println("Do you explore or establish a base? (Explore/Base)");
                    
                    rsp4 = keyedInput.nextLine();
            
                    if (rsp4.equals("Explore"))
                    {
                        System.out.println("");
                        System.out.println("Your buggy runs out of gas. You will indefinitely die.");
                        System.out.println("Restart by clicking the play button.");
                    }
                    else
                    {
                        System.out.println("");
                        System.out.println("You are all set to live on mars! Your mission is a success and your name will go down in history!");    
                    }
                }
            else
            {
                System.out.println("");
                System.out.println("The martians prove to be nice. After some time learning to communicate you");
                System.out.println("over hear them talking about having a dance battle.");
                System.out.println("");
                System.out.println("You go talk to them...");
                System.out.println("You talk to them and ask if you can participate. They say yes and the battle begins.");
                System.out.println("");
                System.out.println("It's towards the end and getting intense. Do you bring out the sprinkler to end things? (Yes/No)");
                
                rsp5 = keyedInput.nextLine();

                if (rsp5.equals("Yes"))
                {
                    System.out.println("");
                    System.out.println("You are beaten to death. They saw the sprinkler as a treat, thinking you wanted to shoot them.");
                    System.out.println("No time for explaination you die.");
                    System.out.println("Restart by clicking the play button");
                }
                else
                {
                    System.out.println("");
                    System.out.println("You lose the battle. Before starting they didn't tell you that it is to the death and you are killed for lack of moves.");
                    System.out.println("Restart by clicking the play button.");
                }
            }
        }
            
        }
        else
        {
            System.out.println("");
            System.out.println("Not doing your procedures you forget your oxygen and start to suffocate.");
            System.out.println("Run back to space craft? (Walk/Run)");
            
            rsp6 = keyedInput.nextLine();
            
            if (rsp6.equals ("Run"))
            {
                System.out.println("");
                System.out.println("Your heart speeds up and without oxygen you have hypoxemia.");
                System.out.println("Restart by clicking the play button.");
            }
            else
            {
                System.out.println("");
                System.out.println("You try to reduce your heart rate but fall to the ground.");
                System.out.println("Amazingly, some martians find you and take you into care, giving you oxygen.");
                System.out.println("");
                System.out.println("After waking up do you steal their oxygen and go back for the spacecraft? (Yes/No)");
                
                rsp7 = keyedInput.nextLine();
                
                if (rsp7.equals("Yes"))
                {
                    System.out.println("");
                    System.out.println("The spacecraft exploded! You are on mars without life support and after 12hrs your suit runs out of oxygen. You die.");
                    System.out.println("Restart by clicking the play button.");  
                }
                else
                {
                    System.out.println("");
                    System.out.println("The martians prove to be nice. After some time learning to communicate you");
                    System.out.println("over hear them talking about having a dance battle.");
                    System.out.println("");
                    System.out.println("You go talk to them...");
                    System.out.println("You talk to them and ask if you can participate. They say yes and the battle begins.");
                    System.out.println("");
                    System.out.println("It's towards the end and getting intense. Do you bring out the sprinkler to end things? (Yes/No)");
                
                    rsp8 = keyedInput.nextLine();
                
                
                    if (rsp8.equals("No"))
                    {
                        System.out.println("");
                        System.out.println("You lose the battle. Before starting they didn't tell you that it is to the death and you are killed for lack of moves.");
                        System.out.println("Restart by clicking the play button.");
                    }
                    else
                    {
                        System.out.println("");
                        System.out.println("You are beaten to death. They saw the sprinkler as a treat, thinking you wanted to shoot them.");
                        System.out.println("No time for explaination you die.");
                        System.out.println("Restart by clicking the play button");    
                    }
                }
            }        
        }
    }
}            
