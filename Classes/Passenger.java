/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectgui;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import static projectgui.ProjectGUI.Flights;

/**
 *
 * @author POWER
 */
public class Passenger extends JFrame implements ActionListener {
   
    private double Price;
    private String MealPlan;
    int indexofuser=0;
    public ArrayList<String> type=new ArrayList<String>();
    
    
    JLabel l  = new JLabel("Welcome Passenger");
    JLabel label = new JLabel("Booking");
    JLabel label1 = new JLabel("From");
    JLabel label2 = new JLabel("Destination");
    JLabel label3 = new JLabel("Date");
    JLabel label5 = new JLabel("Seat Type");
    
//    Date date = new Date();
//    
//    SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
//    String stringDate  = format.format(date);
    
    JButton b,b1, b2, CustomersService;
    JPanel background = new JPanel();
    JComboBox from ;
    JComboBox to;
    ArrayList<String> fromflight=new ArrayList<>();
        ArrayList<String> toflight=new ArrayList<>();
        ArrayList<String> date=new ArrayList<>();
    JComboBox d = new JComboBox(new String[]{"","24/1/2022","14/2/2022","21/3/2022","1/4/2022","15/5/2022"});
    JComboBox Type = new JComboBox(new String[]{"", "Economy", "Bussiness", "Frist Class"});
public Passenger(int i) {
    this();
    indexofuser=i;
}
    public Passenger() {
        for(int i=0; i<Flights.size();i++){
            fromflight.add(Flights.get(i).Dfrom);
            toflight.add(Flights.get(i).Dto);

        }
        from = new JComboBox(fromflight.toArray());
        to = new JComboBox(toflight.toArray());
        DateFormat dateFormat = new SimpleDateFormat("dd MMM YYYY");
      JFormattedTextField today = new JFormattedTextField(dateFormat);
      today.setName("Today");
      today.setColumns(10);
      today.setEditable(false);
      JLabel todayLabel = new JLabel("Date:");
      todayLabel.setLabelFor(today);
      today.setValue(new Date());
        setSize(600, 400);
        setLayout(new GridBagLayout());
        setLocation(200, 200);

 CustomersService= new JButton("Customers Service");
        b = new JButton ("Print Report");
        b1 = new JButton("Book");//aw confirm
        b2 = new JButton("Cancel");
        l.setFont(new Font("Serif", Font.PLAIN, 30));
        label1.setFont(new Font("Serif", Font.PLAIN, 15));
        label2.setFont(new Font("Serif", Font.PLAIN, 15));
        label3.setFont(new Font("Serif", Font.PLAIN, 15));
        label5.setFont(new Font("Serif", Font.PLAIN, 15));
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.HORIZONTAL;
         c.gridx = -2;
        c.gridy = 0;
        add(l, c);
        c.gridx = 0;c.gridy = 3;
        add(label1, c);
        c.gridx = 1;c.gridy = 3;
        add(from, c);
        c.gridx = 0; c.gridy = 4;
        add(label2, c);
        c.gridx = 1; c.gridy = 4;
        add(to, c);
        c.gridx = 0;c.gridy = 5;
        add(label3, c);
        c.gridx = 1;c.gridy = 5;
        add(d, c);
        c.gridx = 0;c.gridy = 6;
        add(label5, c);
        c.gridx = 1;c.gridy = 6;
        add(Type, c);
        c.gridx = 0;c.gridy = 7;
        
       
        
    c.gridx=0;c.gridy=12; add(b1,c);
    c.gridx=1;c.gridy=12; add(b2,c);
    c.gridx=0; c.gridy=13; 
            add(CustomersService,c);
            

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        b1.addActionListener(this);
        b2.addActionListener(this);
        
     CustomersService.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
if(e.getSource().equals(CustomersService))
        {
            buttonclick cs=new buttonclick();
            cs.setVisible(true);
            dispose();
        } 
   else if(e.getSource().equals(b2))
        {
            Login l=new Login();
            l.setVisible(true);
            dispose();
        } 
   else if(e.getSource().equals(b1)){
       Flight f=new Flight();
       //f.FlightID="123";
       f.Dfrom=from.getSelectedItem().toString();
       f.Dto=to.getSelectedItem().toString();
       
       int indexOfChosenFlight=0,count=0;
       for(int i=0;i<Flights.size();i++){
           System.out.println(Flights.get(i).NoOfSeats);
           if(Flights.get(i).Dfrom.equals(f.Dfrom) && Flights.get(i).Dto.equals(f.Dto)){
               indexOfChosenFlight=i;
               count++;
               SeatGUI gui=new SeatGUI(indexOfChosenFlight,indexofuser);
       gui.setVisible(true);
       dispose();
           }
       }
       if(count==0){
                       JOptionPane.showMessageDialog(null, "No flights");

       }
       
       
   }
    
    
    }

}