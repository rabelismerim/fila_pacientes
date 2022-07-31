package filapacientes;

import javax.swing.JOptionPane;

class Fila {

    private int inicio;
    private int fim;
    private final int tamanho;
    private int qtdeElementos;
    //criei essa variavel para controlar tamanho da fila
    private int qtdInsercoes;
    private final Paciente f[];
    
    public Fila() {
        inicio = fim = -1;
        tamanho = 20;//0-19
        f = new Paciente[tamanho];
        qtdeElementos = qtdInsercoes = 0;   
        
    }
    

    public void adicionar(Paciente p) {
        if (!estaCheia() && qtdInsercoes < tamanho) {
            if (inicio == -1) {
                inicio = 0;
            }
            fim++;
            f[fim] = p;
            qtdInsercoes++;
            qtdeElementos++;
        } else {
            JOptionPane.showMessageDialog(null, "Fila Ja completa");
        }
    }

    public void remover() {
        if (!estaVazia()) {
            inicio++;
            qtdeElementos--;
        }
    }
    
    public boolean estaVazia() {
        if (qtdeElementos == 0) {
            return true;
        }
        return false;
    }
    
    public boolean estaCheia() {
        //retirei o -1 pois nao concordei ja que nao verificou o vetor mas sim o proprio tamanho q inicialmente o zero mas comeca a contar do 1
        if (qtdeElementos == tamanho) {
            return true;
        }
        return false;
    }
    
    public void mostrar() {
        String elementos = "";
        for (int i = inicio; i <= fim; i++) {
            elementos += i + " - " + f[i].getNome() + " - " + f[i].getSexo() + " - " + f[i].getIdade() + "\n";
        }
        
        JOptionPane.showMessageDialog(null, elementos);
    }

    public Paciente[] pegaFila() {
        return f;
    }

    public int getInicio() {
        return inicio;        
    }

    public int getFim() {
        return fim;        
    }
}
