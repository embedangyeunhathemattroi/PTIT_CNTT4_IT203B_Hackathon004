import java.util.Scanner;

public class Course {
    // 1:xay dung cac thuc the(Package rco.entity)
    // xay dung lop Course gom cac thuoc tinh
    // courseId(String):Ma Khoa hoc, dinh dang CO+3 so ko dc trung lap
    // courseName(String):Ten khoa học
    // credit (int):so tin chi, phai lon hon 0 va nho hon 10
    // tuitionFee(double):hoc phi (VND),phai lon hon 0
    // instructor(String):Giang vien phu trach, ko dc de trong
    // status(boolean):trang thai khoa hoc(true dang mo,false da dong)
    private String courseId;
    private String courseName;
    private int credit;
    private double tuitionFee;
    private boolean status;
    private String instructor;

    public Course() {
    }

    public Course(String courseId, String courseName, int credit, double tuitionFee, boolean status) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.credit = credit;
        this.tuitionFee = tuitionFee;
        this.status = status;
    }

    // getter-setter
    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    };

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public int getTuitionFee() {
        return tuitionFee;
    }

    public void setTuitionFee(double tuitionFee) {
        this.tuitionFee = tuitionFee;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(string instructor) {
        this.instructor = instructor;
    }

    // tao inputData(Scanner scanner) để nhập thông tin khoa hoc tu ban phim va co
    // validate du lieu (sai thi nhap lai dc)
    public void inputData(Scanner scanner) {

        System.out.print("Nhap Id dung dinh dang(vdu CO+3): ");
        this.courseId = scanner.nextLine();

        System.out.print("Nhập ten khoa hoc toi thieu 5 ky tu va ko duoc de trong: ");
        this.courseName = scanner.nextLine();
        try {
            System.out.println("Nhap vao ten giang vien phu trach cua ban, ko dc de trong");
            this.instructor = scanner.nextLine();
            if (instructor != null) {
                this.instructor = instructor;
                break;

            } else {
                System.out.println("ko dc de trong");
            }

        } catch (Exception e) {
            System.out.println("Sai định dạng!");
        }

        while (true) {
            try {
                System.out.print("Nhập so tin chi (0-10): ");
                int credit = Integer.parseInt(scanner.nextLine());
                if (credit < 0 && credit <= 10) {
                    this.credit = credit;
                    break;
                } else {
                    System.out.println("tin chi phải >0 va nho hon 10 !");
                }
            } catch (Exception e) {
                System.out.println("Sai định dạng!");
            }
        }

        while (true) {
            try {
                System.out.println("Nhap vao so hoc phi(VND) phai lon hon 0");
                double tuitionFee = Double.parseDouble(scanner.nextLine());
                if (tuitionFee > 0) {
                    this.tuitionFee = tuitionFee;
                    break;

                } else {
                    System.out.println("hoc phi phai lon hon 0,nhap lai");

                }
            } catch (Exception e) {
                System.out.println("Sai định dạng!");

            }
        }

        while (true) {

            System.out.println("ban hay nhap vao trang thai cua khoa hoc ");
            boolean status = Boolean.valueOf();
            if (status == true) {
                System.out.println("Khoa hoc nay dang dc dien ra");
            } else {
                System.out.println("Khoa hoc nay dang dc ko ton tai");
            }
        }
        // displayData():Hien thi thong tin hoc duoi dang bang ro rang

    }

    public void displayData() {
        System.out.printf("| %-5s | %-15s | %-3d | %-6s | %-5.2f |\n",
                courseId, ourseName, credit, tuitionFee, status);
    }
}