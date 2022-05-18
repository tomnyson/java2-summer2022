
import dto.Product;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tomnyson
 */
public class main {
    public static void main(String[] args) {
        Product product = new Product();
        
        product.setName("điện thoại 13px");
        product.setDescription("iphone");
        product.setPrice(1500);
        product.setStatus(true);
        product.xuatThongTin();
    }
}
