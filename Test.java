import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws Exception {
        AttackFactory attackFactory = new AttackFactory();

        Scanner sc = new Scanner(System.in);
       

        System.out.println("Par quelle méthode voulez vous le cracker ? :");
        System.out.println("1: Force Brute !:");
        System.out.println("2: Dictionnary !:");

        int choix = sc.nextInt();

        switch (choix) {
            case 1:
                Attack bruteForce = attackFactory.getAttack("Force Brute");
                long debut = System.currentTimeMillis();
                bruteForce.pwdCrack();
                long fin = System.currentTimeMillis();
                System.out.println("Durée recherche: "+((fin-debut)/1000)+" s");
                break;
            case 2:
                Attack dictionnaire = attackFactory.getAttack("Dictionnaire");
                long debut2 = System.currentTimeMillis();
                dictionnaire.pwdCrack();
                long fin2 = System.currentTimeMillis();
                System.out.println("Durée recherche: "+((fin2-debut2)/1000)+" s");
                break;
            default:
                System.out.println("Choisissez 1 ou 2");
                break;
        }
        sc.close();
    }
}