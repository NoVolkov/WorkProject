/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HW;
/*
        Department dp=new Department("IT", null);
        Worker w1=new Worker("Петров", dp);
        Worker w2=new Worker("Козлов", dp);
        dp.boss=w2;
        Worker w3=new Worker("Сидоров", dp);
*/
/**
 *
 * @author волков_ва
 */
public class Worker {
    String name;
    Department dep;
    public Worker(String name, Department dep) {
        this.name = name;
        this.dep = dep;
    }

    @Override
    public String toString() {
        if(this==dep.boss){
            
            return name+" начальник отдела "+dep.name+".";
            
        }else{
            return name+" работает в отделе "+dep.name+", начальник которого "+dep.boss+".";
        }
    
    }
}
