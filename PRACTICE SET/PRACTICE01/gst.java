package PRACTICE01;

public class gst {
    public static float gstTax(float Price) {
     float gst = Price*18/100; 
     float totalBill = Price+gst;
    return totalBill;
    }
    public static void totalsum(float a, float b, float c) {
    float Price = a+b+c;
      float billWithGst = gstTax(Price);
      System.out.println("Total price :"+ Price);
      System.out.println("Bill with 18% GST :"+ billWithGst);
    }
    public static void main(String[] args) {
    totalsum(600, 100, 300);
    }
}
