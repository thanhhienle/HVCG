/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hvcgbuoi1;

/**
 *
 * @author Hien
 */
public class HSChuyenAnh extends Student implements StudentAction{

    

    @Override 
    public int getLuong() {
        return 2; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    public int getLuong(int type) {
        if(type==2){
            return 2;
        }
         if(type==1){
            return 4;
        }
        return 2; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void hoc() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


 
}
