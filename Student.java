/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Student {
//設定Student類別裡的變數  (TEST TEST TEST)
    
private String name ;
private String ID ;
private String Class ;

//設定各個參數的Set/Get方法
public Student(String name ,String ID,String Class)
{
 this.name = name;
 this.ID = ID;
 this.Class = Class;
}  

public  void setName (String name)
{
    this.name = name;
}
public  String getName()
{
  return  name;
}
public  void setID (String ID)
{
    this.ID = ID;
}
public  String getID()
{
  return  ID;
}
public  void setclass (String Class)
{
    this.Class = Class;
}
public  String getclass()
{
  return  Class;
}
}
