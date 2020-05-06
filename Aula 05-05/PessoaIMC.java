package PLPaula;

public class PessoaIMC {

    public String nome;
    public float peso;
    public float altura;

public float calcularIMC(){
    return (peso/altura*altura);
}

public String classificarIMC(){
    float imc;
    String classe;
    imc = calcularIMC();
    
    if(imc<=19){
        classe = "Abaixo do peso";
    }else if (imc<=25){
        classe="Peso ideal";
    }else if (imc<=30){
        classe="Acima do peso";
    }else if(imc<=35){
        classe="Obesidade leve";
    }else{
        classe="Obesidade";
    }

    return classe;
}
}