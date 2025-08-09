package br.com.dio.desafio.dominio;


import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
       Curso curso1 = new Curso();
       curso1.setTitulo("Curso java");
       curso1.setDescricao("Descrição curso java");
       curso1.setCargaHoraria(8);


        Curso curso2 = new Curso();
        curso2.setTitulo("Curso js");
        curso2.setDescricao("Descrição curso js");
        curso2.setCargaHoraria(4);


        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("mentoria de java");
        mentoria1.setDescricao("descrição mentoria java");
        mentoria1.setData(LocalDate.now());


//        System.out.println(mentoria1);
//        System.out.println(curso1);
//        System.out.println(curso2);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java");
        bootcamp.setDescricao("Descrição bootcamp java massa");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev dev1 = new Dev();
        dev1.setNome("Weslley");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos "+dev1.getNome()+": "+ dev1.getConteudosInscritos());
        dev1.progredir();
        dev1.progredir();
        dev1.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos "+dev1.getNome()+": "+ dev1.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos "+dev1.getNome()+": "+ dev1.getConteudosConcluidos());
        System.out.println("XP "+dev1.getNome()+": "+ dev1.calcularTotalXp());

        System.out.println("-----------------------------------");
        Dev dev2 = new Dev();
        dev2.setNome("João");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos "+dev2.getNome()+": "+ dev2.getConteudosInscritos());
        dev2.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos "+dev2.getNome()+": "+ dev2.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos "+dev2.getNome()+": "+ dev2.getConteudosConcluidos());
        System.out.println("XP "+dev2.getNome()+": "+ dev2.calcularTotalXp());












    }
}