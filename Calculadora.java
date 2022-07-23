import java.lang.Math;

public class Calculadora
{
    // instance variables - replace the example below with your own
    private double display;
   
    private double registro;
   
    private char operacao;
   
    private boolean digitouOperacao;
    

    /**
     * Constructor for objects of class Calculadora
     */
    public Calculadora()
    {
        this.zerar();
       
    }
    
    public double getDisplay(){
        return this.display;
    }
    
    public double zero(){
        teclar(0);
        return getDisplay();
    }
    
    public double um(){
        teclar(1);
        return getDisplay();
    }
    
    public double dois(){
        teclar(2);
        return getDisplay();
    }
    
    public double tres(){
        teclar(3);
        return getDisplay();
    }
    
    public double quatro(){
        teclar(4);
        return getDisplay();
    }
    
    public double cinco(){
        teclar(5);
        return getDisplay();
    }
    
    public double seis(){
        teclar(6);
        return getDisplay();
    }
    
    public double sete(){
        teclar(7);
        return getDisplay();
    }
    
    public double oito(){
        teclar(8);
        return getDisplay();
    }
    
    public double nove(){
        teclar(9);
        return getDisplay();
    }
   
    public double zerar(){
        display = registro = 0;
        operacao = 'x';
        digitouOperacao = false;
        return getDisplay();
    }

    protected void teclar(double digito){
        if (this.digitouOperacao){
            this.display=0;           
        }
        this.display = this.display*10+digito;
        this.digitouOperacao = false;
    }
    
    public double mais(){
        operacao('+');
        return getDisplay();
    }
    
    public double menos(){
        operacao('-');
        return getDisplay();
    }
    
    public double elev(){
        operacao('&');
        return getDisplay();
    }
    
    public double negativo(){
        operacao('?');
        return getDisplay();
    }
    
    public double virgula(){
        operacao(',');
        return getDisplay();
    }
    
    public double vezes(){
        operacao('*');
        return getDisplay();
    }
    
    public double raiz3(){
        operacao('#');
        return getDisplay();
    }
    
    public double dividir(){
        operacao('/');
        return getDisplay();
    }
    public double fatorial(){
        operacao('!');
        return getDisplay();
    }
    
    public double igual(){
        operacao('=');
        return getDisplay();
    }
    
    public double log(){
        operacao(';');
        return getDisplay();
    }
    
    public double elevado(){
        operacao('^');
        return getDisplay();
    }
    
    public double raiz(){
        operacao('~');
        return getDisplay();
    }
    
    public double porcento(){
        operacao('%');
        return getDisplay();
    }
   
    protected double operacao(char op){
        if (operacao!='x'){
            calcularResultado();
        }
        this.operacao=op;
        this.registro = this.display;
        this.digitouOperacao = true;
        return getDisplay();
    }
   
    protected double calcularResultado(){
        switch(this.operacao){
            case '+':
                display = display + registro;
                break;
            case '-':
                display = registro - display;
                break;
            case '*':
                display = display * registro;
                break;
            case '/':
                display = registro / display;
                break;
            case '^':
                display = (double)Math.pow(registro,display);
                break;
            case '%':
                display = (registro*100)/display;
                break;
            case '~':
                display = (double)Math.sqrt(registro);
                break;
            case '?':
                display = (-1)*registro;
                break;
            case ',':
                display = registro + (display/100);
                break;
            case '!':
                double f = registro;
                while (registro > 1){
                  f = f *(registro-1); registro--;
                    }
                display = f;
                break;
            case '#':
                display=Math.cbrt(registro);
                break;
            case '&':
                display = (double)Math.pow(2,registro);
                break;
            case ';':
                display = Math.log10(registro);
                break;
        }
        this.operacao='x';
        return display;
    }
   
   

}