package Array.TCSExplore;

import java.util.Scanner;

class Sim {
    int id;
    String company;
    int balance;
    double ratePerSecond;
    String circle;

    public Sim(int id, String company, int balance, double ratePerSecond, String circle) {
        this.id = id;
        this.company = company;
        this.balance = balance;
        this.ratePerSecond = ratePerSecond;
        this.circle = circle;
    }

    public int getid() {
        return id;
    }

    public String getcompany() {
        return company;
    }

    public int getbalance() {
        return balance;
    }

    public double getratePerSecond() {
        return ratePerSecond;
    }

    public String getcircle() {
        return circle;
    }

}

class Solution_one {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Sim[] simarr = new Sim[2];

        for (int i = 0; i < 2; i++) {

            simarr[i] = new Sim(sc.nextInt(), sc.next(), sc.nextInt(), sc.nextDouble(), sc.next());
        }

        String search_circle = sc.next();

        Double search_rate = sc.nextDouble();

        sc.nextLine();
        sc.close();

        System.out.println(matchAndSort(simarr, search_circle, search_rate)[0]);

        // for (Sim sim : matchAndSort(simarr, search_circle, search_rate)) {
        // System.out.println(sim.id);
        // }

    }

    static Sim[] matchAndSort(Sim[] simarr, String search_circle, double search_rate) {

        Sim[] newsimArr = new Sim[simarr.length];
        int index = 0;
        for (Sim sim : simarr) {
            if (search_circle == sim.circle && search_rate > sim.ratePerSecond) {
                newsimArr[index++] = sim;
            }
        }

        return newsimArr;
    }
}