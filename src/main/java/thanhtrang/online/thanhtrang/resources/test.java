/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thanhtrang.online.thanhtrang.resources;

import at.favre.lib.crypto.bcrypt.BCrypt;
import thanhtrang.online.thanhtrang.Model.Admin;
import thanhtrang.online.thanhtrang.dto.AdminDao;

/**
 *
 * @author thanhcom
 */
public class test {
    public static void main(String[] args) {
        String password = "12345678";
        String password1 = "laodaicaha11";
        String bcryptHashString = BCrypt.withDefaults().hashToString(12, password.toCharArray());
        System.out.println(bcryptHashString);
        BCrypt.Result result = BCrypt.verifyer().verify(password1.toCharArray(),bcryptHashString);
        System.out.println("SS:"+result.verified);
        
        AdminDao dao = AdminDao.getInstance();
        Admin A = dao.FinByUserName("thanhcom");
        if(A!=null)
        {
            System.out.println("User:"+A.getFullname());
        }
    }
    
}
