import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("------- Manu Bar ------");
            System.out.println("1. Add a student");
            System.out.println("2. Edit student by id");
            System.out.println("3. Remove student by id");
            System.out.println("4. Find student by id");
            System.out.println("5. Range student by average point");
            System.out.println("6. Find student who have maximum average point");
            System.out.println("0. Exit");
            System.out.print("Enter you choice: ");
            choice = scanner.nextInt();
            try {
                switch (choice){
                    case 1:
                        studentManager.addStudent();
                        break;
                    case 2:
                        studentManager.editStudentById();
                        break;
                    case 3:
                        studentManager.deleteStudentById();
                        break;
                    case 4:
                        studentManager.showStudentById(studentManager.getId());
                        break;
                    case 5:
                        break;
                    case 6:
                        break;
                }
            }catch (Exception e){
                System.err.println("Là số cơ mà !!!");
                System.out.println(e.getMessage());
            }

        }while (choice !=0);
    }
}
