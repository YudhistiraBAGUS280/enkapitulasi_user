/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package enkap_user;

/**
 *
 * @author Yudis
 */
public class Enkap_User {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        user agus = new user ("HAHAY","hihiy",0,false);
        agus.setUsername("AGUS");
        agus.setPassword("Rtx");
        agus.setId(1);
        agus.setStatus(false);
    
        System.out.println("username:"+ agus.getUsername());
        System.out.println("password:"+agus.getPassword());
        System.out.println("ID:"+agus.getId());
        System.out.println("Status:"+agus.getStatus());
    }
    
}
