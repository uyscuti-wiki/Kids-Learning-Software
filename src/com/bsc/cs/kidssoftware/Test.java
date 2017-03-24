package com.bsc.cs.kidssoftware;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JRadioButton;
import javax.swing.LayoutStyle.ComponentPlacement;

public class Test {
	
	JRadioButton r_Button[] = new JRadioButton[4];
	final ButtonGroup rGroup = new ButtonGroup();
	JLabel lblNewLabel;
	private JLabel lblNewLabel_1 = new JLabel();
	JButton btnNewButton, btnNext, btnEndTest;
	JProgressBar progressBar;
	List<String> lines;
	List<Integer> randomfileint_history;
	
	public Test(JPanel test_jp){
		
		for(int i = 0 ; i < 4; i++){
			
			r_Button[i] = new JRadioButton();
			r_Button[i].setBackground(new Color(147, 112, 219));
			rGroup.add(r_Button[i]);
			
		}
			
		
		lblNewLabel = new JLabel("Choose the correct answer:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		
		btnNewButton = new JButton("Hint");
		btnNext = new JButton("Next");
		btnEndTest = new JButton("End test");
		
		progressBar = new JProgressBar();
		progressBar.setMaximum(10);
		progressBar.setForeground(Color.GREEN);
		

		GroupLayout gl_panel_1 = new GroupLayout(test_jp);
		gl_panel_1.setHorizontalGroup(
				gl_panel_1.createParallelGroup(Alignment.LEADING)
					.addGroup(Alignment.TRAILING, gl_panel_1.createSequentialGroup()
						.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_panel_1.createSequentialGroup()
								.addGap(87)
								.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
									.addComponent(r_Button[3])
									.addComponent(r_Button[2])
									.addComponent(r_Button[1])
									.addComponent(r_Button[0])
									.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 318, GroupLayout.PREFERRED_SIZE)))
							.addGroup(gl_panel_1.createSequentialGroup()
								.addGap(52)
								.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 151, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
								.addComponent(btnEndTest, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE)
								.addGap(94)))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING, false)
							.addComponent(progressBar, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(btnNext, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE))
						.addGap(46))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(340)
							.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 325, GroupLayout.PREFERRED_SIZE)
							.addContainerGap(341, Short.MAX_VALUE))
			);
			gl_panel_1.setVerticalGroup(
				gl_panel_1.createParallelGroup(Alignment.TRAILING)
					.addGroup(Alignment.LEADING, gl_panel_1.createSequentialGroup()
						.addGap(78)
						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
						.addGap(60)
						.addComponent(r_Button[0])
						.addGap(18)
						.addComponent(r_Button[1])
						.addGap(18)
						.addComponent(r_Button[2])
						.addGap(18)
						.addComponent(r_Button[3])
						.addGap(60)
						.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
							.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
							.addComponent(btnNext, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
							.addComponent(btnEndTest, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(progressBar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(40)
							.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 350, GroupLayout.PREFERRED_SIZE)
							.addContainerGap(150, Short.MAX_VALUE))
			);
		
		test_jp.setLayout(gl_panel_1);

		File dir = new File("assets/");
		File[] files = dir.listFiles();
		
		Random r = new Random();
		int randomfileint = 2 * r.nextInt(files.length / 2);
		randomfileint_history = new ArrayList<>();
		randomfileint_history.add(randomfileint);
		while(randomfileint_history.contains(randomfileint))
				randomfileint = 2 * r.nextInt(files.length / 2);
		File file = files[randomfileint];
		File file2;
		if(file.getName().contains(".jpg"))
			file2 = files[randomfileint+1];
		else
			file2 = files[randomfileint-1];
		
		int index = file.getName().indexOf(".");
		String filename = file.getName().substring(0, index);
		System.out.println("Answer:"+file.getName());
		try{
		BufferedImage img = ImageIO.read(Numbers.class.getResource("/assets/"+file.getName()));
		Image dimg = img.getScaledInstance(300, 250, Image.SCALE_SMOOTH);
		ImageIcon imageIcon = new ImageIcon(dimg);
		lblNewLabel_1.setIcon(imageIcon);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		boolean check = false;
		for(int j = 0; j < 26; j++){
			
			if(filename.equals(Alphabets.alp_names[j])){
				
				lines = new ArrayList<String>();
				lines.add(filename);
				int k = 0;
				while(k < 3){
					
					int r_alph = r.nextInt(Alphabets.alp_names.length);
					
					if(lines.contains(Alphabets.alp_names[r_alph]));
					
					else{
						
						lines.add(Alphabets.alp_names[r_alph]);
						k++;
					}
				}
				Collections.shuffle(lines);
				for(k=0; k < 4; k++){
					r_Button[k].setText(lines.get(k));
					System.out.println(lines.get(k));
				}
				check = true;
				break;
			}
		}
		if (filename.equals("0") || filename.equals("1") || filename.equals("2") || filename.equals("3") || filename.equals("4") || filename.equals("5") || filename.equals("6") || filename.equals("7") || filename.equals("8")
					|| filename.equals("9") && !check) {
				
				lines = new ArrayList<String>();
				
				int num = Integer.parseInt(filename);
				
				switch(num){
				
				case 1: lines.add("One - 1");
					break;
				case 2: lines.add("Two - 2");
					break;
				case 3: lines.add("Three - 3");
					break;
				case 4: lines.add("Four - 4");
					break;
				case 5: lines.add("Five - 5");
					break;
				case 6: lines.add("Six - 6");
					break;
				case 7: lines.add("Seven - 7");
					break;
				case 8: lines.add("Eight - 8");
					break;
				case 9: lines.add("Nine - 9");
					break;
				case 0: lines.add("Zero - 0");
					break;

				}
				
				int k = 0;
				while(k < 3){
					int r_num = r.nextInt(Numbers.num_names.length);
					
					if(lines.contains(Numbers.num_names[r_num].substring((Numbers.num_names[r_num].indexOf("-"))+1)));
					else {
						
						switch(r_num){
						
						case 1: lines.add("One - 1");
							break;
						case 2: lines.add("Two - 2");
							break;
						case 3: lines.add("Three - 3");
							break;
						case 4: lines.add("Four - 4");
							break;
						case 5: lines.add("Five - 5");
							break;
						case 6: lines.add("Six - 6");
							break;
						case 7: lines.add("Seven - 7");
							break;
						case 8: lines.add("Eight - 8");
							break;
						case 9: lines.add("Nine - 9");
							break;
						case 0: lines.add("Zero - 0");
							break;
		
						}
						k++;
					}
				}
				Collections.shuffle(lines);
				for(k=0; k < 4; k++){
					r_Button[k].setText(lines.get(k));
					System.out.println(lines.get(k));
				}
				check = true;
			}
		if(!check){
			
			for(int j = 0; j < 6; j++){
				
				if(filename.equals(Colors.col_names[j])){
				
					lines = new ArrayList<String>();
					lines.add(filename);
					int k = 0;
					while(k < 3){
					
						int r_col = r.nextInt(Colors.col_names.length);
					
						if(lines.contains(Colors.col_names[r_col]));
					
						else{
						
							lines.add(Colors.col_names[r_col]);
							k++;
						}
					}
					Collections.shuffle(lines);
					for(k=0; k < 4; k++){
						r_Button[k].setText(lines.get(k));
						System.out.println(lines.get(k));
					}
					break;
				}
				else if(filename.equals(Birds.bir_names[j])){
				
					lines = new ArrayList<String>();
					lines.add(filename);
					int k = 0;
					while(k < 3){
					
					int r_bir = r.nextInt(Birds.bir_names.length);
					
					if(lines.contains(Birds.bir_names[r_bir]));
					
					else{
						
						lines.add(Birds.bir_names[r_bir]);
						k++;
					}
				}
					Collections.shuffle(lines);
					for(k=0; k < 4; k++){
						r_Button[k].setText(lines.get(k));
						System.out.println(lines.get(k));
					}
					break;
				}
				else if(filename.equals(WildAnimals.wil_names[j])){
					
					lines = new ArrayList<String>();
					lines.add(filename);
					int k = 0;
					while(k < 3){
					
					int r_wil = r.nextInt(WildAnimals.wil_names.length);
					
					if(lines.contains(WildAnimals.wil_names[r_wil]));
					
					else{
						
						lines.add(WildAnimals.wil_names[r_wil]);
						k++;
					}
				}
					Collections.shuffle(lines);
					for(k=0; k < 4; k++){
						r_Button[k].setText(lines.get(k));
						System.out.println(lines.get(k));
					}
					break;
				}
				else if(filename.equals(DomesticAnimals.dom_names[j])){
					
					lines = new ArrayList<String>();
					lines.add(filename);
					int k = 0;
					while(k < 3){
					
					int r_dom = r.nextInt(DomesticAnimals.dom_names.length);
					
					if(lines.contains(DomesticAnimals.dom_names[r_dom]));
					
					else{
						
						lines.add(DomesticAnimals.dom_names[r_dom]);
						k++;
					}
				}
					Collections.shuffle(lines);
					for(k=0; k < 4; k++){
						r_Button[k].setText(lines.get(k));
						System.out.println(lines.get(k));
					}
					break;
				}
				else if(filename.equals(Vegetables.veg_names[j])){
					
					lines = new ArrayList<String>();
					lines.add(filename);
					int k = 0;
					while(k < 3){
					
					int r_veg = r.nextInt(Vegetables.veg_names.length);
					
					if(lines.contains(Vegetables.veg_names[r_veg]));
					
					else{
						
						lines.add(Vegetables.veg_names[r_veg]);
						k++;
					}
				}
					Collections.shuffle(lines);
					for(k=0; k < 4; k++){
						r_Button[k].setText(lines.get(k));
						System.out.println(lines.get(k));
					}
					break;
				}
				else if(filename.equals(Flowers.flo_names[j])){
					
					lines = new ArrayList<String>();
					lines.add(filename);
					int k = 0;
					while(k < 3){
					
					int r_flo = r.nextInt(Flowers.flo_names.length);
					
					if(lines.contains(Flowers.flo_names[r_flo]));
					
					else{
						
						lines.add(Flowers.flo_names[r_flo]);
						k++;
					}
				}
					Collections.shuffle(lines);
					for(k=0; k < 4; k++){
						r_Button[k].setText(lines.get(k));
						System.out.println(lines.get(k));
					}
					break;
				}
				else if(filename.equals(Fruits.fru_names[j])){
					
					lines = new ArrayList<String>();
					lines.add(filename);
					int k = 0;
					while(k < 3){
					
					int r_fru = r.nextInt(Fruits.fru_names.length);
					
					if(lines.contains(Fruits.fru_names[r_fru]));
					
					else{
						
						lines.add(Fruits.fru_names[r_fru]);
						k++;
					}
				}
					Collections.shuffle(lines);
					for(k=0; k < 4; k++){
						r_Button[k].setText(lines.get(k));
						System.out.println(lines.get(k));
					}
					break;
				}
			}
			}
	}
}
