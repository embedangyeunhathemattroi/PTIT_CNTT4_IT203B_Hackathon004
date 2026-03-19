package rco.presentation;

import rco.business.CourseBusiness;
import java.util.Scanner;

public class CourseManagement {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        CourseBusiness business = CourseBusiness.getInstance();

        while (true) {
            try {
                System.out.println("\n------ QUAN LY KHOA HOC ------");
                System.out.println("1. Hien thi danh sach");
                System.out.println("2. Them khoa hoc");
                System.out.println("3. Cap nhat theo ma");
                System.out.println("4. Xoa theo ma");
                System.out.println("5. Tim theo giang vien");
                System.out.println("6. Loc khoa hoc dang mo");
                System.out.println("7. Sap xep theo hoc phi giam dan");
                System.out.println("8. Thoat");

                System.out.print("Chon: ");
                int choice = Integer.parseInt(scanner.nextLine());

                switch (choice) {

                    case 1:
                        business.displayAll();
                        break;

                    case 2:
                        try {
                            do {
                                business.addCourse(scanner);
                                System.out.print("Them tiep? (Y/N): ");
                            } while (scanner.nextLine().equalsIgnoreCase("Y"));
                        } catch (Exception e) {
                            System.out.println("Loi khi them khoa hoc!");
                        }
                        break;

                    case 3:
                        try {
                            System.out.print("Nhap ID can cap nhat: ");
                            String id = scanner.nextLine();
                            business.updateCourse(id, scanner);
                        } catch (Exception e) {
                            System.out.println("Loi cap nhat!");
                        }
                        break;

                    case 4:
                        try {
                            System.out.print("Nhap ID can xoa: ");
                            String id = scanner.nextLine();
                            business.deleteCourse(id);
                        } catch (Exception e) {
                            System.out.println("Loi xoa!");
                        }
                        break;

                    case 5:
                        try {
                            System.out.print("Nhap ten giang vien: ");
                            String keyword = scanner.nextLine();
                            business.searchByInstructor(keyword);
                        } catch (Exception e) {
                            System.out.println("Loi tim kiem!");
                        }
                        break;

                    case 6:
                        business.filterActiveCourse();
                        break;

                    case 7:
                        business.sortByFeeDesc();
                        break;

                    case 8:
                        System.out.println("Thoat!");
                        return;

                    default:
                        System.out.println("Lua chon khong hop le!");
                }

            } catch (Exception e) {
                System.out.println("Nhap sai dinh dang! Vui long nhap lai.");
            }
        }
    }
}