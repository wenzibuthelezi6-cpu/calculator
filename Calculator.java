public class Calculator{

 double result;
 
 Calculator(){
 result = 0;
 }
 
 public void add(double value){
 result+=value;
 }
 
 public void subtract(double value){
 result-=value;
 }
 
 public void multiply(double value){
 result*=value;
 }
 
 public void divide(double value){
 if (value!=0){
 result/=value;
 }
 
 else{
 System.out.println("cannot divide");
 }
 
 }
 
 public double getResult(){
 return result;
 }
 
 public void clear(){
 result = 0;
 }


}