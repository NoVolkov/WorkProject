/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HW;

/**
 *
 * @author волков_ва
 */
public class Department {
    String name;
    public Worker boss;

    public Department(String name, Worker boss) {
        this.name = name;
        this.boss = boss;
    }
}
