package test;
import java.awt.*;
import java.awt.event.*;

class Left extends Panel {
	Panel upperleft[]; 
    Panel lowerleft[];
    Panel line;
    
    public Left() {
    	int i;
		setLayout(null);
		upperleft = new Panel[7];
		lowerleft = new Panel[7];
		line = new Panel();
		add(line);
        line.setBackground(Color.green);
        line.setBounds(0,50,100,7);
        
		
		for( i = 0; i < 7; i++ ) {
			upperleft[i]= new Panel();
			lowerleft[i]= new Panel();
			add(upperleft[i]);
			add(lowerleft[i]);
			upperleft[i].setBackground(Color.green);
			upperleft[i].setBounds(i*7,50-i*7,7,7);
			lowerleft[i].setBackground(Color.green);
			lowerleft[i].setBounds(i*7,50+i*7,7,7);
		}
    }   
}

class Right extends Panel {
	Panel upperright[]; 
    Panel lowerright[];
    Panel line;
    
    public Right() {
    	int i;
		setLayout(null);
		upperright = new Panel[7];
		lowerright = new Panel[7];
		line = new Panel();
		add(line);
        line.setBackground(Color.green);
        line.setBounds(0,50,100,7);
        
		
		for( i = 0; i < 7; i++ ) {
			upperright[i]= new Panel();
			lowerright[i]= new Panel();
			add(upperright[i]);
			add(lowerright[i]);
			upperright[i].setBackground(Color.green);
			upperright[i].setBounds(50+i*7,i*7,7,7);
			lowerright[i].setBackground(Color.green);
			lowerright[i].setBounds(50+i*7,100-i*7,7,7);
		}
    }   
}

class Up extends Panel {
	Panel upperright[]; 
	Panel upperleft[]; 
    Panel line;
    
    public Up() {
    	int i;
		setLayout(null);
		upperright = new Panel[7];
		upperleft = new Panel[7];
		line = new Panel();
		add(line);
        line.setBackground(Color.green);
        line.setBounds(50,0,7,100);
        
		
		for( i = 0; i < 7; i++ ) {
			upperright[i]= new Panel();
			upperleft[i]= new Panel();
			add(upperright[i]);
			add(upperleft[i]);
			upperright[i].setBackground(Color.green);
			upperright[i].setBounds(50+i*7,i*7,7,7);
			upperleft[i].setBackground(Color.green);
			upperleft[i].setBounds(i*7,50-i*7,7,7);
		}
    }   
}

class Down extends Panel {
	Panel lowerleft[]; 
    Panel lowerright[];
    Panel line;
    
    public Down() {
    	int i;
		setLayout(null);
		lowerleft = new Panel[7];
		lowerright = new Panel[7];
		line = new Panel();
		add(line);
        line.setBackground(Color.green);
        line.setBounds(50,0,7,100);
        
		
		for( i = 0; i < 7; i++ ) {
			lowerleft[i]= new Panel();
			lowerright[i]= new Panel();
			add(lowerleft[i]);
			add(lowerright[i]);
			lowerleft[i].setBackground(Color.green);
			lowerleft[i].setBounds(i*7,50+i*7,7,7);
			lowerright[i].setBackground(Color.green);
			lowerright[i].setBounds(50+i*7,100-i*7,7,7);
		}
    }   
}
 class Final {
	
	static Frame myframe[];
	static Right panel2[];
	static Left panel1[];
	static Up panel3[];
	static Down panel4[];
	static int score = 0;
	static Panel panel5;
	static Panel panel6;
	static Panel panel7;
	static Panel panel8;
	
	public static void main(String args[]) {
		int i;
		Frame myframe = new Frame();
		Panel panel5 = new Panel();
		Panel panel6 = new Panel();
		Panel panel7 = new Panel();
		Panel panel8 = new Panel();
    
		myframe.setLayout(null); 
		myframe.setSize(1200,600); 
		myframe.setVisible(true); 
		myframe.setBackground(Color.black);
    	
		myframe.add(panel5);
		panel5.setBounds(900,40,100,100);
		panel5.setBackground(Color.red);
		
		myframe.add(panel6);
		panel6.setBounds(900,140,100,100);
		panel6.setBackground(Color.blue);
		
		myframe.add(panel7);
		panel7.setBounds(800,140,100,100);
		panel7.setBackground(Color.white);
		
		myframe.add(panel8);
		panel8.setBounds(1000,140,100,100);
		panel8.setBackground(Color.yellow);
		
		panel2 = new Right[4];
		panel1 = new Left[4];
		panel3 = new Up[4];
		panel4 = new Down[4];
		
        for( i = 0; i < 4; i++ ) {
        	panel2[i] = new Right();
            myframe.add(panel2[i]);
            panel2[i].setBounds(150,370-i*110,100,100);
            panel2[i].setBackground(Color.black);
            panel2[i].setVisible(false);
            
            panel1[i] = new Left();
            myframe.add(panel1[i]);
            panel1[i].setBounds(30,370-i*110,100,100);
            panel1[i].setBackground(Color.black);
            panel1[i].setVisible(false);
        	
            panel3[i] = new Up();
            myframe.add(panel3[i]);
            panel3[i].setBounds(270,370-i*110,100,100);
            panel3[i].setBackground(Color.black);
            panel3[i].setVisible(false);
            
            panel4[i] = new Down();
            myframe.add(panel4[i]);
            panel4[i].setBounds(390,370-i*110,100,100);
            panel4[i].setBackground(Color.black);
            panel4[i].setVisible(false);
        	}
        
        panel5.addMouseListener(new MouseAdapter() {
            public void mouseReleased(MouseEvent e) {
                panel5MouseReleased(e);
            }
        } );
        panel6.addMouseListener(new MouseAdapter() {
            public void mouseReleased(MouseEvent e) {
                panel6MouseReleased(e);
            }
        } );
        panel7.addMouseListener(new MouseAdapter() {
            public void mouseReleased(MouseEvent e) {
                panel7MouseReleased(e);
            }
        } );
        panel8.addMouseListener(new MouseAdapter() {
            public void mouseReleased(MouseEvent e) {
                panel8MouseReleased(e);
            }
        } );
                
        while(true) {
            sleep(350);
            for( i = 0; i < 3; i++ ) {
            	boolean b = panel2[i+1].isVisible();
                panel2[i].setVisible(b);
                boolean a = panel1[i+1].isVisible();
                panel1[i].setVisible(a);
                boolean c = panel3[i+1].isVisible();
                panel3[i].setVisible(c);
                boolean d = panel4[i+1].isVisible();
                panel4[i].setVisible(d);
            }
            panel2[3].setVisible(Math.random() > 0.7);
            panel1[3].setVisible(Math.random() > 0.7);
            panel3[3].setVisible(Math.random() > 0.7);
            panel4[3].setVisible(Math.random() > 0.7);
            }

}
	public static void panel5MouseReleased(MouseEvent e) {
        if( panel3[0].isVisible() == true ) {
            panel5.setBackground(Color.green);
            panel3[0].setVisible(false);
            score += 100;
            System.out.print("SCORE:" + score + "\n");
        } 
    }
	public static void panel6MouseReleased(MouseEvent e) {
        if( panel4[0].isVisible() == true ) {
            panel6.setBackground(Color.green);
            panel4[0].setVisible(false);
            score += 100;
            System.out.print("SCORE:" + score + "\n");
            
        } 
    }
	public static void panel7MouseReleased(MouseEvent e) {
        if( panel1[0].isVisible() == true ) {
            panel6.setBackground(Color.green);
            panel1[0].setVisible(false);
            score += 100;
            System.out.print("SCORE:" + score + "\n");
        } 
    }
	public static void panel8MouseReleased(MouseEvent e) {
        if( panel2[0].isVisible() == true ) {
            panel6.setBackground(Color.green);
            panel2[0].setVisible(false);
            score += 100;
            System.out.print("SCORE:" + score + "\n");
        } 
    }
	static void sleep(long msec) {
        try{
            Thread.sleep(msec);
        }catch(InterruptedException ie) {
        }
    }
}
