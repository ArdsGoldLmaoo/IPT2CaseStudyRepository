/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.CaseStudy;
import javax.jws.*;
/**
 *
 * @author TSM3A Group
 */
@WebService
public class JavaCode {
     @WebMethod
    public double mean(double s,double n){
    double answer=s/n;
    return answer;}
    @WebMethod
    public double pythagorean(double a,double b){
    double stepa=(a*a)+(b*b);
    double stepb=Math.sqrt(stepa);
    return stepb;}
     
     @WebMethod
    public double circumference(double r){
    double answer=2*3.1415*r;
    return answer;}
    @WebMethod
    public double areacircle(double r){
    double answer=3.1415*(r*r);
    return answer;}
    
     @WebMethod
     public double triangle(double h, double b){
     double answer=(h*b)/2;
     return answer;}
     @WebMethod
     public double rectangle(double h, double w){
     double answer=h*w;
     return answer;}
}
