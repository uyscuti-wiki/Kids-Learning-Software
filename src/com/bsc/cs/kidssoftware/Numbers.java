package com.bsc.cs.kidssoftware;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;


public class Numbers {
	
	private JButton[] numbers = new JButton[10];
	private JLabel label = new JLabel("Numbers");
	private String[] names = { "Zero - 0", "One - 1", "Two - 2", "Three - 3", "Four - 4", "Five - 5", "Six - 6", "Seven - 7", "Eight - 8", "Nine - 9"};
	protected static Clip clip;
	private Boolean clipCheck = false;
	private JLabel lblNewLabel_1 = new JLabel();
	
	public Numbers(JPanel numbers_jp){
		
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(Color.BLUE);
		label.setFont(new Font("Times New Roman", Font.PLAIN, 34));

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = new JButton(names[i]);
			numbers[i].setBorder(BorderFactory.createLineBorder(Color.black));
		}
		
		GroupLayout gl_panel_1 = new GroupLayout(numbers_jp);
		
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(60)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
							.addComponent(numbers[3], GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
							.addComponent(numbers[4], GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
							.addComponent(numbers[2], GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
							.addComponent(numbers[1], GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
							.addComponent(numbers[0], GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE))
					.addGap(41)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
					.addGap(41)
							.addComponent(numbers[8], GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
							.addComponent(numbers[7], GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
							.addComponent(numbers[6], GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
							.addComponent(numbers[5], GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
							.addComponent(numbers[9], GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(99, Short.MAX_VALUE)
				.addContainerGap(50, Short.MAX_VALUE))
				.addGroup(gl_panel_1.createSequentialGroup().addContainerGap(201, Short.MAX_VALUE)
						.addComponent(label)
						.addGap(325))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(20)
						.addComponent(label)
					.addContainerGap()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(numbers[0], GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
						.addComponent(numbers[5], GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
					.addGap(35)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(numbers[1], GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
						.addComponent(numbers[6], GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
					.addGap(36)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(numbers[2], GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
						.addComponent(numbers[7], GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
					.addGap(37)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(numbers[3], GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
						.addComponent(numbers[8], GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
					.addGap(37)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(numbers[4], GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
						.addComponent(numbers[9], GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(99, Short.MAX_VALUE))
		);
		numbers_jp.setLayout(gl_panel_1);
		
		for (int i = 0; i < numbers.length; i++) {
			
			final int n = i;
		
			numbers[i].addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent ae) {
					try {

						BufferedImage img = ImageIO.read(Numbers.class.getResource("/assets/" + n + ".jpg"));
						Image dimg = img.getScaledInstance(325, 350, Image.SCALE_SMOOTH);
						ImageIcon imageIcon = new ImageIcon(dimg);
						lblNewLabel_1.setIcon(imageIcon);
						gl_panel_1.setHorizontalGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_1.createSequentialGroup()
										.addGap(310)
										.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 325, GroupLayout.PREFERRED_SIZE)
										.addContainerGap(341, Short.MAX_VALUE))
						);
						gl_panel_1.setVerticalGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_1.createSequentialGroup()
										.addGap(75)
										.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 350, GroupLayout.PREFERRED_SIZE)
										.addContainerGap(150, Short.MAX_VALUE))
						);
						new Thread(new Runnable() {

						    public void run() {
						      try {
						    	if(clipCheck)
						    		clip.stop();
						        clip = AudioSystem.getClip();							        
						        AudioInputStream inputStream = AudioSystem.getAudioInputStream(Numbers.class.getResource("/assets/"+ n +".wav"));
						        clip.open(inputStream);
						        clip.start(); 
						        clipCheck = true;
						      } 
						      catch (Exception e) {
						        e.printStackTrace();
						      }
						    }
						  }).start();
			
						numbers_jp.setLayout(gl_panel_1);
					
					} 
					catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}
	}
}
