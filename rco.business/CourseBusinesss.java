
//package rco.entity;
import java.util.*;
import java.util.Stream.collection;

public class CourseBusinesss {
    // tao lớp CourseBusiness quan lý danh sach List<Course>
    List<Course> list = new ArrayList<>();
    // design Pattern: ap dung Singleton Pattern de dam bao chi o 1 doi tuong quan
    // ly can sdung Stream API,Lambda, Optional
    // Singleton List =satic

    // 6 chuc nang chinh
    // sdung displayAll()Hien thi danh sách khoa hoc dang bang , dsach rong,in bao
    // loi
    public void displayAll() {

    }

    // addCourse(Scanner scanner) them moi khoa hoc kiem tra trung courseId ,neu
    // trung thi nhap lai
    public void addCourse(scanner scanner) {
    }

    // updateCourse(String id , Scanner scanner) cap nhat thong tin theo ma, cho
    // phep chọn truong cap nhap (tru mã), neu k tim thay bao loi
    public void updateCourse(String id, Scanner scanner) {

        System.out.println("Hay nhap ma khoa hoc can phai cap nhat");
        System.out.println("Hay nhap ten khoa hoc can phai cap nhat");
        System.out.println("Hay nhap so tin chi can dc cap nhat");
        System.out.println("nhap nhap hoc phi can thay doi");
        System.out.println("Hay nhap ten giang vien phu trach thay doi");
        System.out.println("Cap nhat lai trang thai khoa hoc");
        if (courseId != null) {
            System.out.println("khoa hoc da dc cap nhat lại thanh cong");

        } else {
            System.out.println("khoa hoc da dc ko tim thay , vui long nhap lai");

        }

    }

    // deleteCourse(String id)xoa theo ma .Neu ko tim thay -- bao loi
    public void deleteCourse(String id) {
        System.out.println("hay nhap ma Id khoa hoc can xoa");
        if (id != null) {
            id.remove();
        } else {
            System.out.println("ko tim thay, hay nhap lai id can xoa");

        }
    }

    // searchByInstructor(String keyword)//tim theo ten giang vien(chua tu khoa, ko
    // phan biet chu hoa thuong)-hthi danh sach kem tong so ket qua
    public void searchByInstructor(String keyword) {

    }

    // sortByFeeDesc() sap xep theo hoc phi giam dan va hien thi kqua
    public void sortByFeeDesc() {
        tuitionFee.sort();
    }

    // filterActiveCourse() loc cac khoa hoc dang mo(status= true) va hthi danh sach
    public void filterActiveCourse() {
        System.out.println("Hien thi ra khoa hoc dang mo dc loc");
        status.filter();
    }
}
