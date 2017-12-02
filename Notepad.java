import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Notepad implements ActionListener{
	JMenuBar mbar;
	JMenu file, edit, help, text;
	JMenuItem fnew,open,save,saveAs,close,about,find,findnext,cut,copy,paste,upper,lower,toggle;
	JTextArea ta;
	JFrame f;
	
	public Notepad(){
	f = new JFrame("Notepad");
	mbar = new JMenuBar();
	f.setJMenuBar(mbar);
	ta = new JTextArea();
	f.add(ta);
	file = new JMenu("File");
	file.setMnemonic(KeyEvent.VK_F);
	edit = new JMenu("Edit");
	edit.setMnemonic(KeyEvent.VK_E);
	help = new JMenu("Help");
	help.setMnemonic(KeyEvent.VK_H);
	text = new JMenu("Text");
	text.setMnemonic(KeyEvent.VK_T);

	fnew = new JMenuItem("New");
	open = new JMenuItem("Open");
	save = new JMenuItem("Save");
	saveAs = new JMenuItem("Save As");
	close = new JMenuItem("Close");
	about = new JMenuItem("About");
	cut = new JMenuItem("Cut");
	copy = new JMenuItem("Copy");
	paste = new JMenuItem("Paste");
	find = new JMenuItem("Find");
	findnext = new JMenuItem("Find Next");
	upper = new JMenuItem("Upper");
	lower = new JMenuItem("Lower");
	toggle = new JMenuItem("Toggle");

	fnew.addActionListener(this);
	open.addActionListener(this);
	save.addActionListener(this);
	close.addActionListener(this);
	saveAs.addActionListener(this);
	about.addActionListener(this);
	cut.addActionListener(this);
	copy.addActionListener(this);
	paste.addActionListener(this);
	find.addActionListener(this);
	findnext.addActionListener(this);
	upper.addActionListener(this);
	lower.addActionListener(this);
	toggle.addActionListener(this);

	file.add(fnew);
	file.add(open);
	file.add(save);
	file.add(saveAs);
	file.add(close);

	
	help.add(about);

	
	edit.add(cut);
	edit.add(copy);
	edit.add(paste);
	edit.add(find);
	edit.add(findnext);

	
	text.add(upper);
	text.add(lower);
	text.add(toggle);

	mbar.add(file);
	mbar.add(edit);
	mbar.add(text);
	mbar.add(help);

	f.setBounds(300,100,600,500);
	f.setVisible(true);
	f.setLayout(null);
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String args[]){
	Notepad obj = new Notepad();
	}

	public void actionPerformed(ActionEvent ae){
	
	}	
}