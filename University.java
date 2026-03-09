class University {

static int totalStudents;
static String universityName;

static {
universityName = "Saffrony Institute of Technology"; totalStudents = 0;
System.out.println("Static Block Executed: University Initialized");
}

{
System.out.println("Instance Block Executed: Student Object is Being Created"); }
 
University() {
totalStudents++;
System.out.println("Constructor Executed: Student Object Created"); 
}

static int getTotalStudents() {
return totalStudents; }

public static void main(String[] args) {
System.out.println("Main Method Started");
System.out.println("University Name: " + universityName);
University s1 = new University(); 
University s2 = new University(); 
University s3 = new University();
System.out.println("\nTotal Students: " + getTotalStudents()); 
}
}