public class Cliente {

    public static void main(String[] args) throws NullPointerException {
        //Criando uma figura  a partir do nome escolhido
        FiguraFactory figurafactory;
        figurafactory = FiguraFactory.factory("Triangulo");
        FiguraInterface figura =null;
        figura = figurafactory.pegarFigura();
        System.out.println(figura);

        //Exibindo o nome da figura
        figura.descricao();

        //Exibindo figuras em sequencia
        //figurafactory.sequencia();
    }
}
