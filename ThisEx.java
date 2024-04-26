class ThisEx {
    String brand;
    double cap;
    String material;
    
    ThisEx(String brand1, String material1, double cap1){
        this.brand=brand1;
        this.cap=cap1;
        this.material=material1;
    }
    void Display()
    {
        System.out.println(brand);
        System.out.println(cap);
        System.out.println(material);
    }
}
    
    class BottleDriver{
        public static void main(String[] args) {
            ThisEx a=new ThisEx("milton","metal",1);
            a.Display();
        }
    }

