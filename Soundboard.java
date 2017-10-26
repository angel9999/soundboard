import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.ImageIO;

public class Soundboard
{
	public Soundboard()
	{
		JFrame f = new JFrame();
		
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        		
		f.setSize( 900, 500);
        
		JButton A = makeSoundboardButton("audrey.JPG", "Hepburn.WAV");		
		
		JButton y = makeSoundboardButton("obama.jfif", "ospeech.WAV");
		//create the Sylvia Mathews Burwell button
		
		JPanel p = new JPanel();
		//create a JPanel for the button
		
		p.add(A);
		p.add(y);
		//add the button to a JPanel
		
		f.getContentPane().add(p);
		//add the panel to the content pane of the frame
		
		f.setVisible(true);
		
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        		
		f.setSize( 900, 500);
      
		
		//make sure the JFrame is visible
	}
	
	/**
	 * Creates a JButton which displays the specified image and plays the specified sound when it is clicked.
	 * @param imageFile the name of the image to display on the button, including the file extension
	 * @param soundFile the name of the audio clip to play when the button is clicked
	 * @return the JButton
	 **/
	private JButton makeSoundboardButton(String imageFile, String soundFile)
	{
		JButton button;
		try{
			BufferedImage icon = ImageIO.read(new File(imageFile));
			button = new JButton(new ImageIcon(icon));
			button.setBorderPainted(false);
			button.setFocusPainted(false);
			button.setContentAreaFilled(false);
			//add action listener
			button.addActionListener(new SoundboardActionListener(soundFile));
		}
		catch (IOException e) {
			System.out.println(e);
			button = new JButton();
		}
		return button;
	}
}