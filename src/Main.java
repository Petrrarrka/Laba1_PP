import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static List<Droid> droids = new ArrayList();

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        createdDroids();
        while(selectAction());
    }

    private static boolean selectAction() throws IOException {
        System.out.println("1 - show list of droids");
        System.out.println("2 - start battle 1vs1");
        System.out.println("3 - start team battle");
        System.out.println("0 - exit");

        System.out.print("Select number of action: ");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int index = Integer.parseInt(bufferedReader.readLine());
        switch (index) {
            case 1:
                printDroids();
                break;
            case 2:
                battle1vs1();
                break;
            case 3:
                teamBattle();
                break;
            case 0:
                return true;
            default:
                System.out.println("Wrong action!!!");
        }
        return true;
    }

    private static void createdDroids() {
        Random rand = new Random();
        Droid droid1 = new AttackDroid("A1", rand.nextInt(80) + 30, rand.nextInt(10) + 1, rand.nextInt(20));
        Droid droid2 = new AttackDroid("A2", rand.nextInt(80) + 30, rand.nextInt(10) + 1, rand.nextInt(20));
        Droid droid3 = new AttackDroid("A3", rand.nextInt(80) + 30, rand.nextInt(10) + 1, rand.nextInt(20));
        Droid droid4 = new StealDroid("S1", rand.nextInt(80) + 20, rand.nextInt(10) + 1, rand.nextInt(80));
        Droid droid5 = new AttackDroid("B1", rand.nextInt(80) + 30, rand.nextInt(10) + 1, rand.nextInt(20));
        Droid droid6 = new AttackDroid("B2", rand.nextInt(80) + 30, rand.nextInt(10) + 1, rand.nextInt(20));
        Droid droid7 = new AttackDroid("B3", rand.nextInt(80) + 30, rand.nextInt(10) + 1, rand.nextInt(20));
        Droid droid8 = new StealDroid("S2", rand.nextInt(80) + 20, rand.nextInt(10) + 1, rand.nextInt(80));
        droids.add(droid1);
        droids.add(droid2);
        droids.add(droid3);
        droids.add(droid4);
        droids.add(droid5);
        droids.add(droid6);
        droids.add(droid7);
        droids.add(droid8);
    }

    public static void printDroids(){
        System.out.println();
        for (int i = 0; i <droids.size() ; i++) {
            System.out.println((i+1)+". "+droids.get(i));
        }
        System.out.println();
    }
    public static void battle1vs1(){
        Scanner scanner=new Scanner(System.in);
        List<Droid> droid1 = new ArrayList();
        List<Droid> droid2 = new ArrayList();
        System.out.println("Select first droid:");
        printDroids();
        droid1.add(droids.get(scanner.nextInt()-1));
        System.out.println("Select second droid:");
        printDroids();
        droid2.add(droids.get(scanner.nextInt()-1));
        DroidBattle oneXone = new DroidBattle(droid1, droid2);
        oneXone.teamFight();
    }
    public static void teamBattle(){
        Scanner scanner=new Scanner(System.in);
        List<Droid> team=new ArrayList();
        List<Droid> droid2=new ArrayList();
        int id;
        System.out.println("Select droids for first team (0-end): ");
        printDroids();
        while (true){
            id=scanner.nextInt();
            if(id>0)
                team.add(droids.get(id-1));
            else
                break;
        }
        System.out.println("Select droids for second team (0-end): ");
        printDroids();
        while (true){

            id=scanner.nextInt();
            if(id>0)
                droid2.add(droids.get(id-1));
            else
                break;
        }
        DroidBattle battleofteams = new DroidBattle(team, droid2);
        battleofteams.teamFight();
    }
}