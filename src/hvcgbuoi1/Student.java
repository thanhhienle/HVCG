/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hvcgbuoi1;

public  class Student {
    private String ten;
   
    public String getTen() {
      
        return ten;
    }

    public Student(String ten) {
        this.ten = ten;
    }
 
 public void setTen(String ten) {
        this.ten = ten;
    }

    @Override
    public boolean equals(Object obj) {
      
        return this.ten.equals(((Student)obj).ten); //To change body of generated methods, choose Tools | Templates.
    }

}
