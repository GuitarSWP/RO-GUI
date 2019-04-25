/**
 * Monster
 */
public class Monster {
    protected int hp,atk,maxHp,exp,Damage;
    protected String picName,name;
    public Monster(){
        maxHp = 80;
        hp = 80;
        atk = 10;
        exp = 30;
        Damage = 20;
        name = "Poring";
        picName = "poring.gif";
    }
    public String getName(){
        return name;
    }
    public int getHp(){
        return hp;
    }
    public int getAtk(){
        return atk;
    }
    public int maxHp(){
        return maxHp;
    }
    public String getPic(){
        return picName;
    }
    public void takingDamage(int nDamage){
        hp = hp-nDamage;
    }
    public int getExp(){
        return exp;
    }
    public int getDamage(){
        return Damage;
    }
}