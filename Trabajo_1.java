/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.trabajo_1;

import java.util.Scanner;

/**
 *
 * @author Stiven
 */
public class Trabajo_1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int EDJUAN, EDALBER, EDANA,EDMAMA;
        System.out.println("Ingrese la edad de Juan");
        EDJUAN = scan.nextInt();
        EDALBER = 2*EDJUAN/3;
        EDANA = 4*EDJUAN/3;
        EDMAMA = EDALBER + EDJUAN +EDANA;
        System.out.println("Las Edades son: \nMamá: " + EDMAMA + "\nAna: " + EDANA + "\nJuan: " + EDJUAN + "\nAlberto: " + EDALBER);

    }
}
