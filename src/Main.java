import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de java");
        mentoria.setDescricao("Descrição mentoria de java");
        mentoria.setData(LocalDate.now());

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de java");
        mentoria1.setDescricao("Descrição mentoria de java");
        mentoria1.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("descricao Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devMaria = new Dev();
        devMaria.setNome("Maria");
        devMaria.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Maria: " + devMaria.getConteudosIncritos());
        devMaria.progredir();
        System.out.println("-");
        System.out.println("Conteudos concluidos Maria: " + devMaria.getConteudosConcluidos());
        System.out.println("XP Maria - " + devMaria.calcularTotalXp());
        System.out.println(" ");
        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Joao: " + devJoao.getConteudosIncritos());
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteudos concluidos Joao: " + devJoao.getConteudosConcluidos());
        System.out.println("XP Joao - " + devJoao.calcularTotalXp());







//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);
//        System.out.println(mentoria1);
    }
}
