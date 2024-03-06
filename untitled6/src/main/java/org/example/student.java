package org.example;

import java.util.*;

public class student {

    Map<teacher,Integer> std;

    private  int []arrays;

    public student() {
    }



    public List<teacher> getList() {
        return list;
    }

    public void setList(List<teacher> list) {
        this.list = list;
    }

    private  Map<String,teacher> teacherMap;
    private List<org.example.teacher> list;

    public student(Map<org.example.teacher, Integer> std, int[] arrays, Map<String, org.example.teacher> teacherMap, List<org.example.teacher> list, org.example.teacher teacher, int number) {
        this.std = std;
        this.arrays = arrays;
        this.teacherMap = teacherMap;
        this.list = list;
        this.teacher = teacher;
        this.number = number;
    }

    @Override
    public String toString() {
        return "student{" +
                "arrays=" + Arrays.toString(arrays) +
                ", teacher=" + teacher +
                ", number=" + number +
                ", teacherMap=" + teacherMap +
                '}';
    }

    public int[] getArrays() {
        return arrays;
    }

    public void setArrays(int[] arrays) {
        this.arrays = arrays;
    }

    private  teacher teacher;
    private  int number;

    public org.example.teacher getTeacher() {
        return teacher;
    }

    public Map<org.example.teacher, Integer> getStd() {
        return std;
    }

    public void setStd(Map<org.example.teacher, Integer> std) {
        this.std = std;
    }

    public void setTeacher(org.example.teacher teacher) {
        this.teacher = teacher;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Map<String, org.example.teacher> getTeacherMap() {
        return teacherMap;
    }

    public void setTeacherMap(Map<String, org.example.teacher> teacherMap) {
        this.teacherMap = teacherMap;
    }
}
