//Name this Adventure Model 
package bv;

import java.util.ArrayList;

class Rooms extends Escape{

    public static void build(Room[] room, final int num) {
    	

    	//creates rooms with an array
        for (int i = 0; i < num; i++) {
                room[i] = new Room(i, "", "", null);
            }

        //add suspense with more text
        room[0].setName("Vault Room");
         room[0].setDescription("You wake up from a daze to see you are trapped. You start to sweat and your heart beats faster.\n"
        		+ "You realize you are trapped in a bank vault room with a bag of money in your hand and you must escape \n"
        		+ "commands are:\n"
        		+ "n - Press North to view the north wall\n"
        		+ "s - Press South to view the south Wall\n"
        		+ "e - Press East to view the east wall\n"
        		+ "w - Press West to view the west wall");
        room[0].setNorthText("North wall - You see a wall with many dusty shelves. The lights start to flicker.\n"
        		+ " the number 4 is written on it.");
        room[0].setSouthText("South wall - This wall appears to have a note on it with the number 6 written on it.");
        room[0].setEastText("East wall - It’s the vault door, but appears to be locked. \n"
        		+ "NEWS is written on it, and above that a number 3.");
        room[0].setWestText("West wall - A empty shelf, seems like you the money in your hand\n"
        		+ " could have been the money on this shelf, it also has revealed a number 7.");
        
       // room[1].setName("Office Room");
       // room[1].setDescription("You are in the office room. you walk towards a computer, the commands you can work with are:\n"
        	//	+ "n - Press north to view the ceiling\n"
        	//	+ "s - Press south to view the keyboard\n"
        	//	+ "e - Press East to view the east wall\n"
        	//	+ "w - Press West to view the west wall");
        
        room[1].setName("Office Room");
        room[1].setDescription("You are in the office room. you walk towards a computer the commands you can work with are:\n"
        		+ "n - Press north to view the ceiling\n"
        		+ "s - Press south to view the keyboard\n"
        		+ "e - Press East to view the east wall\n"
        		+ "w - Press West to view the west wall");
      room[1].setNorthText("Ceiling - you see the ceiling and notice that there are many cameras around, it feels like you are being watched\n"
      		+ " you can hear your heart beat fast");
        room[1].setSouthText("Keyboard  - There is a keyboard that is connected to the computer that has a lockscreen of the grim reaper");
        room[1].setEastText("East Cubicle Wall - There are many post its around you, you start to think that this person is a packrat. \n"
        		+ "the phrase written in bold is avengers56766@ ");
        room[1].setWestText("West Cubicle Wall - There are many post its around you, you start to think that this person is a packrat. \n"
        		+ "the phrase written in bold is Scythe@354 "); 

        
        room[2].setName("Computer Room");
        room[2].setDescription("You are in the computer room.\"Solve the riddle on the computer screen to access the key to exit the room. Commands are:\n"
        		+ "n - Press North to view the north window\n"
        		+ "s - Press South to view the south printer\n"
        		+ "e - Press East to view the secretary desk\n"
        		+ "w - Press West to view the west door\n");
        room[2].setNorthText("North Window - You see the window and notice a post-it saying \n FEED ME AND I LIVE");
        room[2].setSouthText("South Printer - There is a printed out paper that says \n GIVE ME SOMETHING TO DRINK AND I’LL DIE");
        room[2].setEastText("East Secretary Desk - There is an open document on the computer that says \n HINT: I START WITH THE LETTER F");
        room[2].setWestText("West Door - written on the wall is \n SOLVE THIS RIDDLE ON COMPUTER");
        
        room[3].setName("Mail Room");
        room[3].setDescription("You are in your mail room.\"Find the table with two envelopes on it \n"
        		+ " and choose one to see which has they key for you to escape. Commands are:\n"
        		+ "n - Press North to view the north wall\n"
        		+ "s - Press South to view the south Wall\n"
        		+ "e - Press East to view the east wall\n"
        		+ "w - Press West to view the west wall");
      room[3].setNorthText("A wall with the copy machine. You see a sign on top of the copy machine of Uncle Sam \n"
        		+  " that says Uncle Sam wants you to escape! You start to get worried now,\n"
        		+ " wondering if you can make it out or not.");
        room[3].setEastText("A wall with shelves with papers in there for employees. \n"
        		+ "You don’t see a paper that reads sometimes it best not to be right.");
        room[3].setSouthText("A wall with boxes and packages piled up on the side. \n"
        		+ "A paper reads move these boxes to the left room.");
        room[3].setWestText("A wall with a table that has two envelopes sitting on top of it.");
        room[4].setName("Lobby");
        room[4].setDescription("You are in your lobby! You can now escape successfully without getting caught.\n"
        		+ "n - Press North to leaving using the bank exit.\n"
        		+ "s - Press South to go to the door that leads to the vault\n"
        		+ "e - Press East to view the windows on the wall\n"
        		+ "w - Press West to view the west wall\n");
        room[4].setNorthText("Door that leads you back outside.");
        room[4].setSouthText("On the other hand, the police aren't here yet... \n"
        		+ "This is the door that will lead you back to the vault.\n"
        		+ "Was there any money that you missed and could have taken?"
);
        room[4].setEastText("You see a wall with windows... Doesn't seem like the police is here yet though.\n "
        		+ "It feels like it's been hours and you wonder to yourself if they will ever come"
);
        room[4].setWestText("A blank wall... You're trying to clear your thoughts on what you should do.\n "
        		+ "What will you do with all this money? Should you go back to steal some more?\n "
        		+ "Your heart is beating from all the adrenaline and you need to make your next decision fast."
);
    }
    public void escaping()
    {
    	System.out.println("Demonstration for rooms");
    }

    public static void print(Room[] room, int x) {

        System.out.println(room[x].getDescription());
        System.out.println();
    }


    
    //writes the room[x] n/s/e/w wall text
    private static int count2 = 2;
    public static boolean writeNorth(Room[] room, int x) {  	
    	System.out.println(room[x].getNorthText(room, x));
    	if (x == 2) { 

    		System.out.println("Would you like to enter your answer to the riddle as a password on the computer screen?\n"
				+ "y or n? :");
    		String input = Input.getInput();
    		if (input.equals("y")) {
    			System.out.println("Enter answer to riddle: ");
    			input = Input.getInput();
    				if (input.equals("fire") || input.equals("Fire")) {
    						System.out.println("CORRECT! You made it to the next room");
    						System.out.println(room[3].getDescription());
    						return true;
    				}
    				else {
    					if (count == 0) {
    						System.out.println("You hear a noise on the loudspeaker: \n"
    								+ "The chances limit has been reached, the police has been called and you are \n"
    								+ "traped you until help arrives. Game Over.");
    						System.exit(0);
    					}
    					System.out.println("Incorrect password. Attempts left: " + count);
    					Rooms.print(room, x);
    					count--;
    					return false;
    				}
	    	}
	    	else {
	    		Rooms.print(room, x);
	    		return false;
	    	}

    	}    
    
    	if (x == 4) {
		
		System.out.println("Do you want to leave?\n" + "y or n? :");
		String input = Input.getInput();
		if (input.equals("y")) {
			System.out.println("You leave with the money in your hand. As you're walking away, you see all the police arriving. Good thing you chose to leave.");
			System.out.println("Congrats! You won!");
			System.exit(0);
			return true;
			}
			else {
				System.out.println("You decide to head back towards to the vault to see if you can get more money.\n"
						+ "Suddenly, you hear the police officers barge in to the bank and they find you.\n"
						+ "You messed up and should have left. You've been pushed to the floor by the police and you lose most of your mobility...\n"
						+ "Game Over."
);
					System.exit(0);
				}
				return false;
			}
    	
		return false;  
    }
    	 	
    private static int count1 = 2; 
    public static boolean writeSouth(Room[] room, int x) {
    	
    	System.out.println(room[x].getSouthText(room, x));

    	if (x == 1) {
    		
    				System.out.println("The lock screen indicates he likes death. You start sweating and you \n"
    				+ "have a feeling that one of the post its is the answer to the password,\n"
    				+ " do you want to enter the password?\n"
    				+ "y or n? :");
    		String input = Input.getInput();
    		if (input.equals("y")) {
    			System.out.println("Enter pw: ");
    			input = Input.getInput();
    			if (input.equals("Scythe@354")) {
    				System.out.println("CORRECT! You made it to the next room");
    				System.out.println(room[2].getDescription());
    				return true;
    			}
    			else {
    				if (count == 0) {
    					System.out.println("You hear a noise on the loudspeaker: \n"
								+ "The chances limit has been reached, the police has been called and you are \n"
								+ "traped you until help arrives. Game Over.");
    					System.exit(0);
    				}
    				System.out.println("Incorrect password. Attempts left: " + count);
    				Rooms.print(room, x);
    				count--;
    				return false;
    			}
    		}
    		else {
    			Rooms.print(room, x);
    			return false;
    		}
    		
    	}
    	return false;
    }
	

    
    private static int count = 3;
    public static boolean writeEast(Room[] room, int x) {
    	
    	System.out.println(room[x].getEastText(room, x));
    	
    	if (x == 0) {
    		
    		System.out.println("would you like to enter a password?\n"
    				+ "y or n? :");
    		String input = Input.getInput();
    		if (input.equals("y")) {
    			System.out.println("Enter password: ");
    			input = Input.getInput();
    			if (input.equals("4376")) {
    				System.out.println("CORRECT! You made it out of the vault.");
    				System.out.println(room[1].getDescription());
    				return true;
    			}
    			else {
    				if (count == 0) {
    					System.out.println("You hear a noise on the loudspeaker: \n"
								+ "The chances limit has been reached, the police has been called and you are \n"
								+ "traped you until help arrives. Game Over.");
    					System.exit(0);
    				}
    				System.out.println("Incorrect password. Attempts left: " + count);
    				Rooms.print(room, x);
    				count--;
    				return false;
    			}
    		}
    		else {
    			Rooms.print(room, x);
    			return false;
    		}
    		
    	}
    	return false;
    }
	private static int count3 = 0;
    public static boolean writeWest(Room[] room, int x) {
    	System.out.println(room[x].getWestText(room, x));
    		
    		if (x == 3) {
    		
    		System.out.println("would you like to choose an envelope?\n"
    				+ "y or n? :");
    		String input = Input.getInput();
    		if (input.equals("y")) {
    			System.out.println("Choose envelope: left or right? ");
    			input = Input.getInput();
    			if (input.equals("left")) {
    				System.out.println("CORRECT! You can go to the lobby.");
    				System.out.println(room[4].getDescription());
    				return true;
    			}
    			else {
    				if (count == 0) {
    					System.out.println("CORRECT! You chose the correct envelope! You have the key to escape!");
    					System.exit(0);
    				}
    				System.out.println("Wrong envelope! You do not have any other chances"
    						+ " the police has been called. Game Over.");
    				count--;
    				return false;
    			}
    		}
    		else {
    			Rooms.print(room, x);
    			return false;
    		}
    		
    	}
    	return false;
    }	
		
}



class Room {

    private int number;
    private String name;
    private String description;
    private String northText;
    private String southText;
    private String eastText;
    private String westText;

    public Room(int number, String name, String description,
            ArrayList<String> items) {
    }

    public int getNumber() {
        return this.number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }

    //text for north walls
    public void setNorthText(String northText) {
    	this.northText = northText;
    }
    
    public String getNorthText(Room[] room, int x) {
    	return this.northText;
    }
    
    //text for south walls
    public void setSouthText(String southText) {
    	this.southText = southText;
    }
    
    public String getSouthText(Room[] room, int x) {
    	return this.southText;
    }
    
    //text for east walls
    public void setEastText(String eastText) {
    	this.eastText = eastText;
    }
    
    public String getEastText(Room[] room, int x) {
    	return this.eastText;
    }
    
    //text for west walls
    public void setWestText(String westText) {
    	this.westText = westText;
    }
    
    public String getWestText(Room[] room, int x) {
    	return this.westText;
    }
}

   