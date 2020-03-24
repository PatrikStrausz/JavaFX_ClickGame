package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;

import java.util.Random;

public class Controller {


    private Field field;
    public Button btn0;
    public Button btn1;
    public Button btn2;
    public Button btn3;

    public Controller(){
    field = new Field();
    field.print();
    }


    public void initialize(){
        Tile[][] arr  = field.getArr();

        btn0.setText(String.valueOf(arr[0][0].getValue()));
        btn1.setText(String.valueOf(arr[0][1].getValue()));
        btn2.setText(String.valueOf(arr[1][0].getValue()));
        btn3.setText(String.valueOf(arr[1][1].getValue()));
    }

    public void clickBtn0() {

        Tile[][] arr  = field.getArr();


        btn0.setText(String.valueOf(arr[0][0].getValue() - 1));
        if(Integer.parseInt(btn0.getText()) < 0){
            btn0.setText("0");
        }else {

            btn1.setText(String.valueOf(arr[0][1].getValue() + 1));
            btn2.setText(String.valueOf(arr[1][0].getValue() + 1));

            arr[0][0].setValue(Integer.parseInt(btn0.getText()));
            arr[0][1].setValue(Integer.parseInt(btn1.getText()));
            arr[1][0].setValue(Integer.parseInt(btn2.getText()));
        }
        field.print();




    }
    public void clickBtn1(){
        Tile[][] arr  = field.getArr();


            btn1.setText(String.valueOf(arr[0][1].getValue() - 1));
            if(Integer.parseInt(btn1.getText()) < 0){
                btn1.setText("0");
            }else {

                btn0.setText(String.valueOf(arr[0][0].getValue() + 1));
                btn3.setText(String.valueOf(arr[1][1].getValue() + 1));

                arr[0][1].setValue(Integer.parseInt(btn1.getText()));
                arr[0][0].setValue(Integer.parseInt(btn0.getText()));
                arr[1][1].setValue(Integer.parseInt(btn3.getText()));
            }
        field.print();



    }
    public void clickBtn2(){
        Tile[][] arr  = field.getArr();


        btn2.setText(String.valueOf(arr[1][0].getValue() - 1));
        if(Integer.parseInt(btn2.getText()) < 0){
            btn2.setText("0");
        }else {

            btn0.setText(String.valueOf(arr[0][0].getValue() + 1));
            btn3.setText(String.valueOf(arr[1][1].getValue() + 1));

            arr[1][0].setValue(Integer.parseInt(btn2.getText()));
            arr[0][0].setValue(Integer.parseInt(btn0.getText()));
            arr[1][1].setValue(Integer.parseInt(btn3.getText()));
        }
        field.print();
    }
    public void clickBtn3(){
        Tile[][] arr  = field.getArr();


        btn3.setText(String.valueOf(arr[1][1].getValue() - 1));
        if(Integer.parseInt(btn3.getText()) < 0){
            btn3.setText("0");


        }else {
            btn1.setText(String.valueOf(Integer.parseInt(btn1.getText()) + 1));
            btn2.setText(String.valueOf(arr[1][0].getValue() + 1));
            arr[0][1].setValue(Integer.parseInt(btn1.getText()));
            arr[1][0].setValue(Integer.parseInt(btn2.getText()));
            arr[1][1].setValue(Integer.parseInt(btn3.getText()));
        }
        field.print();


    }
}
