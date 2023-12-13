package Exercise;

import java.util.ArrayList;

public class FootballTeam {

    private ArrayList<String> roster = new ArrayList<>();

    public void addPlayer(String name, String position, int jerseyNumber) {
        String playerInfo = name + " - " + position + " - " + jerseyNumber;
        roster.add(playerInfo);
        System.out.println("Player added to the roster: " + playerInfo);
    }

    public void removePlayer(String name) {
        boolean removed = false;
        for (int i = 0; i < roster.size(); i++) {
            String playerInfo = roster.get(i);
            if (playerInfo.startsWith(name + " -")) {
                roster.remove(i);
                removed = true;
                System.out.println("Player removed: " + playerInfo);
                break;
            }
        }
        if (!removed) {
            System.out.println("Player not found: " + name);
        }
    }

    public void displayRoster() {
        System.out.println("Football Team Roster:");
        for (String playerInfo : roster) {
            System.out.println(playerInfo);
        }
    }

    public static void main(String[] args) {
        FootballTeam team = new FootballTeam();

        team.addPlayer("John Doe", "Quarterback", 12);
        team.addPlayer("Jane Smith", "Defender", 23);
        team.addPlayer("Bob Johnson", "Midfielder", 8);

        team.displayRoster();

        System.out.println("Removing player: John Doe");
        team.removePlayer("John Doe");

        team.displayRoster();
    }
}

