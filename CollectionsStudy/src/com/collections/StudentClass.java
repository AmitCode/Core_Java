package com.collections;

import com.collections.map.mapImplementation.HashMapMapImpl.IdCanNotBeSame;

import java.util.Objects;

public class StudentClass {
    int id;
    String name;
    String address;
    public StudentClass(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }
    public StudentClass(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return  "Student Info:- " + "id=" + id + ", name=" + name + ", address=" + address + '}';
    }
//    @Override
//    public boolean equals(Object obj) {
//        if(obj == this){
//            return true;
//        }else if(obj == null){
//            return false;
//        }else if(this.getClass() != obj.getClass()){
//            return false;
//        }
//        StudentClass student = (StudentClass) obj;
//        return (this.name.equals(student.name) && this.id == student.id);
//    }
//
//    @Override
//    public int hashCode(){
//        return Objects.hash(id, name);
//    }
}
