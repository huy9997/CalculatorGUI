import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EvaluatorUI extends JFrame implements ActionListener {
  private TextField txField = new TextField();
  private Panel buttonPanel = new Panel();

  private static final String[] bText = {
    "7", "8", "9", "+", "4", "5", "6", "- ", "1", "2", "3",
    "*", "0", "^", "=", "/", "(", ")", "C", "CE"
  };
  private Button[] buttons = new Button[ bText.length ];

  public static void main(String argv[]) {
    EvaluatorUI calc = new EvaluatorUI();
  }

  public EvaluatorUI() {
    setLayout( new BorderLayout() );

    add( txField, BorderLayout.NORTH );
    txField.setEditable( false );

    add( buttonPanel, BorderLayout.CENTER );
    buttonPanel.setLayout( new GridLayout( 5, 4 ));
       
    for ( int i = 0; i < 20; i++ ) {
      buttons[ i ] = new Button( bText[ i ]);
    }
    
    for (int i=0; i<20; i++) {
      buttonPanel.add( buttons[ i ]);
    }
    
    for ( int i = 0; i < 20; i++ ) {
      buttons[ i ].addActionListener( this );
    }

    setTitle( "Calculator" );
    setSize( 400, 400 );
    setLocationByPlatform( true  );
    setDefaultCloseOperation( WindowConstants.EXIT_ON_CLOSE );
    setVisible( true );
  }
    boolean reset = false;
  public void actionPerformed( ActionEvent arg ) {
      
      int FinalResult; 
      
      if(reset){
          txField.setText("");
          reset=false;
      }
      Evaluator evaluator = new Evaluator();
      if(arg.getActionCommand() == "C" || arg.getActionCommand() == "CE"){
          txField.setText("");
      }
      else if(arg.getActionCommand() == "="){
          FinalResult = evaluator.eval(txField.getText());
          txField.setText(String.valueOf(FinalResult));
          reset = true; 
      }
      else{
      txField.setText(txField.getText() + arg.getActionCommand());
      }
  }
}
