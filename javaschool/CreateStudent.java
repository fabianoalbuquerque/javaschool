public class CreateStudent {
  public static void main(String[] args) {
    School school = new School();
    Students student = new Students();
    school.setStudent(student);

    school.setCnpj("27.132.817/0001-70");
    school.setName("Escola Java Experts");
    school.setAddress("Rua do ABC, 815 - Belém, Pará");
    school.setPhone("91 3225-4568");

    student.setId(1L);
    student.setName("Fabiano Albuquerque");
    student.setRg("6663224");
    student.setCpf("004.204.852-44");
    student.setCourse("Java para iniciantes");
    student.setPhone("92 98460-0010");

    System.out.println("CNPJ: " + school.getCnpj());
    System.out.println("Nome da Escola: " + school.getName());
    System.out.println("Endereço da Escola: " + school.getAddress());
    System.out.println("Contato: " + school.getPhone());
    System.out.println("==================================================");
    System.out.println("ID Aluno: " + school.getStudent().getId());
    System.out.println("Nome do Aluno: " + school.getStudent().getName());
    System.out.println("RG do Aluno: " + school.getStudent().getRg());
    System.out.println("CPF do Aluno: " + school.getStudent().getCpf());
    System.out.println("Curso: " + school.getStudent().getCourse());
    System.out.println("Contato: " + school.getStudent().getPhone());
  }
}
