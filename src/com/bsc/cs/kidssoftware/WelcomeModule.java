package com.bsc.cs.kidssoftware;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;

public class WelcomeModule extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel cardPanel, welcome_jp, alphabets_jp, numbers_jp, colors_jp, wanimals_jp, danimals_jp, birds_jp, fruits_jp, vegetables_jp, flowers_jp, test_jp;
    private JButton alphabets_btn, colors_btn, numbers_btn, wanimals_btn, danimals_btn, birds_btn, fruits_btn, vegetables_btn, flowers_btn;
    private CardLayout cardLayout = new CardLayout();
    private JMenuBar menuBar;
    private JMenu mnFile;
    private JMenuItem mntmBack;
    private JMenuItem mntmNewMenuItem;
    private JMenu mnHelp;
    private JMenuItem mntmNewMenuItem_1;
    private JMenuItem mntmNewMenuItem_2;
    private JMenuItem mntmNewMenuItem_3;
    private JMenuItem mntmNewMenuItem_4;
    

    public WelcomeModule() {
        cardPanel = new JPanel();
        cardPanel.setLayout(cardLayout);
        
        JLabel label = new JLabel("Kid's Learning Software");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setForeground(Color.BLUE);
        label.setFont(new Font("Times New Roman", Font.PLAIN, 34));
        
        setTitle("Kid's Learning Software");

        setSize(752, 496);
        
        menuBar = new JMenuBar();
        menuBar.setBackground(new Color(255, 222, 173));
        setJMenuBar(menuBar);
        
        mnFile = new JMenu("File");
        menuBar.add(mnFile);
        
        mntmBack = new JMenuItem("Home");
        mntmBack.setPreferredSize(new Dimension(120, 22));
        mntmBack.setHorizontalAlignment(SwingConstants.LEFT);
        mnFile.add(mntmBack);
        
        mntmNewMenuItem_4 = new JMenuItem("Take the test!");
        mnFile.add(mntmNewMenuItem_4);
        
        mntmNewMenuItem = new JMenuItem("Exit");
        mnFile.add(mntmNewMenuItem);
        
        mnHelp = new JMenu("Help");
        menuBar.add(mnHelp);
        
        mntmNewMenuItem_1 = new JMenuItem("Documentation");
        mntmNewMenuItem_1.setPreferredSize(new Dimension(120, 22));
        mnHelp.add(mntmNewMenuItem_1);
        
        mntmNewMenuItem_2 = new JMenuItem("About");
        mntmNewMenuItem_2.setPreferredSize(new Dimension(120, 22));
        mnHelp.add(mntmNewMenuItem_2);
        
        mntmNewMenuItem_3 = new JMenuItem("Credits");
        mntmNewMenuItem_3.setPreferredSize(new Dimension(120, 22));
        mnHelp.add(mntmNewMenuItem_3);
        
        welcome_jp = new JPanel();
        welcome_jp.setBackground(new Color(147, 112, 219));
        cardPanel.add(welcome_jp, "1");
        
        alphabets_jp = new JPanel();
        alphabets_jp.setBackground(new Color(147, 112, 219));
        alphabets_jp.setName("Alphabets");
        
        numbers_jp = new JPanel();
        numbers_jp.setBackground(new Color(147, 112, 219));
        numbers_jp.setName("Numbers");
        
        colors_jp = new JPanel();
        colors_jp.setBackground(new Color(147, 112, 219));
        colors_jp.setName("Colors");
        
        wanimals_jp = new JPanel();
        wanimals_jp.setBackground(new Color(147, 112, 219));
        wanimals_jp.setName("WildAnimals");
        
        danimals_jp = new JPanel();
        danimals_jp.setBackground(new Color(147, 112, 219));
        danimals_jp.setName("DomesticAnimals");
        
        birds_jp = new JPanel();
        birds_jp.setBackground(new Color(147, 112, 219));
        birds_jp.setName("Birds");
        
        fruits_jp = new JPanel();
        fruits_jp.setBackground(new Color(147, 112, 219));
        fruits_jp.setName("Fruits");
        
        vegetables_jp = new JPanel();
        vegetables_jp.setBackground(new Color(147, 112, 219));
        vegetables_jp.setName("Vegetables");
        
        flowers_jp = new JPanel();
        flowers_jp.setBackground(new Color(147, 112, 219));
        flowers_jp.setName("Flowers");        
        
        test_jp = new JPanel();
        test_jp.setBackground(new Color(147, 112, 219));
        test_jp.setName("Short Test");
        
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
        			.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
        				.addComponent(danimals_btn, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        				.addComponent(colors_btn, GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        				.addComponent(vegetables_btn, GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE))
        			.addPreferredGap(ComponentPlacement.RELATED, 133, Short.MAX_VALUE)
        			.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
        				.addComponent(numbers_btn, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
        				.addComponent(birds_btn, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
        				.addComponent(flowers_btn, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE))
        			.addGap(81))
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
        
        
        numbers_btn.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardPanel, "3");
            }
        });        
        new Numbers(numbers_jp);
        cardPanel.add(numbers_jp, "3");
        
        
        colors_btn.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardPanel, "4");
            }
        }); 
        new Colors(colors_jp);
        cardPanel.add(colors_jp, "4");
      
        
        birds_btn.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardPanel, "5");
            }
        });
        new Birds(birds_jp);
        cardPanel.add(birds_jp, "5");
        
        
        wanimals_btn.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardPanel, "6");
            }
        });
        new WildAnimals(wanimals_jp);
        cardPanel.add(wanimals_jp, "6");
        
        
        danimals_btn.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardPanel, "7");
            }
        });
        new DomesticAnimals(danimals_jp);
        cardPanel.add(danimals_jp, "7");
        
        fruits_btn.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardPanel, "8");
            }
        });
        new Fruits(fruits_jp);
        cardPanel.add(fruits_jp, "8");
        
        vegetables_btn.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardPanel, "9");
            }
        });
        new Vegetables(vegetables_jp);
        cardPanel.add(vegetables_jp, "9");
        
        flowers_btn.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardPanel, "10");
            }
        });
        new Flowers(flowers_jp);
        cardPanel.add(flowers_jp, "10");
        
        mntmBack.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
            	
            	for(Component c : cardPanel.getComponents()) {
                	
                		if(c.isVisible()) {
                			if(((JPanel) c).getName() == "Alphabets")
                				Alphabets.clip.stop();
                			else if(((JPanel) c).getName() == "Numbers")
                				Numbers.clip.stop();
                			else if(((JPanel) c).getName() == "Birds")
                				Birds.clip.stop();
                			else if(((JPanel) c).getName() == "WildAnimals")
                				WildAnimals.clip.stop();
                			else if(((JPanel) c).getName() == "DomesticAnimals")
                				DomesticAnimals.clip.stop();
                			else if(((JPanel) c).getName() == "Fruits")
                				Fruits.clip.stop();	
                			else if(((JPanel) c).getName() == "Vegetables")
                				Vegetables.clip.stop();	
                			else if(((JPanel) c).getName() == "Flowers")
                				Flowers.clip.stop();
                			else if(((JPanel) c).getName() == "Colors")
                				Colors.clip.stop();
                		}
                		
                }
                cardLayout.show(cardPanel, "1");       
            }

        });
        
        mntmNewMenuItem_4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				cardLayout.show(cardPanel, "11");
				
			}
		});
        new Test(test_jp);
        cardPanel.add(test_jp, "11");
        
        mntmNewMenuItem.addActionListener(new ActionListener() {
        	@Override
        	public void actionPerformed(ActionEvent ae) {
        		int option;
        		option = JOptionPane.showConfirmDialog(rootPane, "Are you sure?");
        		if(option == 0)
        			System.exit(0);
        		else if(option == 1){
                	for(Component c : cardPanel.getComponents()) {
                    	
                		if(c.isVisible()) {
                			if(((JPanel) c).getName() == "Alphabets")
                				Alphabets.clip.stop();
                			else if(((JPanel) c).getName() == "Numbers")
                				Numbers.clip.stop();
                			else if(((JPanel) c).getName() == "Birds")
                				Birds.clip.stop();
                			else if(((JPanel) c).getName() == "WildAnimals")
                				WildAnimals.clip.stop();
                			else if(((JPanel) c).getName() == "DomesticAnimals")
                				DomesticAnimals.clip.stop();
                			else if(((JPanel) c).getName() == "Fruits")
                				Fruits.clip.stop();	
                			else if(((JPanel) c).getName() == "Vegetables")
                				Vegetables.clip.stop();	
                			else if(((JPanel) c).getName() == "Flowers")
                				Flowers.clip.stop();
                			else if(((JPanel) c).getName() == "Colors")
                				Colors.clip.stop();
                		}
                		
                }
                cardLayout.show(cardPanel, "1");  
        		}
        			
        	}
        });
                 
        getContentPane().add(cardPanel, BorderLayout.CENTER);
        
        mntmNewMenuItem_1.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent ae) {
            	try{
            		
            		if(Desktop.isDesktopSupported())
            			Desktop.getDesktop().browse(new URI("http://www.example.com"));
            	}
            	catch(Exception e){
            		e.printStackTrace();
            	}
            	
            }
        });
        
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
