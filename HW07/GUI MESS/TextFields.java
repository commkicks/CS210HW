import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.text.*;

public class TextFields extends JApplet {
  private JButton b1 = new JButton("Get Text"), b2 = new JButton("Set Text");

  private JTextField t1 = new JTextField(30), t2 = new JTextField(30),t3 = new JTextField(30);

  private String s = new String();

  private UpperCaseDocument ucd = new UpperCaseDocument();

  public void init() {
    t1.setDocument(ucd);
    ucd.addDocumentListener(new T1());
    b1.addActionListener(new B1());
    b2.addActionListener(new B2());
    DocumentListener dl = new T1();
    t1.addActionListener(new T1A());
    Container cp = getContentPane();
    cp.setLayout(new FlowLayout());
    cp.add(b1);
    cp.add(b2);
    cp.add(t1);
    cp.add(t2);
    cp.add(t3);
  }

  class T1 implements DocumentListener {
    public void changedUpdate(DocumentEvent e) {
    }

    public void insertUpdate(DocumentEvent e) {
      t2.setText(t1.getText());
      t3.setText("Text: " + t1.getText());
    }

    public void removeUpdate(DocumentEvent e) {
      t2.setText(t1.getText());
    }
  }

  class T1A implements ActionListener {
    private int count = 0;

    public void actionPerformed(ActionEvent e) {
      t3.setText("t1 Action Event " + count++);
    }
  }

  class B1 implements ActionListener {
    public void actionPerformed(ActionEvent e) {
      if (t1.getSelectedText() == null)
        s = t1.getText();
      else
        s = t1.getSelectedText();
      t1.setEditable(true);
    }
  }

  class B2 implements ActionListener {
    public void actionPerformed(ActionEvent e) {
      ucd.setUpperCase(false);
      t1.setText("Inserted by Button 2: " + s);
      ucd.setUpperCase(true);
      t1.setEditable(false);
    }
  }

  public static void main(String[] args) {
    run(new TextFields(), 375, 125);
  }
  public static void run(JApplet applet, int width, int height) {
    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().add(applet);
    frame.setSize(width, height);
    applet.init();
    applet.start();
    frame.setVisible(true);
  }
  
}

class UpperCaseDocument extends PlainDocument {
  private boolean upperCase = true;

  public void setUpperCase(boolean flag) {
    upperCase = flag;
  }

  public void insertString(int offset, String str, AttributeSet attSet)
      throws BadLocationException {
    if (upperCase)
      str = str.toUpperCase();
    super.insertString(offset, str, attSet);
  }

} ///:~