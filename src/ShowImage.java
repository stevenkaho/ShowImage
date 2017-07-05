import java.awt.*;
import javax.swing.*;
import java.io.*;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;

public class ShowImage {
	String FileName;
	BufferedImage image;
	JFrame jf;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new ShowImage();

	}
	public ShowImage(){
		LoadFile();
		SetTable();
		
	}
	public void LoadFile(){
		FileName = "c:\\Users\\StevenCheng\\workspace\\ShowImage\\src\\Brick.JPG";
		try
		{
			image = ImageIO.read(new File(FileName));
		}
		catch(Exception e)
		{
			javax.swing.JOptionPane.showMessageDialog(null, "Loading image error:" + FileName);
			image = null;
		}
	}
	public void SetTable(){
		jf = new JFrame("");
		
		JScrollPane scrollPane = new JScrollPane(new JLabel(new ImageIcon(image)));
		
		jf.getContentPane().add(scrollPane);
		jf.pack();
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setTitle(FileName + " " + image.getWidth() + "x" + image.getHeight());
		jf.setSize(640, 480);
		jf.setLocationRelativeTo(null);
		jf.setVisible(true);
	}
	
}
