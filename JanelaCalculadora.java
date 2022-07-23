import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JanelaCalculadora extends JFrame implements ActionListener
{
    private Calculadora modelo = new Calculadora();
    private JTextField display=new JTextField(10);
    private JButton botao1= new JButton("1"),
                    botao2= new JButton("2"),
                    botao3= new JButton("3"),
                    botao4= new JButton("4"),
                    botao5= new JButton("5"),
                    botao6= new JButton("6"),
                    botao7= new JButton("7"),
                    botao8= new JButton("8"),
                    botao9= new JButton("9"),
                    botao0= new JButton("0"),
                    botaoMais= new JButton("+"),
                    botaoMenos= new JButton("-"),
                    botaoVezes= new JButton("*"),
                    botaoDividir= new JButton("\u00F7"),
                    botaoElevado= new JButton("^"),
                    botaoPorcento= new JButton("%"),
                    botaoRaiz = new JButton("\u221A"),
                    botaoRaiz3 = new JButton("\u221B"),
                    botaoRaiz4 = new JButton("\u221C"),
                    botaoAC= new JButton("AC"),
                    botaoNegativo= new JButton("\u00B1"),
                    botaoVirgula= new JButton(","),
                    botaoFatorial= new JButton("x!"),
                    botaoLog= new JButton("lg\u2082"),
                    botaoElev= new JButton("2\u1D43"),
                    botaoIgual= new JButton("=");

    public JanelaCalculadora()
    {
        //super.getContentPane().setLayout(new FlowLayout());
        setLayout(null);
        display.setBounds(25, 20, 270, 30);
        botaoAC.setBounds(25, 50, 50, 20);
        botaoElevado.setBounds(80, 50, 50, 20);
        botaoPorcento.setBounds(135, 50, 50, 20);
        botaoDividir.setBounds(190, 50, 50, 20);
        botaoRaiz.setBounds(245, 50, 50, 20);
        botao7.setBounds(25, 75, 50, 20);
        botao8.setBounds(80, 75, 50, 20);
        botao9.setBounds(135, 75, 50, 20);
        botaoVezes.setBounds(190, 75, 50, 20);
        botaoRaiz3.setBounds(245, 75, 50, 20);
        botao4.setBounds(25, 100, 50, 20);
        botao5.setBounds(80, 100, 50, 20);
        botao6.setBounds(135, 100, 50, 20);
        botaoMenos.setBounds(190, 100, 50, 20);
        botaoElev.setBounds(245, 100, 50, 20);
        botao1.setBounds(25, 125, 50, 20);
        botao2.setBounds(80, 125, 50, 20);
        botao3.setBounds(135, 125, 50, 20);
        botaoMais.setBounds(190, 125, 50, 20);
        botaoLog.setBounds(245, 125, 50, 20);
        botaoNegativo.setBounds(25, 150, 50, 20);
        botao0.setBounds(80, 150, 50, 20);
        botaoVirgula.setBounds(135, 150, 50, 20);
        botaoIgual.setBounds(190, 150, 50, 20);
        botaoFatorial.setBounds(245, 150, 50, 20);
        display.setEnabled(false);
        super.getContentPane().add(display);
        super.getContentPane().add(botao1);
        super.getContentPane().add(botao2);
        super.getContentPane().add(botao3);
        super.getContentPane().add(botao4);
        super.getContentPane().add(botao5);
        super.getContentPane().add(botao6);
        super.getContentPane().add(botao7);
        super.getContentPane().add(botao8);
        super.getContentPane().add(botao9);
        super.getContentPane().add(botao0);
        super.getContentPane().add(botaoMais);
        super.getContentPane().add(botaoMenos);
        super.getContentPane().add(botaoVezes);
        super.getContentPane().add(botaoDividir);
        super.getContentPane().add(botaoElevado);
        super.getContentPane().add(botaoPorcento);
        super.getContentPane().add(botaoAC);
        super.getContentPane().add(botaoRaiz);
        super.getContentPane().add(botaoRaiz3);
        super.getContentPane().add(botaoIgual);
        super.getContentPane().add(botaoNegativo);
        super.getContentPane().add(botaoVirgula);
        super.getContentPane().add(botaoFatorial);
        super.getContentPane().add(botaoElev);
        super.getContentPane().add(botaoLog);
        
        botao0.addActionListener(this);
        botao1.addActionListener(this);
        botao2.addActionListener(this);
        botao3.addActionListener(this);
        botao4.addActionListener(this);
        botao5.addActionListener(this);
        botao6.addActionListener(this);
        botao7.addActionListener(this);
        botao8.addActionListener(this);
        botao9.addActionListener(this);
        botaoMenos.addActionListener(this);
        botaoMais.addActionListener(this);
        botaoVezes.addActionListener(this);
        botaoDividir.addActionListener(this);
        botaoAC.addActionListener(this);
        botaoIgual.addActionListener(this);
        botaoElevado.addActionListener(this);
        botaoElev.addActionListener(this);
        botaoPorcento.addActionListener(this);
        botaoRaiz.addActionListener(this);
        botaoRaiz3.addActionListener(this);
        botaoNegativo.addActionListener(this);
        botaoVirgula.addActionListener(this);
        botaoFatorial.addActionListener(this);
        botaoLog.addActionListener(this);
        Color minhaCor = new Color(217, 228, 241);
        Color afir = new Color(50,205,50);
        botaoIgual.setBackground(afir);
        super.getContentPane().setBackground(minhaCor);
        Color neg = new Color(255,0,0);
        botaoAC.setBackground(neg);
    }
    
    public void main(){
        JanelaCalculadora janela = new JanelaCalculadora();
        janela.setSize(340,250);
        janela.setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e){
        switch(e.getActionCommand()){
            case "0": display.setText(""+modelo.zero());break;
            case "1": display.setText(""+modelo.um());break;
            case "2": display.setText(""+modelo.dois());break;
            case "3": display.setText(""+modelo.tres());break;
            case "4": display.setText(""+modelo.quatro());break;
            case "5": display.setText(""+modelo.cinco());break;
            case "6": display.setText(""+modelo.seis());break;
            case "7": display.setText(""+modelo.sete());break;
            case "8": display.setText(""+modelo.oito());break;
            case "9": display.setText(""+modelo.nove());break;
            case "AC": display.setText(""+modelo.zerar());break;
            case "+": display.setText(""+modelo.mais());break;
            case "-": display.setText(""+modelo.menos());break;
            case "*": display.setText(""+modelo.vezes());break;
            case "\u00F7": display.setText(""+modelo.dividir());break;
            case "^": display.setText(""+modelo.elevado());break;
            case "%": display.setText(""+modelo.porcento());break;
            case "=": display.setText(""+modelo.igual());break;
            case "\u221A": display.setText(""+modelo.raiz());break;
            case "\u00B1": display.setText(""+modelo.negativo());break;
            case ",": display.setText(""+modelo.virgula());break;
            case "x!": display.setText(""+modelo.fatorial());break;
            case "\u221B": display.setText(""+modelo.raiz3());break;
            case "2\u1D43": display.setText(""+modelo.elev());break;
            case "Log\u2082": display.setText(""+modelo.log());break;
        }
        
    }

}
