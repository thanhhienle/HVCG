/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hvcgbuoi1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Hien
 */
public class HVCGBuoi1 {

	public static void main(String[] args) {
        ArrayList<Student> listStudent = new ArrayList<>();
        
        boolean keepRunning = true;
        Scanner scan = new Scanner(System.in);
        while (keepRunning) {
            showMenu();
            String chon = scan.nextLine();
            switch (chon) {
            case "1":
                if (listStudent.isEmpty()) {
                    System.out.println("Danh sach chua co sinh vien");
                } else {
                    listStudent.forEach((s) -> {
                        System.out.println(s.getTen());
                });
                }                
                break;
            case "2":
                String ten = scan.nextLine();
                Student sv = new Student(ten);
                listStudent.add(sv);
                break;
            case "3":
                System.out.println("Nhap ten SV can xoa");
                int count = 0;
                String tenXoa = scan.nextLine();
                Student s = new Student(tenXoa); 
                if (!listStudent.remove(s)) {
                    System.out.println("Ten SV khong co trong danh sach");
                }
                break;
            default:
                keepRunning = false;
                break;
            }  

        }
        scan.close();

    }

    public static void showMenu() {
        System.out.println("1. xem danh sach sinh vien");
        System.out.println("2. them sinh vien");
        System.out.println("3. xoa sinh vien");

    }

}
