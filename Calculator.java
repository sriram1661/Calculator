import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator {
    //flags
    static int dec_flag = 0;
    static int sign_count = 0;
    static int add_flag = 0;
    static int sub_flag = 0;
    static int mul_flag = 0;
    static int div_flag = 0;
    static int mod_flag = 0;
    static int op_dec = 0;

    static double a,b;
    static String ans = "";

    //Function for addition operation
    public static String add(Double a, Double b)
    {
        Double sum;
        sum = a + b;
        if(dec_flag==1 || op_dec==1)
        {
            op_dec = 0;
            return ""+Double.toString(sum);
        }
        else
        {
            int temp = sum.intValue();
            return ""+Integer.toString(temp);
        }
    }
    //Function for subtraction operation
    public static String sub(Double a, Double b)
    {
        Double sub;
        sub = a - b;
        if(dec_flag==1 || op_dec==1)
        {
            op_dec = 0;
            return ""+Double.toString(sub);
        }
        else
        {
            int temp = sub.intValue();
            return ""+Integer.toString(temp);
        }
    }
    //Function for multiplication operation
    public static String mul(Double a, Double b)
    {
        Double mul;
        mul = a * b;
        if(dec_flag==1 || op_dec==1)
        {
            op_dec = 0;
            return ""+Double.toString(mul);
        }
        else
        {
            int temp = mul.intValue();
            return ""+Integer.toString(temp);
        }
    }
    //Function for division operation
    public static String div(Double a, Double b)
    {
        Double div;
        div = a / b;
        op_dec = 1;
        return ""+Double.toString(div);
    }
    //Function for modulo operation
    public static String mod(Double a, Double b)
    {
        Double mod;
        mod = a % b;
        int temp = mod.intValue();
        return ""+Integer.toString(temp);
    }

    public static void main(String[] args)
    {
        JFrame fr = new JFrame("Calculator");
        
        //Creating JLabel1
        JLabel jl1 = new JLabel("0",JLabel.RIGHT);
        jl1.setBounds(50,50,250,150);
        jl1.setFont(jl1.getFont().deriveFont(30.0f));
        jl1.setForeground(Color.GREEN);

        JLabel jl2 = new JLabel("",JLabel.RIGHT);
        jl2.setBounds(50,10,250,150);
        jl2.setFont(jl2.getFont().deriveFont(15.0f));
        jl2.setForeground(Color.BLACK);

        //Creating JPanel
        JPanel jp = new JPanel();
        jp.setBounds(0,160,327,332);
        jp.setBackground(Color.GRAY);
        jp.setLayout(new GridLayout(5,4));

        //Creating number buttons
        JButton b7 = new JButton("7");
        JButton b8 = new JButton("8");
        JButton b9 = new JButton("9");
        JButton b4 = new JButton("4");
        JButton b5 = new JButton("5");
        JButton b6 = new JButton("6");
        JButton b1 = new JButton("1");
        JButton b2 = new JButton("2");
        JButton b3 = new JButton("3");
        JButton b0 = new JButton("0");


        //Creating operator buttons
        JButton add = new JButton("+");
        JButton sub = new JButton("-");
        JButton mul = new JButton("x");
        JButton div = new JButton("÷");
        JButton mod = new JButton("%");
        JButton pn = new JButton("+/-");
        JButton dec = new JButton(".");
        JButton eqto = new JButton("=");


        //Creating extra buttons
        JButton clear = new JButton("CLEAR");
        clear.setBackground(Color.RED);
        JButton erase = new JButton("C");

        //Setting colors for buttons
        add.setBackground(Color.LIGHT_GRAY);
        sub.setBackground(Color.LIGHT_GRAY);
        mul.setBackground(Color.LIGHT_GRAY);
        div.setBackground(Color.LIGHT_GRAY);
        mod.setBackground(Color.LIGHT_GRAY);
        eqto.setBackground(Color.CYAN);
        b0.setBackground(Color.WHITE);
        b1.setBackground(Color.WHITE);
        b2.setBackground(Color.WHITE);
        b3.setBackground(Color.WHITE);
        b4.setBackground(Color.WHITE);
        b5.setBackground(Color.WHITE);
        b6.setBackground(Color.WHITE);
        b7.setBackground(Color.WHITE);
        b8.setBackground(Color.WHITE);
        b9.setBackground(Color.WHITE);
        
        //Adding action listeners to number buttons
        b7.addActionListener(new ActionListener(){  
        public void actionPerformed(ActionEvent e){
            if(jl1.getText().equals("0"))
            {
                jl1.setText("");
            }
                        jl1.setText(jl1.getText()+b7.getText());  
                    }  
        });  
        b8.addActionListener(new ActionListener(){  
        public void actionPerformed(ActionEvent e){
            if(jl1.getText().equals("0"))
            {
                jl1.setText("");
            } 
                        jl1.setText(jl1.getText()+b8.getText());  
            }  
        });
        b9.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){
                if(jl1.getText().equals("0"))
                {
                    jl1.setText("");
                } 
                            jl1.setText(jl1.getText()+b9.getText());  
                }  
            });
        b4.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){
                    if(jl1.getText().equals("0"))
                    {
                        jl1.setText("");
                    } 
                                jl1.setText(jl1.getText()+b4.getText());  
                    }  
                });
        b5.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){
                    if(jl1.getText().equals("0"))
                    {
                        jl1.setText("");
                    } 
                                jl1.setText(jl1.getText()+b5.getText());  
                    }  
                });
        b6.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){
                    if(jl1.getText().equals("0"))
                    {
                        jl1.setText("");
                    } 
                                jl1.setText(jl1.getText()+b6.getText());  
                    }  
                });
        b1.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){
                    if(jl1.getText().equals("0"))
                    {
                        jl1.setText("");
                    } 
                                jl1.setText(jl1.getText()+b1.getText());  
                    }  
                });
        b2.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){
                    if(jl1.getText().equals("0"))
                    {
                        jl1.setText("");
                    } 
                                jl1.setText(jl1.getText()+b2.getText());  
                    }  
                });
        b3.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){
                    if(jl1.getText().equals("0"))
                    {
                        jl1.setText("");
                    } 
                                jl1.setText(jl1.getText()+b3.getText());  
                    }  
                });
        b0.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){
                    if(jl1.getText().equals("0"))
                    {
                        jl1.setText("");
                    } 
                                jl1.setText(jl1.getText()+b0.getText());  
                    }  
                });

        //ActionListeners for clear buttons
        erase.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){
                                jl1.setText("0");
                                jl2.setText("");
                                dec_flag = 0;
                                add_flag = 0;
                                sub_flag = 0;
                                mul_flag = 0;
                                div_flag = 0;
                                mod_flag = 0;
                    }  
                });
        clear.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String str = jl1.getText();
                int len = str.length();
                if(len==1)
                {
                    if(str.equals("."))
                    {
                        dec_flag = 0;
                    }
                    jl1.setText("0");
                }
                else
                {
                    jl1.setText(str.substring(0, len-1));
                    if(str.substring(len-1).equals("."))
                    {
                        dec_flag = 0;
                    }
                }
            }
        });

        //Action Listener for point button 
        dec.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                if(dec_flag==0)
                {
                    jl1.setText(jl1.getText()+".");
                    dec_flag = 1;
                } 
            }
        });

        //ActionListener for pn button
        pn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                if(sign_count==0 && jl1.getText()!="0")
                {
                    jl1.setText("-"+jl1.getText());
                }
                else
                {
                    jl1.setText(jl1.getText().substring(2));
                    sign_count = 0;
                }
            }
        });

        //ActionListener for operator buttons
        add.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                if(add_flag==0)
                {
                    if(dec_flag==1)
                    {
                        dec_flag = 0;
                    }
                    a = Double.parseDouble(jl1.getText());
                    add_flag = 1;
                    jl2.setText(jl1.getText()+"+");
                    jl1.setText("");
                }
            }
        });
        sub.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                if(sub_flag==0)
                {
                    if(dec_flag==1)
                    {
                        dec_flag = 0;
                    }
                    a = Double.parseDouble(jl1.getText());
                    sub_flag = 1;
                    jl2.setText(jl1.getText()+"-");
                    jl1.setText("");
                }
            }
        });
        mul.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                if(mul_flag==0)
                {
                    if(dec_flag==1)
                    {
                        dec_flag = 0;
                    }
                    a = Double.parseDouble(jl1.getText());
                    mul_flag = 1;
                    jl2.setText(jl1.getText()+"x");
                    jl1.setText("");
                }
            }
        });
        div.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                if(div_flag==0)
                {
                    if(dec_flag==1)
                    {
                        dec_flag = 0;
                    }
                    a = Double.parseDouble(jl1.getText());
                    div_flag = 1;
                    jl2.setText(jl1.getText()+"÷");
                    jl1.setText("");
                }
            }
        });
        mod.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                if(add_flag==0)
                {
                    if(dec_flag==1)
                    {
                        dec_flag = 0;
                    }
                    a = Double.parseDouble(jl1.getText());
                    mod_flag = 1;
                    jl2.setText(jl1.getText()+"%");
                    jl1.setText("");
                }
            }
        });
        eqto.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                if(add_flag==1)
                {
                    b = Double.parseDouble(jl1.getText());
                    jl2.setText(jl2.getText()+jl1.getText());
                    ans = add(a,b);
                    add_flag = 0;
                    jl2.setText(jl2.getText()+"=");
                    jl1.setText(ans);
                }
                else if(sub_flag==1)
                {
                    b = Double.parseDouble(jl1.getText());
                    jl2.setText(jl2.getText()+jl1.getText());
                    ans = sub(a,b);
                    sub_flag = 0;
                    jl2.setText(jl2.getText()+"=");
                    jl1.setText(ans);
                }
                else if(mul_flag==1)
                {
                    b = Double.parseDouble(jl1.getText());
                    jl2.setText(jl2.getText()+jl1.getText());
                    ans = mul(a,b);
                    mul_flag = 0;
                    jl2.setText(jl2.getText()+"=");
                    jl1.setText(ans);
                }
                else if(div_flag==1)
                {
                    b = Double.parseDouble(jl1.getText());
                    jl2.setText(jl2.getText()+jl1.getText());
                    ans = div(a,b);
                    div_flag = 0;
                    jl2.setText(jl2.getText()+"=");
                    jl1.setText(ans);
                }
                else if(mod_flag==1)
                {
                    b = Double.parseDouble(jl1.getText());
                    jl2.setText(jl2.getText()+jl1.getText());
                    ans = mod(a,b);
                    mod_flag = 0;
                    jl2.setText(jl2.getText()+"=");
                    jl1.setText(ans);
                }
            }
        });

        //Components added to Frame
        fr.add(jp);
        fr.add(jl1);
        fr.add(jl2);
        fr.setSize(340,530);
        fr.setLayout(null);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);
        
        //Components added to Panel
        jp.add(mod);
        jp.add(div);
        jp.add(erase);
        jp.add(clear);
        jp.add(b7);
        jp.add(b8);
        jp.add(b9);
        jp.add(mul);
        jp.add(b4);
        jp.add(b5);
        jp.add(b6);
        jp.add(sub);
        jp.add(b1);
        jp.add(b2);
        jp.add(b3);
        jp.add(add);
        jp.add(pn);
        jp.add(b0);
        jp.add(dec);
        jp.add(eqto);
    }
}
