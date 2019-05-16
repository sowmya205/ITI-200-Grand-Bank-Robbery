//Name this : TextAdventure

package bv;

public class Main {

    public static void main(String args[]) {

        // Build rooms
        Room[] room = new Room[6];
        Rooms.build(room, 6);
        int x = 0;       		;
        Rooms.print(room, x);

        // Start game
        boolean playing = true;
        while (playing) {

            String input = Input.getInput();

            //look commands
            if (input.equals("n")) {
                    if ((Rooms.writeNorth(room, x))) {
                    	x++;
                    }        
            } else if (input.equals("s")) {
                    if ((Rooms.writeSouth(room, x))) {
                    	x++;
                    }
                   
            } else if (input.equals("e")) {
                    if (Rooms.writeEast(room, x)) {
                    	x++;
                    }
            } else if (input.equals("w")) {
                if (Rooms.writeWest(room, x)) {
                	x++;
                }
            }
            

            // Quit commands
            else if (input.equals("quit")) {
                System.out.println("ending game... Goodbye!");
                playing = false;

            // Catch-all for invalid input
            } else {
                System.out.println("Invalid try again");
            }
        }
        System.exit(0);
    }
}



