class cpu {
    double price;
    cpu(double price){
        this.price=price;
    }
    void display(){
        System.out.println(price);
    }
    class processor{
            int cores;
            String manufacturer;
            processor(int cores,String manufacturer){
                this.cores=cores;
                this.manufacturer=manufacturer;
            }
            void display(){
                System.out.println(cores+manufacturer);
            }
    }
    static class Ram{
        int memory;
        String manufacturer;
        Ram(int memory,String manufacturer){
            this.memory=memory;
            this.manufacturer=manufacturer;

        }
        void display(){
            System.out.println(memory+manufacturer);
        }
    }
    public static void main(String args[]){
        Ram ram=new Ram(64,"yamuna");
        cpu c=new cpu(23.4);
        c.display();
        cpu.processor p=c.new processor(54,"dakini"); 
        ram.display();
        p.display();
        
    }
}
