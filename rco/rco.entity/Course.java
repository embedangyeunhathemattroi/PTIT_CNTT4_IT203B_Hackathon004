package rco.entity;

import java.util.Scanner;

public class Course {
    private String courseId;
    private String courseName;
    private int credit;
    private double tuitionFee;
    private boolean status;
    private String instructor;

    public Course() {
    }

    // Getter - Setter
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
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public double getTuitionFee() {
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

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    // Input
    public void inputData(Scanner scanner) {

        // courseId
        while (true) {
            System.out.print("Nhap ID (COxxx): ");
            String id = scanner.nextLine();
            if (id.matches("CO\\d{3}")) {
                this.courseId = id;
                break;
            } else {
                System.out.println("Sai dinh dang! VD: CO001");
            }
        }

        // courseName
        while (true) {
            System.out.print("Nhap ten khoa hoc (>=5 ky tu): ");
            String name = scanner.nextLine();
            if (name != null && name.trim().length() >= 5) {
                this.courseName = name;
                break;
            } else {
                System.out.println("Ten khong hop le!");
            }
        }

        // instructor
        while (true) {
            System.out.print("Nhap giang vien: ");
            String ins = scanner.nextLine();
            if (ins != null && !ins.trim().isEmpty()) {
                this.instructor = ins;
                break;
            } else {
                System.out.println("Khong duoc de trong!");
            }
        }

        // credit
        while (true) {
            try {
                System.out.print("Nhap tin chi (1-9): ");
                int credit = Integer.parseInt(scanner.nextLine());
                if (credit > 0 && credit < 10) {
                    this.credit = credit;
                    break;
                } else {
                    System.out.println("Phai >0 va <10");
                }
            } catch (Exception e) {
                System.out.println("Sai dinh dang!");
            }
        }

        // tuitionFee
        while (true) {
            try {
                System.out.print("Nhap hoc phi (>0): ");
                double fee = Double.parseDouble(scanner.nextLine());
                if (fee > 0) {
                    this.tuitionFee = fee;
                    break;
                } else {
                    System.out.println("Phai >0");
                }
            } catch (Exception e) {
                System.out.println("Sai dinh dang!");
            }
        }

        // status
        while (true) {
            System.out.print("Trang thai (true: mo / false: dong): ");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("true") || input.equalsIgnoreCase("false")) {
                this.status = Boolean.parseBoolean(input);
                break;
            } else {
                System.out.println("Nhap true hoac false!");
            }
        }
    }

    // Display
    public void displayData() {
        System.out.printf("| %-6s | %-20s | %-2d | %-10.2f | %-5s | %-15s |\n",
                courseId, courseName, credit, tuitionFee, status, instructor);
    }
}