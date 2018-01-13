package GoldenPoint;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.*;

public class GoldenPointGame {
	
	double G = 0;
	public JFrame jf;
	public JLabel jl,s1,s2,s3,s4,s5,s6,s7,s8,s9,s10,s11,s12,s13,s14,s15;
	public JLabel jlScore,jlText,Gis, GPoint;
	public JPanel jpLabel,jpText,GPanel;
	public JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15;
	public JButton jb,reset;
	
	public GoldenPointGame()
	{
		jf = new JFrame("黄金点游戏");
		jl = new JLabel("请输入0-100之间的有理数(不包括0或100)",JLabel.CENTER);
		Gis = new JLabel("G点：");
		GPoint = new JLabel("0");
		GPanel = new JPanel();
		jpLabel = new JPanel();
		jpText = new JPanel();
		jb = new JButton("计算");
		reset = new JButton("重置");
		jlScore = new JLabel("分数：",JLabel.CENTER);
		jlText = new JLabel("输入：",JLabel.CENTER);
		jl.setFont(new   java.awt.Font("Dialog",   1,   20));
	
	        
		jf.getContentPane().setLayout(new GridLayout(5,0));
		jf.add(jl);
		jf.add(GPanel);
		jf.add(jpLabel);
		jf.add(jpText);
		jf.add(jb);
		
		GPanel.add(Gis);
		GPanel.add(GPoint);
		GPanel.add(reset);
		Gis.setFont(new   java.awt.Font("Dialog",   1,   15));
	
		jpText.setLayout(new GridLayout(0,16));
		t1 = new JTextField();
		t2 = new JTextField();
		t3 = new JTextField();
		t4 = new JTextField();
		t5 = new JTextField();
		t6 = new JTextField();
		t7 = new JTextField();
		t8 = new JTextField();
		t9 = new JTextField();
		t10 = new JTextField();
		t11 = new JTextField();
		t12 = new JTextField();
		t13 = new JTextField();
		t14 = new JTextField();
		t15 = new JTextField();
		
		jpText.add(jlText);
		jpText.add(t1);
		jpText.add(t2);
		jpText.add(t3);
		jpText.add(t4);
		jpText.add(t5);
		jpText.add(t6);
		jpText.add(t7);
		jpText.add(t8);
		jpText.add(t9);
		jpText.add(t10);
		jpText.add(t11);
		jpText.add(t12);
		jpText.add(t13);
		jpText.add(t14);
		jpText.add(t15);
		
		jpLabel.setLayout(new GridLayout(0,16));
		s1 = new JLabel("0",JLabel.CENTER);
		s2 = new JLabel("0",JLabel.CENTER);
		s3 = new JLabel("0",JLabel.CENTER);
		s4 = new JLabel("0",JLabel.CENTER);
		s5 = new JLabel("0",JLabel.CENTER);
		s6 = new JLabel("0",JLabel.CENTER);
		s7 = new JLabel("0",JLabel.CENTER);
		s8 = new JLabel("0",JLabel.CENTER);
		s9 = new JLabel("0",JLabel.CENTER);
		s10 = new JLabel("0",JLabel.CENTER);
		s11 = new JLabel("0",JLabel.CENTER);
		s12 = new JLabel("0",JLabel.CENTER);
		s13 = new JLabel("0",JLabel.CENTER);
		s14 = new JLabel("0",JLabel.CENTER);
		s15 = new JLabel("0",JLabel.CENTER);

		jpLabel.add(jlScore);
		jpLabel.add(s1);
		jpLabel.add(s2);
		jpLabel.add(s3);
		jpLabel.add(s4);
		jpLabel.add(s5);
		jpLabel.add(s6);
		jpLabel.add(s7);
		jpLabel.add(s8);
		jpLabel.add(s9);
		jpLabel.add(s10);
		jpLabel.add(s11);
		jpLabel.add(s12);
		jpLabel.add(s13);
		jpLabel.add(s14);
		jpLabel.add(s15);
		
		
		jb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double[] txs = new Double[15];
				
				if(t1.getText().trim().length() == 0
						||t2.getText().trim().length() == 0
						||t3.getText().trim().length() == 0
						||t4.getText().trim().length() == 0
						||t5.getText().trim().length() == 0
						||t6.getText().trim().length() == 0
						||t7.getText().trim().length() == 0
						||t8.getText().trim().length() == 0
						||t9.getText().trim().length() == 0
						||t10.getText().trim().length() == 0
						||t11.getText().trim().length() == 0
						||t12.getText().trim().length() == 0
						||t13.getText().trim().length() == 0
						||t14.getText().trim().length() == 0
						||t15.getText().trim().length() == 0)
				{
					JOptionPane.showMessageDialog(null, "未完全输入！");
					return;
				}
				
				if(!isNumeric(t1.getText())
						||!isNumeric(t2.getText())
						||!isNumeric(t3.getText())
						||!isNumeric(t4.getText())
						||!isNumeric(t5.getText())
						||!isNumeric(t6.getText())
						||!isNumeric(t7.getText())
						||!isNumeric(t8.getText())
						||!isNumeric(t9.getText())
						||!isNumeric(t10.getText())
						||!isNumeric(t11.getText())
						||!isNumeric(t12.getText())
						||!isNumeric(t13.getText())
						||!isNumeric(t14.getText())
						||!isNumeric(t15.getText())
						)
				{
					JOptionPane.showMessageDialog(null, "请输入数字！");
					return;
				}
				
				
				txs[0] = Double.parseDouble(t1.getText());
				txs[1] = Double.parseDouble(t2.getText());
				txs[2] = Double.parseDouble(t3.getText());
				txs[3] = Double.parseDouble(t4.getText());
				txs[4] = Double.parseDouble(t5.getText());
				txs[5] = Double.parseDouble(t6.getText());
				txs[6] = Double.parseDouble(t7.getText());
				txs[7] = Double.parseDouble(t8.getText());
				txs[8] = Double.parseDouble(t9.getText());
				txs[9] = Double.parseDouble(t10.getText());
				txs[10] = Double.parseDouble(t11.getText());
				txs[11] = Double.parseDouble(t12.getText());
				txs[12] = Double.parseDouble(t13.getText());
				txs[13] = Double.parseDouble(t14.getText());
				txs[14] = Double.parseDouble(t15.getText());
				
				double sum = 0,ave;
				for (int i = 0 ; i < txs.length ; i++)
				{
					sum += txs[i];
					if (txs[i] >= 100 || txs[i] <= 1)
					{
						JOptionPane.showMessageDialog(null,"请输入0-100之间的有理数(不包括0或100)");
						return;
					}
				}
				ave = sum/15;
				G = ave * 0.618;
				
				double closed = 100;
				double far = 0;
				int idClosed = 0,idFar = 0;
				for (int i = 0 ; i < txs.length ; i++)
				{
					double temp;
					temp = Math.abs( G - txs[i]); 
					if (temp < closed) 
					{
						closed = temp;
						idClosed = i;
					}
					if (temp > far)
					{
						far = temp;
						idFar = i;
					}
				}
				
				GPoint.setText(String.valueOf(G));
				double[] scores = new double[15];
				
				scores[0] = Double.parseDouble(s1.getText());
				scores[1] = Double.parseDouble(s2.getText());
				scores[2] = Double.parseDouble(s3.getText());
				scores[3] = Double.parseDouble(s4.getText());
				scores[4] = Double.parseDouble(s5.getText());
				scores[5] = Double.parseDouble(s6.getText());
				scores[6] = Double.parseDouble(s7.getText());
				scores[7] = Double.parseDouble(s8.getText());
				scores[8] = Double.parseDouble(s9.getText());
				scores[9] = Double.parseDouble(s10.getText());
				scores[10] = Double.parseDouble(s11.getText());
				scores[11] = Double.parseDouble(s12.getText());
				scores[12] = Double.parseDouble(s13.getText());
				scores[13] = Double.parseDouble(s14.getText());
				scores[14] = Double.parseDouble(s15.getText());
				
				scores[idClosed] += 15; 
				scores[idFar] -= 2;
				
				s1.setText(String.valueOf(scores[0]));
				s2.setText(String.valueOf(scores[1]));
				s3.setText(String.valueOf(scores[2]));
				s4.setText(String.valueOf(scores[3]));
				s5.setText(String.valueOf(scores[4]));
				s6.setText(String.valueOf(scores[5]));
				s7.setText(String.valueOf(scores[6]));
				s8.setText(String.valueOf(scores[7]));
				s9.setText(String.valueOf(scores[8]));
				s10.setText(String.valueOf(scores[9]));
				s11.setText(String.valueOf(scores[10]));
				s12.setText(String.valueOf(scores[11]));
				s13.setText(String.valueOf(scores[12]));
				s14.setText(String.valueOf(scores[13]));
				s15.setText(String.valueOf(scores[14]));
				
				t1.setText("");
				t2.setText("");
				t3.setText("");
				t4.setText("");
				t5.setText("");
				t6.setText("");
				t7.setText("");
				t8.setText("");
				t9.setText("");
				t10.setText("");
				t11.setText("");
				t12.setText("");
				t13.setText("");
				t14.setText("");
				t15.setText("");
				
			}
		});
		
		reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				GPoint.setText(String.valueOf(0));
				
			
				s1.setText(String.valueOf(0));
				s2.setText(String.valueOf(0));
				s3.setText(String.valueOf(0));
				s4.setText(String.valueOf(0));
				s5.setText(String.valueOf(0));
				s6.setText(String.valueOf(0));
				s7.setText(String.valueOf(0));
				s8.setText(String.valueOf(0));
				s9.setText(String.valueOf(0));
				s10.setText(String.valueOf(0));
				s11.setText(String.valueOf(0));
				s12.setText(String.valueOf(0));
				s13.setText(String.valueOf(0));
				s14.setText(String.valueOf(0));
				s15.setText(String.valueOf(0));
				
				
				
			}
		});
		
		jf.setSize(700, 250);
		jf.setVisible(true);
				
	}
	
	public static void main(String args[]) {
		new GoldenPointGame();
}
	public boolean isNumeric(String str){ 
		   Pattern pattern = Pattern.compile("[0-9]*"); 
		   Matcher isNum = pattern.matcher(str);
		   if( !isNum.matches() ){
		       return false; 
		   } 
		   return true; 
		}

}

