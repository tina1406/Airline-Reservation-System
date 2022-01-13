package projectgui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.ImageObserver;
import java.io.IOException;
import java.text.AttributedCharacterIterator;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import static projectgui.ProjectGUI.Flights;
import static projectgui.ProjectGUI.users;
import static projectgui.ProjectGUI.tickets;

//import static projectgui.Passenger.

/**
 *
 * @author Lenovo
 */
public class SeatGUI extends JFrame implements ActionListener {
    int count = 0;
    public int capacity = 70;
    JPanel panel;
    ArrayList<JButton> buttons;
    JLabel letter[] = new JLabel[8];
    //static ArrayList<Seat> seatstaken = new ArrayList<>();
    ArrayList<Seats> Temporaryseats = new ArrayList<>();
int flightindex;
    JButton btn, cancel;
int indexofuser=0;
    public SeatGUI(int flightindex,int indexofuser) {
        this.indexofuser= indexofuser;
        System.out.println(users.get(indexofuser).getFName());
        this.flightindex=flightindex;
        setSize(800, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        //*******************************************************************
        //title's Font arranaging
        Font font = new Font("SanSerif", Font.BOLD, 23);
        Font sub = new Font("SanSerif", Font.ITALIC, 20);
        Font text = new Font("Ariel",Font.PLAIN,16);
        //*******************************************************************
        // right panel map seat
        buttons = new ArrayList<>();
        panel = new JPanel();
        JLabel select = new JLabel("Select seat");
        select.setBounds(400, 20, 250, 100);
        select.setFont(font);
        int count=Integer.parseInt(Flights.get(flightindex).NoOfSeats)  ;     
                add(select);
        panel.setSize(400, 600);
        panel.setLocation(380, 100);
        panel.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 10));
        for (int i = 0; i < count; i++) {
            buttons.add(new JButton(i + 1 + ""));
            buttons.get(i).setPreferredSize(new Dimension(50, 30));
            for (int j = 0; j < Flights.get(flightindex).seatsreserved.size(); j++) {
                if (buttons.get(i).getActionCommand().equals(Flights.get(flightindex).seatsreserved.get(j).seatID)) {
                    buttons.get(i).setEnabled(false);
                   
                }
            }
            panel.add(buttons.get(i));
            buttons.get(i).addActionListener(new action());
        }
        add(panel);
        //*******************************************************************
        // top left panel from -> to text fields and combobox
        JPanel Destination = new JPanel();
        JLabel d = new JLabel("Depart");
        d.setBounds(40, 20, 250, 100);
        d.setFont(font);
        add(d);
        Destination.setSize(500, 100);
        Destination.setLocation(40, 120);
        JLabel f, t;
        Destination.setLayout(null);
        f = new JLabel("From:");
        f.setSize(70, 20);
        f.setFont(sub);
        f.setLocation(0, 30);
        Destination.add(f);
        JLabel from = new JLabel(Flights.get(flightindex).Dfrom +"");
        from.setBounds(80, 30, 100, 20);
        from.setFont(text);
        t = new JLabel("To:");
        t.setSize(40, 20);
        t.setLocation(150, 30);
        t.setFont(sub);
        Destination.add(t);
        JLabel to = new JLabel(Flights.get(flightindex).Dto +"");
        to.setBounds(200, 30, 100, 20);
        to.setFont(text);
        Destination.add(from);
        Destination.add(to);
        add(Destination);
        Destination.setVisible(true);
        //*******************************************************************
        // booking and canceling panel
        JLabel b = new JLabel("Booking");
        b.setBounds(40, 200, 250, 100);
        b.setFont(font);
        add(b);
        JPanel booking = new JPanel();
        booking.setBounds(20, 300, 500, 100);
        booking.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 30));
        btn = new JButton("Book");
        btn.setSize(250, 100);
        booking.add(btn);
        btn.addActionListener(this);
        cancel = new JButton("Cancel");
        cancel.setSize(250, 100);
        booking.add(cancel);
        booking.setVisible(true);
        add(booking);
        //*******************************************************************

        JLabel s = new JLabel("Summary");
        s.setBounds(40, 400, 250, 100);
        s.setFont(font);
        add(s);  
       
        JPanel summary = new JPanel();
        JLabel booked = new JLabel("Booked");
        JLabel available = new JLabel("Available");
        summary.setLayout(new FlowLayout(FlowLayout.LEFT, 60, 20));
        summary.setBounds(0, 475, 250, 100);
        booked.setSize(125, 50);
        available.setSize(125, 50);
        booked.setFont(sub);
        available.setFont(sub);
        JLabel taken =  new JLabel(Flights.get(flightindex).seatsreserved.size()+"");
        
        taken.setSize(125, 50);
        summary.add(booked);
        summary.add(available);
        summary.add(taken);
        add(summary);
        summary.setVisible(true);
       
        //*******************************************************************
        //setVisible(true);
    }

    SeatGUI() {
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btn) {
            for (int i = 0; i < Temporaryseats.size(); i++) {
                Flights.get(flightindex).seatsreserved.add(Temporaryseats.get(i));
                try {
                    Flight.writetofile();

                } catch (IOException ex) {
                    Logger.getLogger(SeatGUI.class.getName()).log(Level.SEVERE, null, ex);
                }                      
            }  
            Ticket ticket=new Ticket();
            ticket.setFromTo(Flights.get(flightindex));
            ticket.user=users.get(indexofuser);
        }else {if (e.getSource() == cancel)
        {

        }      
        }
    }

    private class action implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            ((JButton) e.getSource()).setEnabled(false);
            Temporaryseats.add(new Seats(e.getActionCommand()));

        }

    }

}