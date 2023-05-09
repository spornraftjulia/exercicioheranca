public class FuncAdm extends Funcionario{

    public void setSetor(String setor) {
        this.setor = setor;
    }
    
    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
    
    public String getSetor(){
        return setor;
    }
    
    public String getFuncao(){
        return funcao;
    }
    
    public FuncAdm(String nome, int idade, String endereco, double salario, String setor, String funcao){
        super(nome, idade, endereco, salario);
    
        this.setor = setor;
        this.funcao = funcao;
    }
    public FuncAdm();
}
