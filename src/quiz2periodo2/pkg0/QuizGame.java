package quiz2periodo2.pkg0;

import java.util.Scanner;

public class QuizGame {
    private Questao[] perguntas;
    
    public QuizGame() {
        inicializarPerguntas();
    }
    
    private void inicializarPerguntas() {
     String q1 ="1) A Segunda Grande Guerra (1939-1945) adquiriu caráter mundial a partir de 7 de dezembro de 1941, quando:\n" +
                "(a) Os russos tomaram a iniciativa de anexar os Estados Bálticos.\n" +
                "(b) Os alemães invadiram o litoral mediterrâneo da África.\n" +
                "(c) Os japoneses atacaram a base norte-americana de Pearl Harbor.\n" +
                "(d) Os franceses, por determinação do marechal Pétain, ocuparam o Sudeste da Ásia.\n";
    
     String q2 ="2) Uma das principais causas da Segunda Guerra Mundial foi:\n" +
                 "(a) A rivalidade política e militar entre Alemanha e Itália no final da década de 1930.\n" +
                 "(b) O surgimento e fortalecimento, na década de 1930, de governos totalitários na Europa, com objetivos expansionistas e militaristasa\n" +
                 "(c) A política expansionista da França, que invadiu e conquistou vários territórios na Europa e na África no final da década de 1930.\n" +
                 "(d) A aliança militar estabelecida por Itália, Alemanha e Estados Unidos no começo da década de 1930.";
    
     String q3 ="3) Como foi a participação do Brasil na Segunda Guerra Mundial ?\n" +
                "(a) O Brasil participou enviando apenas medicamentos e médicos para ajudar os feridos de guerra das tropas aliadas.\n" +
                "(b) O Brasil ficou ao lado do Eixo e enviou soldados que combateram as forças aliadas em território italiano. \n" +
                "(c) O Brasil participou apenas fazendo a proteção do litoral e enviando armamentos às forças aliadas.\n" +
                "(d) O Brasil enviou soldados que combateram ao lado dos Aliados, principalmente em territórios da Itália.";
    
     String q4 ="4) O que aconteceu no evento conhecido como Dia D ?\n" +
                "(a) A invasão alemã no território francês em 1940\n" +
                "(b) A invasão da Normandia pelas tropas aliadas em 1944.\n" +
                "(c) A ocupação da Polônia pela Alemanha em 1939.\n" +
                "(d) A ocupação do território alemão pelas tropas dos Estados Unidos em 1945.";
    
     String q5 ="5) Em 1939, foi assinado o Tratado de não agressão Germano-Soviético. Qual o nome deste tratado?\n" +
                "(a) Pacto Molotov-Ribbentrop\n" +
                "(b) Pacto de Varsóvia\n" +
                "(c) Tratado de Guerra da Alemanha.\n" +
                "(d) Acordo Econômico germano-soviético.";
     
     String q6 = "6) Com relação aos eventos que compõem a Segunda Guerra Mundial, assinale a alternativa correta:\n"+
                 "(a) O pacto de não agressão nazi-soviético, firmado antes do início dos conflitos, serviu aos interesses de Stalin de organização de seu exército e posterior invasão da Polônia e Áustria.\n"+
                 "(b) Os exércitos nazistas comandados por Hitler tiveram problemas para manter os inúmeros frontes de batalha criados após o período da guerra relâmpago (Blitzkrieg), principalmente pela ineficiência dos exércitos que compunham o Eixo.\n"+
                 "(c) A guerra na África vencida pelos alemães foi o fator decisivo para que os exércitos nazistas pudessem alcançar o Canal da Mancha e infringir sérios danos à cidade de Londres por meio dos bombardeios da Luftwaffe.\n"+
                 "(d) Os aliados começaram a contraofensiva ao Eixo pela península Balcânica, invadindo as ilhas gregas e depois promovendo a libertação total do território da Grécia.";
                     
     String q7 = "7)Inúmeras foram as guerras realizadas na história da humanidade. Umas curtas, outras longas, umas com poucos mortos, outras com milhões. Com certeza, a maior no quesito mortes foi a Segunda Guerra Mundial. Indique a alternativa que não é considerada uma de suas causas:\n"+
                 "(a) Tratado de Versalhes.\n" +
                 "(b) Corrida Armamentista.\n" +
                 "(c) Revanchismo Francês frente à Alemanha.\n" +
                 "(d) Imperialismo Italiano.";
 
     String q8 = "8)Sobre a participação do Brasil na Segunda Guerra, marque a alternativa correta.\n" +
                 "(a) Apoiando o grupo dos Aliados, o país teve uma importante participação na Batalha de Monte Castelo.\n" + 
                 "(b) Em oposição aos Estados Unidos, Vargas ficou, em primeiro momento, ao lado das potências do Eixo.\n" +
                 "(c) O país mostrou neutralidade até o fim do conflito, pois temia uma investida alemã.\n" + 
                 "(d) Após diversos ataques a navios brasileiros por parte dos alemães, Getúlio Vargas entrou no conflito, mas somente oferecendo auxílio na distribuição de suprimentos.";

     String q9 = "9)A guerra travada por Japão e China e que acontecia paralelamente à Segunda Guerra Mundial recebeu qual nome?\n" +
                 "(a) Primeira Guerra Sino-Japonesa\n" +
                 "(b) Segunda Guerra Sino-Japonesa\n" + 
                 "(c) Guerra do Ópio\n" + 
                 "(d) Guerra do Pacífico";
  
     String q10 = "10)Qual dos países abaixo não foi invadido pelos nazistas ao longo da Segunda Guerra Mundial?\n" +
                  "(a) Noruega\n" +
                  "(b) Iugoslávia\n" +
                  "(c) Bélgica\n" + 
                  "(d) Suíça";
    
     String q11= "11)Cidade soviética que foi cercada pelas tropas nazistas e foi deixada para que a população local morresse de fome:\n" + 
                 "(a) Moscou\n" + 
                 "(b) Leningrado\n" + 
                 "(c) Kiev\n" + 
                 "(d) Stalingrado";
    
     String q12= "12)A primeira grande derrota japonesa na Segunda Guerra Mundial ocorreu durante a/o:\n" + 
                 "(a) Batalha de Midway\n" + 
                 "(b) Batalha de Guadalcanal\n" + 
                 "(c) Batalha das Filipinas\n" + 
                 "(d) Invasão da Birmânia";
    
     String q13= "13)Qual das batalhas abaixo NÃO aconteceu na Segunda Guerra Mundial?\n" + 
                 "(a) Batalha das Ardenas\n" + 
                 "(b) Cerco a Budapeste\n" + 
                 "(c) Batalha de Berlim\n" + 
                 "(d) Batalha de Verdun\n";
                 
     String q14= "14)A ordem geopolítica do pós-Segunda Guerra Mundial articulou a bipolarização do poder entre\n" + 
                 "(a)Alemanha Ocidental e Alemanha Oriental, com a instituição do Muro de Berlim.\n" + 
                 "(b)Rússia e China, com a instituição do protecionismo econômico.\n" + 
                 "(c)Estados Unidos e União Soviética, com a chamada Guerra Fria.\n" + 
                 "(d)Coreia do Norte e Coreia do Sul, com a deflagração da Guerra da Coreia.";
    
     String q15= "15)Em relação à Segunda Guerra Mundial é correto afirmar que:\n" + 
                 "(a)Hitler empreendeu uma implacável perseguição aos judeus, que resultou na morte de seis milhões de pessoas.\n" + 
                 "(b)Os norte-americanos permaneceram neutros na guerra até 1941, quando bombardearam Hiroshima e Nagasaki.\n" + 
                 "(c)De Gaulle foi o chefe do governo de Vichy.\n" +
                 "(d)Com o ataque alemão a Pearl Harbor, os norte-americanos resolveram entrar na guerra.";

        perguntas = new Questao[]{
            new Questao(q1, "c"),
            new Questao(q2, "b"),
            new Questao(q3, "d"),
            new Questao(q4, "b"),
            new Questao(q5, "a"),
            new Questao(q6, "b"),
            new Questao(q7, "c"),
            new Questao(q8, "a"),
            new Questao(q9, "b"),
            new Questao(q10, "d"),
            new Questao(q11, "b"),
            new Questao(q12, "a"),
            new Questao(q13, "d"),
            new Questao(q14, "c"),
            new Questao(q15, "a")   
        };
    }

    public void iniciar() {
        int cont = 0;
        Scanner leia = new Scanner(System.in);

        for (Questao pergunta : perguntas) {
            System.out.println("================================================================================================");
            System.out.println(pergunta.prompt);
            System.out.print("Resposta: ");
            String resposta = leia.nextLine().toLowerCase();
            if (resposta.equals("a")||resposta.equals("b")||resposta.equals("c")||resposta.equals("d")) {
                //Verifica se a resposta é válida
                if (resposta.equals(pergunta.resposta)) {
                    System.out.println("Resposta correta!");
                    System.out.println("================================================================================================\n");
                    cont++;
                } else {
                    System.out.println("Resposta incorreta!");
                    System.out.println("A resposta correta é: " + pergunta.resposta);
                    System.out.println("================================================================================================\n");
                }
            } else {
                System.out.println("Resposta Inválida!");
                System.out.println("================================================================================================\n");
            }
        }  
        System.out.println("Você acertou " + cont +" de " + perguntas.length + ".");
    }
}
