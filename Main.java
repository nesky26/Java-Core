package HW1;

import javax.lang.model.element.Name;

public class Main {
    public static void main(String[] args) {
        Team[] teamArray = new Team[4];
        teamArray[0] = new Team(1,"Anna",  23, 5);
        teamArray[1] = new Team(2,"Antony",  25, 6);
        teamArray[2] = new Team(3,"Katy",  20, 6);
        teamArray[3] = new Team(4,"Alexandro", 26, 10);
        System.out.println("Information about  members of the team:");
        for (int i = 0; i < 4; i++)
            {System.out.println(teamArray[i]);}

        Pool [] poolArray = new Pool[3];
        poolArray[0] = new Pool(15, 1);
        poolArray[1] = new Pool(24, 2);
        poolArray[2] = new Pool(36, 3);

        double[][] sumTime = new double[3][4];
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 4; j++){
            poolArray[i].getTimeToOvercomePool(teamArray[j]);
            sumTime[i][j] = poolArray[i].TimeToOvercomePool(teamArray[j]);;
            }}

        double minTime = 100;
        int k = 0;

        for (int i = 0; i < 4; i++){
        double time1 = sumTime[0][i] + sumTime[1][i] + sumTime[2][i];
        int a = i+1;
        System.out.println("Total time " + a + "-st member of the teams is " + time1 + " seconds");
            if (time1 < minTime) {
                minTime = time1;
                k = i+1;
            }
        }

        System.out.println(k +"-st member of the teams wins!!!");

        }

}
