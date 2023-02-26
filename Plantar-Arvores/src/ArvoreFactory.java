import java.util.HashMap;
import java.util.Map;

public class ArvoreFactory {

    private static final Map<String, Arvore> flyweight = new HashMap<>();

    public Arvore getArvore(int largura, int altura, String cor){

        String id = "id" + largura + " : " + altura + " : " + cor;

        System.out.println(id);

        if(!flyweight.containsKey(id)){
            Arvore  arvore = new Arvore (largura, altura, cor);
            flyweight.put(id,arvore);
            System.out.println("Arvore Plantada");
        }else{
            System.out.println("Arvore com este padrão já existente");
        }

        return flyweight.get(id);
    }
}



/*Você precisa de um sistema que mostre 1.000.000 de árvores, metade vermelhas e metade verdes e,
em seguida, imprima na tela as árvores e quanta memória está sendo utilizada.
 */

