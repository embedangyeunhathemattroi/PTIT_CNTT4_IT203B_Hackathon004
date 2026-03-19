package rco.business;

import rco.entity.Course;
import java.util.*;
import java.util.stream.Collectors;

public class CourseBusiness {

    // Singleton
    private static CourseBusiness instance;

    private List<Course> list;

    private CourseBusiness() {
        list = new ArrayList<>();
    }

    public static CourseBusiness getInstance() {
        if (instance == null) {
            instance = new CourseBusiness();
        }
        return instance;
    }

    // 1. Hiển thị tất cả
    public void displayAll() {
        if (list.isEmpty()) {
            System.out.println("Danh sach rong!");
            return;
        }

        System.out.println("===== DANH SACH KHOA HOC =====");
        list.forEach(Course::displayData);
    }

    // 2. Thêm khóa học
    public void addCourse(Scanner scanner) {
        Course course = new Course();

        while (true) {
            course.inputData(scanner);

            boolean isExist = list.stream()
                    .anyMatch(c -> c.getCourseId().equals(course.getCourseId()));

            if (isExist) {
                System.out.println("Trung ma! Nhap lai...");
            } else {
                list.add(course);
                System.out.println("Them moi thanh cong!");
                break;
            }
        }
    }

    // 3. Cập nhật
    public void updateCourse(String id, Scanner scanner) {

        Optional<Course> optional = list.stream()
                .filter(c -> c.getCourseId().equals(id))
                .findFirst();

        if (!optional.isPresent()) {
            System.out.println("Khong tim thay khoa hoc!");
            return;
        }

        Course course = optional.get();

        while (true) {
            System.out.println("1. Ten khoa hoc");
            System.out.println("2. Tin chi");
            System.out.println("3. Hoc phi");
            System.out.println("4. Giang vien");
            System.out.println("5. Trang thai");
            System.out.println("0. Thoat");

            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    System.out.print("Nhap ten moi: ");
                    course.setCourseName(scanner.nextLine());
                    break;
                case 2:
                    System.out.print("Nhap tin chi: ");
                    course.setCredit(Integer.parseInt(scanner.nextLine()));
                    break;
                case 3:
                    System.out.print("Nhap hoc phi: ");
                    course.setTuitionFee(Double.parseDouble(scanner.nextLine()));
                    break;
                case 4:
                    System.out.print("Nhap giang vien: ");
                    course.setInstructor(scanner.nextLine());
                    break;
                case 5:
                    System.out.print("Nhap trang thai (true/false): ");
                    course.setStatus(Boolean.parseBoolean(scanner.nextLine()));
                    break;
                case 0:
                    System.out.println("Cap nhat xong!");
                    return;
                default:
                    System.out.println("Sai lua chon!");
            }
        }
    }

    // 4. Xóa
    public void deleteCourse(String id) {

        boolean removed = list.removeIf(c -> c.getCourseId().equals(id));

        if (removed) {
            System.out.println("Xoa thanh cong!");
        } else {
            System.out.println("Khong tim thay!");
        }
    }

    // 5. Tìm theo giảng viên
    public void searchByInstructor(String keyword) {

        List<Course> result = list.stream()
                .filter(c -> c.getInstructor().toLowerCase().contains(keyword.toLowerCase()))
                .collect(Collectors.toList());

        if (result.isEmpty()) {
            System.out.println("Khong tim thay!");
        } else {
            result.forEach(Course::displayData);
            System.out.println("Tong ket qua: " + result.size());
        }
    }

    // 6. Sắp xếp học phí giảm dần
    public void sortByFeeDesc() {

        list.stream()
                .sorted((a, b) -> Double.compare(b.getTuitionFee(), a.getTuitionFee()))
                .forEach(Course::displayData);
    }

    // 7. Lọc khóa học đang mở
    public void filterActiveCourse() {

        List<Course> result = list.stream()
                .filter(Course::getStatus)
                .collect(Collectors.toList());

        if (result.isEmpty()) {
            System.out.println("Khong co khoa hoc dang mo!");
        } else {
            result.forEach(Course::displayData);
        }
    }
}