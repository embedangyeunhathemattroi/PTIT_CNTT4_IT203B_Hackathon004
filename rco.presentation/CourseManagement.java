import java.util.*;
import java.util.Scanner;

public class CourseManagement {
    public void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("------QUAN LY KHOA HOC ------");
            System.out.println("1: hien thi danh sach toan bo khoa hoc");
            System.out.println("2,Them khoa hoc");
            System.out.println("3: Cap nhat thong tin khoa hoc theo ma");
            System.out.println("4: Xoa khoa hoc theo ma");
            System.out.println("5,tim kiem khoa hoc theo ten giang vien");
            System.out.println("6:loc khoa hoc dang mo");
            System.out.println("7:Sap xep khoa hoc theo hoc phi giam dan");
            System.iut.println("8:thoat");
            int choice = 0;
            try {
                switch (choice) {
                    case 1:
                        displayAll();

                        break;

                    case 2:
                        // sau khi them khoa hoc hoi: Ban co muon them tiep ko (Y/N)-Y tiep tuc, khac
                        // quay ve menu
                        System.out.println("Ban co muon them khoa hoc khac vao ko(Y/N");
                        if (Y) {
                            adddCourse();
                        } else {
                            break;
                        }
                    case 3:
                        System.out.println("Nhap khoa hoc can cap nht ");
                        if (courseId != null) {
                            // cho phep chon truong cap nhat:Ten- dchi-hoc phi-Giang vien -trang thai( neu
                            // bo trong- giu nguyen trc khi sua)
                            System.out.prinln("Hay cap nhat:Ten- dchi-hoc phi-Giang vien -trang thai");
                            updateCourse();
                            System.out.println(" Cap nhat thanh cong ");
                        } else {
                            System.out.println("Ma khoa hoc khong ton tai");
                        }
                        break;

                    case 4:
                        // neu ko tim thay thì in ra"Ma khoa hoc ko ton tai"
                        System.out.println("Nhap ma khoa can xoa ");
                        if (courseId != null) {
                            deleteCourse();
                        } else {
                            System.out.println("Ma khoa hoc khong ton tai");
                        }
                        break;
                    case 5:
                        System.out.println("Tim kiem khoa hoc theo ten giang vien");
                        searchByInstructor();
                        break;

                    case 6:
                        System.out.println("Loc khoa hoc dang mo");
                        filterActiveCourse();
                        break;

                    case 7:
                        System.out.println("Sap xep khoa hoc theo hoc phi giam dan");
                        sortByFeeDesc();
                        break;

                    case 8:
                        System.out.println("Thoat chuong trinh");

                        break;

                    default:
                        System.out.println("Chuong trinh ket thuc, hen gap lai");

                }

            } catch (Exception e) {
                System.out.println("Sai dinh dang theo chuong !");
            }

        }
    }

}
