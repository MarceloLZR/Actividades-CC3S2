
/*
public class FootballTeam {

    public FootballTeam(int gamesWon) {
    }
    public int getGamesWon() {
        //return 0;
        return 3;
    }
}

 */
//PRUEBA PARAMETRIZADA
/*
public class FootballTeam {
    private int gamesWon;

    public FootballTeam(int nbOfGamesWon) {
        this.gamesWon = nbOfGamesWon;
    }

    public int getGamesWon() {
        return gamesWon;
    }
}
 */
public class FootballTeam {
    private int gamesWon;
    public FootballTeam(int gamesWon){
        if(gamesWon < 0){
            throw new IllegalArgumentException( "Not posible to have less than 0 games won");

        }
        this.gamesWon= gamesWon;


    }
    public int getGamesWon(){
        return gamesWon;
    }

}