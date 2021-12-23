import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManager extends Students {
    List<Students> studentsList = new ArrayList<>();
    Students[] students;
    Scanner scanner = new Scanner(System.in);

    public void showStudentById(int id) {
        for (Students s : studentsList) {
            if (s.getId() == id) {
                System.out.println(String.format(" Id: %s \n Name: %s \n Age: %s \n Điểm Toán %s \n Điểm Lý: %s \n Điểm Hoá: %s \n Điểm Trung bình: %s",
                        s.getId(), s.getName(), s.getAge(), s.getDiemToan(), s.getDiemLy(), s.getDiemHoa(), s.getAvgPoint()));
                break;
            }
        }

    }

    public void addStudent() {
        boolean flagId = true;
        Students students = new Students();
        System.out.println("Nhập mã Sinh Viên: ");
        while (flagId) {
            int id = 0;
            try {
                id = Integer.parseInt(scanner.nextLine());
                for (Students s : studentsList) {
                    if (s.getId() == id) {
                        System.out.println("Id đã tồn tại !!!");
                        flagId = false;
                        break;
                    }
                    flagId = true;
                }
            } catch (Exception e) {
                System.out.println("Id là kiểu int!!!!");
                System.out.println(e.getMessage());
                flagId = false;
            }
            if (flagId) {
                students.setId(id);
                break;
            }
        }

        System.out.println("Nhập tên Sinh viên: ");
        String name = scanner.nextLine();
        while (flagId) {
            if (name == null || name.trim().equals("")) {
                System.err.println("Tên không hợp lệ!!!!");
                continue;
            }
            students.setName(name);
            break;
        }

        System.out.println("Nhập tuổi của sinh viên: ");
        try {
            int age = Integer.parseInt(scanner.nextLine());
            students.setAge(age);
        } catch (Exception e) {
            System.err.println("Tuổi là kiểu int nhá!!!!");
            System.out.println(e.getMessage());
        }

        System.out.println("Nhập điểm toán: ");
        try {
            double diemToan = scanner.nextDouble();
            students.setDiemToan(diemToan);
        } catch (Exception e) {
            System.err.println("Điểm nhập lỗi!!!");
            System.err.println(e.getMessage());
        }

        System.out.println("Nhập điểm lý: ");
        try {
            double diemLy = scanner.nextDouble();
            students.setDiemLy(diemLy);
        } catch (Exception e) {
            System.err.println("Điểm nhập lỗi!!!");
            System.err.println(e.getMessage());
        }

        System.out.println("Nhập điểm hoá: ");
        try {
            double diemHoa = scanner.nextDouble();
            students.setDiemHoa(diemHoa);
        } catch (Exception e) {
            System.err.println("Điểm nhập lỗi!!!");
            System.err.println(e.getMessage());
        }
        studentsList.add(students);
    }

    public void deleteStudentById() {
        System.out.println("Nhập mã sinh viên muốn xoá: ");
        try {
            List<Students> newStudent = new ArrayList<>();
            int id = Integer.parseInt(scanner.nextLine());
            for (Students s : studentsList) {
                if (s.getId() == id) {
                    continue;
                }
                newStudent.add(s);
            }
            studentsList = newStudent;
        } catch (Exception e) {
            System.err.println("Lỗi id !!!!");
            System.out.println(e.getMessage());
        }
    }

    public void editStudentById() {
        boolean flagEdit = false;
        System.out.println("Enter Id");
        try {

            int id = Integer.parseInt(scanner.nextLine());
            for (Students s : studentsList) {
                if (s.getId() == id) {
                    flagEdit = true;
                    System.out.println("Nhập tên mới cho sinh viên: ");
                    String name = scanner.nextLine();
                    while (true) {
                        if (name == null || name.trim().equals("")) {
                            System.out.println("Tên k hợp lệ!");
                            continue;
                        }
                        s.setName(name);
                        break;
                    }


                    System.out.println("Nhập tuổi mới : ");
                    try {
                        int age = Integer.parseInt(scanner.nextLine());
                        s.setAge(age);

                    } catch (Exception e) {
                        System.err.println("tuổi là kiểu int");
                        System.out.println(e.getMessage());
                    }

                    System.out.println("Nhập diểm toán mới: ");
                    try {
                        double diemToanMoi = scanner.nextDouble();
                        s.setDiemToan(diemToanMoi);
                    } catch (Exception e) {
                        System.err.println("Điểm mới lỗi!!!");
                        System.out.println(e.getMessage());
                    }

                    System.out.println("Nhập diểm lý mới: ");
                    try {
                        double diemLyMoi = scanner.nextDouble();
                        s.setDiemToan(diemLyMoi);
                    } catch (Exception e) {
                        System.err.println("Điểm mới lỗi!!!");
                        System.out.println(e.getMessage());
                    }

                    System.out.println("Nhập diểm hoá mới: ");
                    try {
                        double diemHoaMoi = scanner.nextDouble();
                        s.setDiemToan(diemHoaMoi);
                    } catch (Exception e) {
                        System.err.println("Điểm mới lỗi!!!");
                        System.out.println(e.getMessage());
                    }


                }
                if (!flagEdit) {
                    System.out.println(String.format("Không tìm thấy học sinh với id = %s", id));
                }

            }
        } catch (Exception e) {
            System.err.println("Id là kiẻu int cơ mà !!!!!");
            System.out.println(e.getMessage());
        }
    }
}
