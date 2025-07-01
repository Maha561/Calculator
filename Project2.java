
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.awt.*;
class Simple extends Frame{
    // Creating a calculator
    Simple(){
        // lets set title
        setTitle("Caculator");
        // textField to display the input and output
        TextField display = new TextField();
        display.setBounds(100,100,340,50);

        // buttons for numbers 0 to 9 ;
        Button zero = new Button("0");
        zero.setBounds(100,360,80,50);
        zero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText()+"0");
            }
        });

        Button one = new Button("1");
        one.setBounds(100,300,80,50);
        one.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText()+"1");
            }
        });

        Button two = new Button("2");
        two.setBounds(190,300,80,50);
        two.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText()+"2");
            }
        });

        Button three = new Button("3");
        three.setBounds(280,300,80,50);
        three.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText()+"3");
            }
        });

        Button four = new Button("4");
        four.setBounds(100,240,80,50);
        four.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText()+"4");
            }
        });

        Button five = new Button("5");
        five.setBounds(190,240,80,50);
        five.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText()+"5");

            }
        });

        Button six = new Button("6");
        six.setBounds(280,240,80,50);
        six.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               display.setText(display.getText()+"6");
            }
        });

        Button seven = new Button("7");
        seven.setBounds(100,180,80,50);
        seven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText()+"7");
            }
        });

        Button eight = new Button("8");
        eight.setBounds(190,180,80,50);
        eight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText()+"8");
            }
        });

        Button nine = new Button("9");
        nine.setBounds(280,180,80,50);
        nine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText()+"9");
            }
        });

        // button for clear
        Button clear = new Button("C");
        clear.setBounds(280,360,80,50);
        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText("");
            }
        });

        // Button for operators
        Button plus = new Button("+");
        plus.setBounds(370,180,70,50);
        plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText()+"+");
            }
        });

        Button minus = new Button("-");
        minus.setBounds(370,240,70,50);
        minus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText()+"-");
            }
        });

        Button mulitplication = new Button("*");
        mulitplication.setBounds(370,300,70,50);
        mulitplication.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText()+"*");
            }
        });

        Button division = new Button("/");
        division.setBounds(370,360,70,50);
        division.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText()+"/");
            }
        });
        Button equalTo = new Button("=");
        equalTo.setBounds(190,360,80,50);
        equalTo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String expression = display.getText();
                char operator = ' ';

                // Finding operator
                if(expression.contains("+")){
                    operator='+';
                }
                else if(expression.contains("-")){
                    operator='-';
                }
                else if(expression.contains("*")){
                    operator='*';
                }
                else{
                    operator='/';
                }
                //splitting the string into 2 numbers to perform mathematical operation

                String[] parts = expression.split("\\"+operator);
                // coverting to int
                int a = Integer.parseInt(parts[0]);

                int b = Integer.parseInt(parts[1]);

                int result = 0;
                switch (operator){
                    case '+':{
                        result = a+b;
                        break;
                    }
                    case '-':{
                        result = a-b;
                        break;
                    }
                    case '*':{
                        result=a*b;
                        break;
                    }
                    case '/':{
                        result=a/b;
                        break;
                    }


                }
                // converting int into string
                display.setText(String.valueOf(result));

            }
        });



        add(zero);
        add(one);
        add(two);
        add(three);
        add(four);
        add(five);
        add(six);
        add(seven);
        add(eight);
        add(nine);
        add(clear);
        add(plus);
        add(minus);
        add(mulitplication);
        add(division);
        add(display);
        add(equalTo);

        setLayout(null);
        setVisible(true);
        setSize(700,900);


    }



    public static void main(String[] args) {

        new Simple();
    }

}

