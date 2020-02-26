import java.util.Scanner;

public class Candidate implements Administrator {
    private String name;
    private String fatherName;
    private String address;
    private String dob;
    private String cNIC;
    private String lastQualification;
    private String cGPA;

    public Candidate() {
    }

    public Candidate(String name, String fatherName, String address, String dob, String cNIC, String lastQualification, String cGPA) {
        this.name = name;
        this.fatherName = fatherName;
        this.address = address;
        this.dob = dob;
        this.cNIC = cNIC;
        this.lastQualification = lastQualification;
        this.cGPA = cGPA;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getcNIC() {
        return cNIC;
    }

    public void setcNIC(String cNIC) {
        this.cNIC = cNIC;
    }

    public String getLastQualification() {
        return lastQualification;
    }

    public void setLastQualification(String lastQualification) {
        this.lastQualification = lastQualification;
    }

    public String getcGPA() {
        return cGPA;
    }

    public void setcGPA(String cGPA) {
        this.cGPA = cGPA;
    }

    @Override
    public void displayDepartments() {
        System.out.println("Degree Program:");
        System.out.println("\n\t1. Departments Of Computer Science");
        System.out.println("\t2. Departments Of Bio Science");
        System.out.println("\t3. Departments Of Electrical Engineering");
    }

    @Override
    public void deptOfComputerScience()
    {
        System.out.println("Program: Computer Science");
        System.out.println("Program Duration: \n\tMin: 4 Years\n\tMax: 7 Years");
    }

    @Override
    public void deptOfBioScience()
    {
        System.out.println("Program: Bio Science");
        System.out.println("Program Duration: \n\tMin: 4 Years\n\tMax: 7 Years");
    }

    @Override
    public void deptOfElectricalEngg()
    {
        System.out.println("Program: Electrical Engineering");
        System.out.println("Program Duration: \n\tMin: 4 Years\n\tMax: 7 Years");
    }

    @Override
    public String toString() {
        return "Candidate{" +
                "\n\tName = '" + name + '\'' +
                "\n\tFather Name = '" + fatherName + '\'' +
                "\n\tAddress = '" + address + '\'' +
                "\n\tDOB = '" + dob + '\'' +
                "\n\tCNIC = '" + cNIC + '\'' +
                "\n\tLast Qualification = '" + lastQualification + '\'' +
                "\n\tCGPA = '" + cGPA + '\'' ;
    }
}
