import dominio.Bootcamp;
import dominio.Curso;
import dominio.Dev;
import dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso = new Curso();

        curso.setTitulo("Curso Java");
        curso.setDescricao("Descrição do curso");
        curso.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo("titulo mentoria");
        mentoria.setDescricao("descrição mentoria");
        mentoria.setData(LocalDate.now());

//        System.out.println(curso);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(mentoria);

        Dev devGabriel = new Dev();

        devGabriel.setNome("Gabriel");
        devGabriel.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos" + devGabriel.getConteudosInscritos());
        devGabriel.progredir();
        System.out.println("Conteudos concluidos" + devGabriel.getConteudosConcluidos());
        System.out.println("XP: " + devGabriel.calcularTotalXp());

        Dev devPedro = new Dev();

        devPedro.setNome("Gabriel");
        devPedro.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos" + devPedro.getConteudosInscritos());
        devPedro.progredir();
        System.out.println("Conteudos concluidos" + devPedro.getConteudosConcluidos());
        System.out.println("XP: " + devPedro.calcularTotalXp());

    }
}