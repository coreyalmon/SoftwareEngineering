package PresentationLayer;
import javax.swing.SwingUtilities;

public class Launcher
{
    public static void main(String[] args)
    {
            SwingUtilities.invokeLater(new Runnable() //Forces 1 thread for Runnable
            {
                @Override
                public void run() 
                {
                		MainFrame window = new MainFrame();
                }     
            });
    }
}