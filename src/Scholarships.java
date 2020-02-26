public class Scholarships {
    private Administrator administrator;

    public Scholarships() {
    }

    public Scholarships(Administrator administrator)
    {
        this.administrator = administrator;
    }

    public void showScholarships()
    {
        System.out.println("\nScholarships Offered: ");
        System.out.println("\n\t1. Need Based Scholarship");
        System.out.println("\n\t2. Kinship Scholarship");
    }

    public void needBased()
    {
        System.out.println("Scholarship: Need Based Scholarship\nScholarship Discount: Depends on Academic Performance");
    }

    public void onKinship()
    {
        System.out.println("Scholarship: Kinship Scholarship\nScholarship Discount: 25%");
    }

}
