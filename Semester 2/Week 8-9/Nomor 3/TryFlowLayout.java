import javax.swing.*;
import java.awt.*;
public class TryFlowLayout extends JFrame
{
    public TryFlowLayout ()
    {
        super ("MENGGUNAKAN FLOW LAYOUT");
        setSize (500, 250);
        JPanel pl = new JPanel();
        pl.setLayout (new FlowLayout ());
        //meletakkan button pada panel
        pl.add(new JButton("Tombol A"));
        pl.add(new JButton("Tombol B"));
        pl.add(new JButton("Tombol €"));
        JPanel p2 = new JPanel();
        p2.setLayout (new FlowLayout (FlowLayout.LEFT, 2, 20));
        //meletakkan button pada panel
        p2.add(new JButton("Tombol J"));
        p2.add(new JButton("Tombol K"));
        JPanel p3 = new JPanel();
        p3.setLayout (new FlowLayout (FlowLayout.RIGHT, 3, 50));
        //meletakkan button pada panel
        p3.add(new JButton("Tombol X"));
        p3.add(new JButton("Tombol Y"));
        p3.add(new JButton("Tombol 2"));
        //meletakkan dan mengatur posisi panel pada frame
        add("North", pl);
        add("Center", p2);
        add("South", p3);

        setVisible(true);
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    };
    

    public static void main(String[] args)
    {
        TryFlowLayout frame = new TryFlowLayout();
    }
    
}