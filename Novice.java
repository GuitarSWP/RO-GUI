/**
 * Novice
 */
public class Novice {
    protected int hp,exp,atk,level,maxHp,maxExp,maxLevel,ckill;
    protected String name,sex,picName;
    public Novice(String name){
        maxHp = 150;
        level =1;
        atk = 20;
        maxLevel = 10;
        maxExp = 50;
        exp =0;
        ckill = 0;
        this.name = name; 
        sex = "";
        picName = "";
    }
    public void getkillup(){
        ckill += 1;
    }
    public int getkill(){
        return ckill;
    }
    public void setHp(){
        hp = 150;
    }
    public int getHp(){
        return hp;
    } 
    public int getExp(){
        return exp;
    }
    public int getLevel(){
        return level;
    }
    public int getAtk(){
        return atk;
    }
    public int getMaxHp(){
        return maxHp;
    }
    public int getMaxExp(){
        return maxExp;
    }
    public int getMaxLevel(){
        return maxLevel;
    }
    public String getName(){
        return name;
    }
    public String getPic(){
        return picName;
    }
    public String getSex(){
        return sex;
    }
    public void takingDamage(int mDamage){
        hp = hp-mDamage;

    }
    public void getExpUp(int mExp){
        exp = exp+mExp;
    }
    public void setExp(){
        exp=0;
    }
    public void LevelUp(){
        level=level+1;
    }

}