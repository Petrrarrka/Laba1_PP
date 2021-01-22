import java.util.List;
import java.util.Random;

public class DroidBattle {
    private final List<Droid> team1;
    private final List<Droid> team2;
    private List<Droid> assaulterTeam;
    private List<Droid> targetTeam;
    public DroidBattle(List<Droid> team1, List<Droid> team2) {
        this.team1 = team1;
        this.team2 = team2;
    }


    public void teamFight() {
        if(checkTeams()){
            int round = 1;
            do{
                System.out.println("\nRound " + round++);

                pickAttackerTeam();
                for(Droid attacker : assaulterTeam){
                    if (!isTeamAlive(targetTeam)){
                        break;
                    }
                    else {
                        attacker.attack(pickTargetInTeam(targetTeam));
                    }
                    removeDroids();
                }

                System.out.println(assaulterTeam.toString());
                System.out.println(targetTeam.toString());


            } while (isTeamAlive(targetTeam));
            System.out.println(team1.contains(assaulterTeam)?"team1 win":"team2 win");

        }
    }


    private boolean checkTeams(){
        return team1.size()== team2.size();
    }
    private void pickAttackerTeam(){
        if(new Random().nextBoolean()){
            assaulterTeam= team1;
            targetTeam= team2;
        }
        else{
            targetTeam= team1;
            assaulterTeam= team2;
        }
    }
    private boolean isTeamAlive(List<Droid> team1){
        for(Droid droid:team1){
            if(droid.isAlive())
                return true;
        }
        return false;
    }
    private Droid pickTargetInTeam(List<Droid> target1){
        return target1.get(new Random().nextInt(target1.size()));
    }
    private void removeDroids(){
        targetTeam.removeIf(droid -> !droid.isAlive());
    }
}