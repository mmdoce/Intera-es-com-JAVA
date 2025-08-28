import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;


public class guylogin extends JFrame { 
    //informa que isso vai ser uma interface
    //atributos da classe guylogin  
    private JTextField tflogin;
    private JLabel lbsenha;
    private JLabel lblogin;
    private JButton btlogar;
    private JButton btcancelar;
    private JPasswordField pfsenha;
    private static guylogin frame;



//construtur que é o metodo com o nome da classe 
    public guylogin(){
        inicializarcomponentes();//criando funções/metodos
        definireventos();
    }
    
    //inicializa componestes graficos 

    private void inicializarcomponentes() { //chamando as funções/metodos
        
        
        setTitle("LOGIN DO SISTEMA "); //titulo da tela
        setBounds(0,0,250,200);//define tamanho da tela 
        setLayout(null);//posição dos elementos na tela, distancia de classes

        //instancia de classes

        tflogin= new JTextField(5);
        pfsenha =new JPasswordField(5);
        lbsenha =new JLabel("Senha: ");
        lblogin =new JLabel("Login");
        btlogar =new JButton("Logar");
        btcancelar =new JButton("Cancelar");
        
        
        //posições de cada objeto da tela 
        //tamanho dos objetos 
        tflogin.setBounds(100,30,120,25);
        lblogin.setBounds(30,30,80,25);
        lbsenha.setBounds(30,75,80,25);
        pfsenha.setBounds(100,75,120,25);
        btlogar.setBounds(20,120,100,25);
        btcancelar.setBounds(125,120,100,25);
        add(tflogin);
        add(lbsenha);
        add(lblogin);
        add(btlogar);
        add(btcancelar);
        add(pfsenha);
    }

    private void definireventos() {//chamando metodo
        btlogar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e ) {
                String senha=String.valueOf(pfsenha.getPassword());
                if(pfsenha.getText().equals("java8") &&  (tflogin.getText().equals("java8"))){
                        frame.setVisible(false);
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"Login ou Senha incorretas");
                    }
             }
        }); 
        btcancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                   System.exit(ABORT);
            }
      
        });
    }

    public static void main(String args[]){

    SwingUtilities.invokeLater(new Runnable() {
        @Override
        public void run() {
            frame=new guylogin();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
            frame.setLocation(tela.width - frame.getSize().width/2,
            (tela.height-frame.getSize().height/2));
            frame.setVisible(true);

        }
    });
    }   
}


