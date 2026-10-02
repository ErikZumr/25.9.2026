package org.example;

public class Sachovnice {
    static void main(){

        Tower[] towers = new Tower[2];
        Horse[] horses = new Horse[2];
        Bishop[] bishops = new Bishop[2];

        towers[0] = new Tower();
        towers[1] = new Tower();

        towers[0].rada = 1;
        towers[0].sloupec = 'a';
        towers[1].rada = 1;
        towers[1].sloupec ='h';
        for (int i = 0; i<=1;i++){
            System.out.println(towers[i]);
        }
        horses[0] = new Horse(1,'b');
        horses[1] = new Horse(1,'g');

        Horse[] horses2 = {
                new Horse(1,'b'),
                new Horse(1, 'g')};
        Bishop[0] = new Bishop(1,'3');

    }


}
