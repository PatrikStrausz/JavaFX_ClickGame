package sample;

import java.util.Random;

public class Field {

    private Tile[][] arr ;

    public Field(){
       initField();
    }

    public Tile[][] getArr() {
        return arr;
    }

    public void setArr(Tile[][] arr) {
        this.arr = arr;
    }

    private void initField() {
        Random rnd = new Random();
        arr = new Tile[2][2];
        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i< arr.length; i++) {
                arr[j][i] = new Tile();
                arr[j][i].setValue(rnd.nextInt(6)+5);

            }

        }

    }

    public void print() {
        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[j][i].getValue() + " " );

            }
            System.out.println();
        }
        System.out.println();

    }


}