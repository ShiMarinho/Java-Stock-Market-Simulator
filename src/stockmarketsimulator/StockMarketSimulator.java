package stockmarketsimulator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import GUI.CompaniesGUI;
import GUI.investorsG;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.SystemColor;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import javax.swing.DropMode;

public class StockMarketSimulator extends JFrame implements ActionListener{

	
	public static void main(String[] args) {
		SetUp sU = new SetUp();
		new StockMarketSimulator();
		sU.CreateCompanies();
		

	}
	
	public StockMarketSimulator() {
				
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(this.getClass().getResource("/stock_market.jpeg")));
		lblNewLabel.setBounds(2, 119, 588, 428);
		getContentPane().add(lblNewLabel);
		
		JTextPane txtpnStockMarketSimulator = new JTextPane();
		txtpnStockMarketSimulator.setFont(new Font("Tsukushi A Round Gothic", Font.BOLD, 22));
		txtpnStockMarketSimulator.setForeground(Color.WHITE);
		txtpnStockMarketSimulator.setText("\t\t\t\t\t\t\n\t\tSTOCK MARKET SIMULATOR");
		txtpnStockMarketSimulator.setBackground(new Color(0, 0, 102));
		txtpnStockMarketSimulator.setBounds(6, 6, 588, 113);
		getContentPane().add(txtpnStockMarketSimulator);
		setBackground(new Color(176, 224, 230));
		setSize(600, 600);
		setVisible(true);
		this.setTitle("Stock Simulator");
		

		
		
		
		JMenuBar mb = new JMenuBar();		
		mb.setFont(new Font("Hannotate TC", Font.PLAIN, 14));
		mb.setBackground(new Color(95, 158, 160));
		JMenu companies = new JMenu("Companies");
		companies.setBackground(Color.DARK_GRAY);
		companies.setFont(new Font("Tsukushi A Round Gothic", Font.PLAIN, 14));
		mb.add(companies);
		
		JMenuItem allComp = new JMenuItem("All companies");
		allComp.setFont(new Font("Tsukushi A Round Gothic", Font.PLAIN, 15));
		companies.add(allComp);
		allComp.addActionListener(this);
		allComp.setActionCommand("comp");
		
		JMenuItem compByCapital = new JMenu("Companies by Capital");
		compByCapital.setFont(new Font("Tsukushi A Round Gothic", Font.PLAIN, 15));
		companies.add(compByCapital);
		
		JMenuItem highestCapital = new JMenuItem("Highest Capial");
		highestCapital.setFont(new Font("Tsukushi A Round Gothic", Font.PLAIN, 15));
		compByCapital.add(highestCapital);
		highestCapital.addActionListener(this);
		highestCapital.setActionCommand("highestCapital");
		
		JMenuItem lowestCapital = new JMenuItem("Lowest Capial");
		lowestCapital.setFont(new Font("Tsukushi A Round Gothic", Font.PLAIN, 14));
		compByCapital.add(lowestCapital);
		lowestCapital.addActionListener(this);
		lowestCapital.setActionCommand("lowestCapital");
		
		
		
		JMenu investors = new JMenu("Investors");
		investors.setFont(new Font("Tsukushi A Round Gothic", Font.PLAIN, 14));
		mb.add(investors);
		JMenuItem allInv = new JMenuItem("All Investors");
		allInv.setFont(new Font("Tsukushi A Round Gothic", Font.PLAIN, 14));
		investors.add(allInv);
		allInv.addActionListener(this);
		allInv.setActionCommand("inv");
		
		
		JMenuItem invByShares = new JMenu("By Shares");
		invByShares.setFont(new Font("Tsukushi A Round Gothic", Font.PLAIN, 14));
		investors.add(invByShares);
		
		JMenuItem highestShares = new JMenuItem("Highes Number of Shares");
		highestShares.setFont(new Font("Tsukushi A Round Gothic", Font.PLAIN, 14));
		invByShares.add(highestShares);
		highestShares.addActionListener(this);
		highestShares.setActionCommand("highestShares");
		
		JMenuItem lowestShares = new JMenuItem("Lowest Number of Shares");
		lowestShares.setFont(new Font("Tsukushi A Round Gothic", Font.PLAIN, 14));
		invByShares.add(lowestShares);
		lowestShares.addActionListener(this);
		lowestShares.setActionCommand("lowestShares");
		
		JMenuItem byInvests = new JMenu("By Invests");
		byInvests.setFont(new Font("Tsukushi A Round Gothic", Font.PLAIN, 14));
		investors.add(byInvests);
		
		JMenuItem MostInversions = new JMenuItem("Most invests");
		MostInversions.setFont(new Font("Tsukushi A Round Gothic", Font.PLAIN, 14));
		byInvests.add(MostInversions);
		MostInversions.addActionListener(this);
		MostInversions.setActionCommand("mostInvests");
		
		JMenuItem leastInvests = new JMenuItem("Least invests");
		leastInvests.setFont(new Font("Tsukushi A Round Gothic", Font.PLAIN, 14));
		byInvests.add(leastInvests);
		leastInvests.addActionListener(this);
		leastInvests.setActionCommand("leastInvests");
		
		
		
		
		JMenu file = new JMenu("Exit");
		file.setFont(new Font("Tsukushi A Round Gothic", Font.PLAIN, 14));
		mb.add(file);
		JMenuItem exit = new JMenuItem("Exit Application");
		file.add(exit);
		exit.addActionListener(this);
		exit.setActionCommand("ext");

		
	
	
		
		this.setJMenuBar(mb);
		
		validate();
		repaint();
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("inv")) {
			investorsG ig = new investorsG();
		} 
		else if (e.getActionCommand().equals("comp")) {
			CompaniesGUI cg = new CompaniesGUI(); 
		}
		else if (e.getActionCommand().equals("highestCapital")) {
			
		}
		else if (e.getActionCommand().equals("lowestCapital")) {
			
		}
		else if (e.getActionCommand().equals("highestShares")) {
			
		}
		else if (e.getActionCommand().equals("lowestShares")) {
			
		}
		else if (e.getActionCommand().equals("mostInvests")) {
			
		}
		else if (e.getActionCommand().equals("leastInvests")) {
			
		}
		else if(e.getActionCommand().equals("ext")) {
			int confirmed = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?","EXIT",JOptionPane.YES_NO_OPTION);
	        if(confirmed == JOptionPane.YES_OPTION) {
	        	System.exit(0);
	        }
		}
		
	}
}
