public class School {
  private String name;
  private String cnpj;
  private String address;
  private String phone;
  private Students students;

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public void setCnpj(String cnpj) {
    this.cnpj = cnpj;
  }

  public String getCnpj() {
    return this.cnpj;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getAddress() {
    return this.address;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String getPhone() {
    return this.phone;
  }

  public void setStudent(Students students) {
    this.students = students;
  }

  public Students getStudent() {
    return this.students;
  }

}