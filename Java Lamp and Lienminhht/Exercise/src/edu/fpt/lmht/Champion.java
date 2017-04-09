package edu.fpt.lmht;

/**
 * Created by Monkey.TNT on 10/19/2016.
 */
public class Champion {

    public String name;
    public int hp;
    public int dame;
    public void Q(Champion enemy){
        enemy.hp-=this.dame;
        System.out.println(this.name+" skill Q to "+enemy.name+" Dame :"+this.dame+" HP :"+enemy.hp);
        if(enemy.hp<=0){
            System.out.println(enemy.name+" da bi tieu diet boi "+ this.name);
        }
    }
}
