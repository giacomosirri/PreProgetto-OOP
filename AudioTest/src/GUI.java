import javax.swing.*;

public class GUI {
	
	private JavaSoundRecorder sr = new JavaSoundRecorder();
	private JFrame jf = new JFrame();
	private JPanel jp = new JPanel();
	private JButton start = new JButton("START RECORDING");
	private JButton stop = new JButton("STOP RECORDING");
	
	
	public GUI() {
		jf.setSize(500, 150);
		jp.add(start);
		jp.add(stop);
		
		start.addActionListener(e -> {
			Thread starter = new Thread(new Runnable() {
	            public void run() {
	                sr.start();
	            }
	        });
			starter.start();
		});
		stop.addActionListener(e -> {
			Thread stopper = new Thread(new Runnable() {
	            public void run() {
	                sr.finish();
	            }
	        });
			stopper.start();
		});
		
		jf.getContentPane().add(jp);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
	}
}
