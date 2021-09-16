package danbir;

public class Cricket extends Sports{
    String matchType;
    int over;
    Player player;
    Cricket(String matchType, int over, Player player){
        this.matchType = matchType;
        this.over = over;
        this.player = player;
    }
    void display()
    {
        System.out.println("The Match type : "+matchType);
        System.out.println("Over of the match : "+over);
        System.out.println("Name of the player : "+player.playerName);
        System.out.println("Jersey number of player : "+player.jerseyNumber);
    }
}
