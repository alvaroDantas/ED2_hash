package hash;

/**
 *
 * @author ht3000974
 */
public class Hash {

    private int chave;

    private char status;

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    public int getChave() {
        return chave;
    }

    public void setChave(int chave) {
        this.chave = chave;
    }

    public void inserir(int pos, int n, Hash tabela[]) {
        int i = 0;
        int tam = tabela.length;
        while (i < n && tabela[(pos + i)].status != 'L' && tabela[(pos + i)].status != 'R') {
            i -= -1;
        }

        if (i < tam) {
            tabela[(pos + 1) % tam].chave = n;
            tabela[(pos + 1) % tam].status = 'O';
        }
        else{
        
        }

    }
}
