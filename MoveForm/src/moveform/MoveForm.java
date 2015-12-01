package moveform;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class MoveForm extends JFrame implements ActionListener {

    private static final String LEFT = "LEFT";
    private static final String TOP = "TOP";
    private static final String RIGHT = "RIGHT";
    private static final String BOTTOM = "BOTTOM";

    private SlaveForm sf;
       
    public MoveForm(SlaveForm sf) {
        this.sf = sf;
        setTitle("MasterForm");
        
        JButton left = new JButton(LEFT);
        left.setActionCommand(LEFT);
        left.addActionListener(this);
        add(left, BorderLayout.WEST);
        
        JButton top = new JButton(TOP);
        top.setActionCommand(TOP);
        top.addActionListener(this);
        add(top, BorderLayout.NORTH);
        
        JButton right = new JButton(RIGHT); 
        right.setActionCommand(RIGHT);
        right.addActionListener(this);
        add(right, BorderLayout.EAST);
        
        JButton bottom = new JButton(BOTTOM); 
        bottom.setActionCommand(BOTTOM);
        bottom.addActionListener(this);
        add(bottom, BorderLayout.SOUTH);
        
        setBounds(400, 300, 300, 200);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        switch (command) {
            case LEFT:
                sf.moveLeftForm(sf.getxCoord(), sf.getyCoord());
                break;
            case TOP:
                sf.moveTopForm(sf.getxCoord(), sf.getyCoord());
                break;
            case RIGHT:
                sf.moveRightForm(sf.getxCoord(), sf.getyCoord());
                break;
            case BOTTOM:
                sf.moveBottomForm(sf.getxCoord(), sf.getyCoord());
                break;
        }
    }
    
    public static void main(String[] args) {
        
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                SlaveForm sf = new SlaveForm(200, 200);
                MoveForm mf = new MoveForm(sf);
                mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                mf.setVisible(true);
                sf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                sf.setVisible(true);
            }
        }
        );

    }

}

class SlaveForm extends JFrame {
    private static final int step = 20;
    private int xCoord;
    private int yCoord;

    public SlaveForm(int xCoord, int yCoord) {
        setTitle("SlaveForm");
        setBounds(200, 200, 200, 200);
        this.xCoord = xCoord;
        this.yCoord = yCoord;
    }
    
    public void moveLeftForm (int xCoord, int yCoord) {
        this.setLocation(xCoord - step, yCoord);
        setxCoord(xCoord - step);
    }
    
    public void moveRightForm (int xCoord, int yCoord) {
        this.setLocation(xCoord + step, yCoord);
        setxCoord(xCoord + step);
    }
    
    public void moveTopForm (int xCoord, int yCoord) {
        this.setLocation(xCoord, yCoord - step);
        setyCoord(yCoord - step);
    }
    
    public void moveBottomForm (int xCoord, int yCoord) {
        this.setLocation(xCoord, yCoord + step);
        setyCoord(yCoord + step);
    }
    
    public int getxCoord() {
        return xCoord;
    }

    public void setxCoord(int xCoord) {
        this.xCoord = xCoord;
    }

    public int getyCoord() {
        return yCoord;
    }

    public void setyCoord(int yCoord) {
        this.yCoord = yCoord;
    }
    
}

//class SlaveFormThread extends Thread {
//
//    private SlaveForm sf;
//    private volatile boolean fStop = true;
//
//    public SlaveFormThread(SlaveForm sf) {
//        this.sf = sf;
//    }
//
//    void stopSlaveThread() {
//        fStop = false;
//    }
//
//    @Override
//    public void run() {
//        while (fStop) {
//            System.out.println("running");
//            try {
//                Thread.sleep(500);
//            } catch (Exception e) {
//            }
//
//        }
//
//    }

//class MasterForm extends JFrame implements ActionListener {
//    
//    private static final String LEFT = "LEFT";
//    private static final String TOP = "TOP";
//    private static final String RIGHT = "RIGHT";
//    private static final String BOTTOM = "BOTTOM";
//    
//    //private SlaveForm sf = new SlaveForm();
//    private SlaveForm sf;
//    private SlaveFormThread sft = null;
//    
//
//    public MasterForm()  {
//        
//        setTitle("MasterForm");
//        
//        JButton left = new JButton(LEFT);
//        left.setActionCommand(LEFT);
//        left.addActionListener(this);
//        add(left, BorderLayout.WEST);
//        JButton top = new JButton(TOP);
//        top.setActionCommand(TOP);
//        top.addActionListener(this);
//        add(top, BorderLayout.NORTH);
//        JButton right = new JButton(RIGHT);
//        add(right, BorderLayout.EAST);
//        JButton bottom = new JButton(BOTTOM);
//        add(bottom, BorderLayout.SOUTH);
//        
//        setBounds(400, 300, 300, 200);
//        
//    }
//    
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        if(LEFT.equals(e.getActionCommand())){
//            if (sft == null) {
//                sft = new SlaveFormThread();
//                sft.start();
//                sf.moveForm();
//            }
//        }
//        
//        if(TOP.equals(e.getActionCommand())){
//            if (sft == null) {
//                sft = new SlaveFormThread();
//                sft.stopSlaveThread();
//                sft = null;
//            }
//        }
//    }
//    
//}



