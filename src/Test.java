import java.util.Scanner;

public class Test {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        String name,fatherName,address,dob,cnic,lastQualification,marks,choice1;
        int choice, sholarshipChoice;

        Candidate candidate;
        Scholarships scholarships;
        CertificationCourse certificationCourse;
        FeeStructure feeStructure;

        candidate = new Candidate();
        candidate.displayDepartments();
        certificationCourse = new CertificationCourse();
        certificationCourse.displayCourses();
        feeStructure = new FeeStructure();
        scholarships = new Scholarships();

        System.out.println("\nEnter Your Input in Integer: ");
        choice = input.nextInt();

        switch (choice)
        {
            case 1:
                System.out.println("You are Applying for Department of Computer Science");
                System.out.println("Enter Your Name: ");
                input.nextLine();
                name = input.nextLine();
                System.out.println("Enter Your Father Name: ");
                fatherName = input.nextLine();
                System.out.println("Enter Your Address: ");
                address = input.nextLine();
                System.out.println("Enter Your DOB: ");
                dob = input.nextLine();
                System.out.println("Enter Your CNIC: ");
                cnic = input.nextLine();
                System.out.println("Enter Your Last Qualification: ");
                lastQualification = input.nextLine();
                System.out.println("Enter Your Marks:");
                marks = input.nextLine();
                candidate = new Candidate(name,fatherName,address,dob,cnic,lastQualification,marks);
                System.out.println("Are you wants to apply for Scholarship");
                System.out.println("Enter Y/N");
                choice1 = input.nextLine().toLowerCase();
                if (choice1.equals("y"))
                {
                    scholarships = new Scholarships();
                    scholarships.showScholarships();
                    sholarshipChoice = input.nextInt();
                    switch (sholarshipChoice)
                    {
                        case 1:
                            System.out.println(candidate.toString());
                            candidate.deptOfComputerScience();
                            feeStructure.feeStructureOfBSCS();
                            scholarships.needBased();
                            break;
                        case 2:
                            System.out.println(candidate.toString());
                            candidate.deptOfComputerScience();
                            feeStructure.feeStructureOfBSCS();
                            scholarships.onKinship();
                            break;
                        default:
                            System.out.println("Invalid Choice");
                            break;
                    }

                }
                else {
                    System.out.println(candidate.toString());
                    candidate.deptOfComputerScience();
                    feeStructure.feeStructureOfBSCS();
                }

                break;
            case 2:
                System.out.println("You are Applying for Department of Bio Science");
                System.out.println("Enter Your Name: ");
                input.nextLine();
                name = input.nextLine();
                System.out.println("Enter Your Father Name: ");
                fatherName = input.nextLine();
                System.out.println("Enter Your Address: ");
                address = input.nextLine();
                System.out.println("Enter Your DOB: ");
                dob = input.nextLine();
                System.out.println("Enter Your CNIC: ");
                cnic = input.nextLine();
                System.out.println("Enter Your Last Qualification: ");
                lastQualification = input.nextLine();
                System.out.println("Enter Your Marks:");
                marks = input.nextLine();
                candidate = new Candidate(name,fatherName,address,dob,cnic,lastQualification,marks);
                System.out.println("Are you wants to apply for Scholarship");
                System.out.println("Enter Y/N");
                choice1 = input.nextLine().toLowerCase();
                if (choice1.equals("y"))
                {
                    scholarships = new Scholarships();
                    scholarships.showScholarships();
                    sholarshipChoice = input.nextInt();
                    switch (sholarshipChoice)
                    {
                        case 1:
                            System.out.println(candidate.toString());
                            candidate.deptOfBioScience();
                            feeStructure.feeStructureOfBSBS();
                            scholarships.needBased();
                            break;
                        case 2:
                            System.out.println(candidate.toString());
                            candidate.deptOfBioScience();
                            feeStructure.feeStructureOfBSBS();
                            scholarships.onKinship();
                            break;
                        default:
                            System.out.println("Invalid Choice");
                            break;
                    }

                }
                else {
                    System.out.println(candidate.toString());
                    candidate.deptOfBioScience();
                    feeStructure.feeStructureOfBSBS();
                }

                break;
            case 3:
                System.out.println("You are Applying for Department of Electrical Engineering");
                System.out.println("Enter Your Name: ");
                input.nextLine();
                name = input.nextLine();
                System.out.println("Enter Your Father Name: ");
                fatherName = input.nextLine();
                System.out.println("Enter Your Address: ");
                address = input.nextLine();
                System.out.println("Enter Your DOB: ");
                dob = input.nextLine();
                System.out.println("Enter Your CNIC: ");
                cnic = input.nextLine();
                System.out.println("Enter Your Last Qualification: ");
                lastQualification = input.nextLine();
                System.out.println("Enter Your Marks:");
                marks = input.nextLine();
                candidate = new Candidate(name,fatherName,address,dob,cnic,lastQualification,marks);
                System.out.println("Are you wants to apply for Scholarship");
                System.out.println("Enter Y/N");
                choice1 = input.nextLine().toLowerCase();
                if (choice1.equals("y"))
                {
                    scholarships = new Scholarships();
                    scholarships.showScholarships();
                    sholarshipChoice = input.nextInt();
                    switch (sholarshipChoice)
                    {
                        case 1:
                            System.out.println(candidate.toString());
                            candidate.deptOfElectricalEngg();
                            feeStructure.feeStructureOfElectricalEngg();
                            scholarships.needBased();
                            break;
                        case 2:
                            System.out.println(candidate.toString());
                            candidate.deptOfElectricalEngg();
                            feeStructure.feeStructureOfElectricalEngg();
                            scholarships.onKinship();
                            break;
                        default:
                            System.out.println("Invalid Choice");
                            break;
                    }

                }
                else {
                    System.out.println(candidate.toString());
                    candidate.deptOfElectricalEngg();
                    feeStructure.feeStructureOfElectricalEngg();
                }
                break;
            case 4:
                System.out.println("You are Applying for Computer Graphics Course");
                System.out.println("Enter Your Name: ");
                input.nextLine();
                name = input.nextLine();
                System.out.println("Enter Your Father Name: ");
                fatherName = input.nextLine();
                System.out.println("Enter Your Address: ");
                address = input.nextLine();
                System.out.println("Enter Your DOB: ");
                dob = input.nextLine();
                System.out.println("Enter Your CNIC: ");
                cnic = input.nextLine();
                System.out.println("Enter Your Last Qualification: ");
                lastQualification = input.nextLine();
                System.out.println("Enter Your Marks:");
                marks = input.nextLine();
                candidate = new Candidate(name,fatherName,address,dob,cnic,lastQualification,marks);
                System.out.println(candidate.toString());
                certificationCourse.computerGraphics();

                break;
            case 5:
                System.out.println("You are Applying for Islamic Banking Course");
                System.out.println("Enter Your Name: ");
                input.nextLine();
                name = input.nextLine();
                System.out.println("Enter Your Father Name: ");
                fatherName = input.nextLine();
                System.out.println("Enter Your Address: ");
                address = input.nextLine();
                System.out.println("Enter Your DOB: ");
                dob = input.nextLine();
                System.out.println("Enter Your CNIC: ");
                cnic = input.nextLine();
                System.out.println("Enter Your Last Qualification: ");
                lastQualification = input.nextLine();
                System.out.println("Enter Your Marks:");
                marks = input.nextLine();
                candidate = new Candidate(name,fatherName,address,dob,cnic,lastQualification,marks);
                System.out.println(candidate.toString());
                certificationCourse.islamicBanking();
                break;
            case 6:
                System.out.println("You are Applying for Electronic Robotics Course");
                System.out.println("Enter Your Name: ");
                input.nextLine();
                name = input.nextLine();
                System.out.println("Enter Your Father Name: ");
                fatherName = input.nextLine();
                System.out.println("Enter Your Address: ");
                address = input.nextLine();
                System.out.println("Enter Your DOB: ");
                dob = input.nextLine();
                System.out.println("Enter Your CNIC: ");
                cnic = input.nextLine();
                System.out.println("Enter Your Last Qualification: ");
                lastQualification = input.nextLine();
                System.out.println("Enter Your Marks:");
                marks = input.nextLine();
                candidate = new Candidate(name,fatherName,address,dob,cnic,lastQualification,marks);
                System.out.println(candidate.toString());
                certificationCourse.electronicRobotic();
                break;
            default:
                System.out.println("Invalid Choice...");
                break;
        }
    }
}
