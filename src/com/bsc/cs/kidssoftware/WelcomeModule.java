package com.bsc.cs.kidssoftware;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;

public class WelcomeModule extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel cardPanel, welcome_jp, alphabets_jp, numbers_jp, colors_jp, wanimals_jp, danimals_jp, birds_jp, fruits_jp, vegetables_jp, flowers_jp;
    private JButton alphabets_btn, colors_btn, numbers_btn, wanimals_btn, danimals_btn, birds_btn, fruits_btn, vegetables_btn, flowers_btn;
    private CardLayout cardLayout = new CardLayout();
    private JMenuBar menuBar;
    private JLabel lblNewLabel;
    

    public WelcomeModule() {
        cardPanel = new JPanel();
        cardPanel.setLayout(cardLayout);
        
        JLabel label = new JLabel("Kid's Learning Software");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setForeground(Color.BLUE);
        label.setFont(new Font("Times New Roman", Font.PLAIN, 34));
        
        setTitle("Kid's Learning Software");
        setSize(752, 496);

        welcome_jp = new JPanel();
        alphabets_jp = new JPanel();
        numbers_jp = new JPanel();
        colors_jp = new JPanel();
        wanimals_jp = new JPanel();
        danimals_jp = new JPanel();
        birds_jp = new JPanel();
        fruits_jp = new JPanel();
        vegetables_jp = new JPanel();
        flowers_jp = new JPanel();
        
        cardPanel.add(welcome_jp, "1");
        
        alphabets_btn = new JButton("Alphabets");
        colors_btn = new JButton("Colors");
        numbers_btn = new JButton("Numbers");
        wanimals_btn = new JButton("Wild Animals");
        
        danimals_btn = new JButton("Domestic Animals");
        danimals_btn.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        
        birds_btn = new JButton("Birds");
        fruits_btn = new JButton("Fruits");
        vegetables_btn = new JButton("Vegetables");
        flowers_btn = new JButton("Flowers");
        
        GroupLayout gl_panel = new GroupLayout(welcome_jp);
        gl_panel.setHorizontalGroup(
        	gl_panel.createParallelGroup(Alignment.TRAILING)
        		.addGroup(gl_panel.createSequentialGroup()
        			.addGap(62)
        			.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
        				.addComponent(alphabets_btn, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
        				.addComponent(wanimals_btn, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
        				.addComponent(fruits_btn, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE))
        			.addGap(130)
        			.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
        				.addComponent(danimals_btn, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        				.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
        					.addComponent(colors_btn, GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        					.addComponent(vegetables_btn, GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)))
        			.addPreferredGap(ComponentPlacement.RELATED, 149, Short.MAX_VALUE)
        			.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
        				.addComponent(numbers_btn, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
        				.addComponent(birds_btn, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
        				.addComponent(flowers_btn, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE))
        			.addContainerGap(65, Short.MAX_VALUE))
        		.addGroup(gl_panel.createSequentialGroup()
        			.addContainerGap(214, Short.MAX_VALUE)
        			.addComponent(label)
        			.addGap(193))
        );
        gl_panel.setVerticalGroup(
        	gl_panel.createParallelGroup(Alignment.LEADING)
        		.addGroup(gl_panel.createSequentialGroup()
        			.addGap(30)
        			.addComponent(label)
        			.addGap(53)
        			.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
        				.addComponent(alphabets_btn, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
        				.addComponent(colors_btn, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
        				.addComponent(numbers_btn, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
        			.addGap(53)
        			.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
        				.addComponent(wanimals_btn, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
        				.addComponent(danimals_btn, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
        				.addComponent(birds_btn, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
        			.addGap(53)
        			.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
        				.addComponent(fruits_btn, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
        				.addComponent(vegetables_btn, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
        				.addComponent(flowers_btn, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
        			.addContainerGap(72, Short.MAX_VALUE))
        );
        
        welcome_jp.setLayout(gl_panel);
        
        alphabets_btn.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardPanel, "2");
            }
        });
        
        new Alphabets(alphabets_jp);
        cardPanel.add(alphabets_jp, "2");
       
             
        getContentPane().add(cardPanel, BorderLayout.CENTER);
        
        menuBar = new JMenuBar();
        setJMenuBar(menuBar);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
            	WelcomeModule frame = new WelcomeModule();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
                frame.setResizable(false);
            }
        });
    }
}
