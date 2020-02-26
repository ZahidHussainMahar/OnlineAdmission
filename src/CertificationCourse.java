public class CertificationCourse {
    private Candidate candidate;

    public CertificationCourse() {
    }

    public CertificationCourse(Candidate candidate)
    {
        this.candidate = candidate;
    }

    public void displayCourses()
    {
        System.out.println("\nCertification Courses:");
        System.out.println("\n\t4. Computer Graphics");
        System.out.println("\t5. Islamic Banking");
        System.out.println("\t6. Electronic Robotics");
    }

    public void computerGraphics()
    {
        System.out.println("Cousre Name: Computer Graphics\nCourse Fees: 12000\nCourse Duration: 3 Months");
    }

    public void islamicBanking()
    {
        System.out.println("Cousre Name: Islamic Banking\nCourse Fees: 12000\nCourse Duration: 3 Months");
    }

    public void electronicRobotic()
    {
        System.out.println("Cousre Name: Electronic Robotics\nCourse Fees: 12000\nCourse Duration: 3 Months");
    }

}
