// Define the outer class CPU
class CPU {
    double price; // Attribute to store the price of the CPU

    // Constructor to initialize the price
    CPU(double price) {
        this.price = price;
    }

    // Define the inner class Processor
    class Processor {
        int numberOfCores; // Attribute to store the number of cores in the processor
        String manufacturer; // Attribute to store the manufacturer of the processor

        // Constructor to initialize the Processor attributes
        Processor(int numberOfCores, String manufacturer) {
            this.numberOfCores = numberOfCores;
            this.manufacturer = manufacturer;
        }

        // Method to display the processor information
        void displayProcessorInfo() {
            System.out.println("Processor Info:");
            System.out.println("Number of Cores: " + numberOfCores);
            System.out.println("Manufacturer: " + manufacturer);
        }
    }

    // Define the static nested class RAM
    static class RAM {
        int memory; // Attribute to store the memory size of the RAM in GB
        String manufacturer; // Attribute to store the manufacturer of the RAM

        // Constructor to initialize the RAM attributes
        RAM(int memory, String manufacturer) {
            this.memory = memory;
            this.manufacturer = manufacturer;
        }

        // Method to display the RAM information
        void displayRAMInfo() {
            System.out.println("RAM Info:");
            System.out.println("Memory: " + memory + "GB");
            System.out.println("Manufacturer: " + manufacturer);
        }
    }

    // Method to display the CPU information
    void displayCPUInfo() {
        System.out.println("CPU Info:");
        System.out.println("Price: $" + price);
    }

    // Main method to demonstrate the usage of CPU, Processor, and RAM classes
    public static void main(String[] args) {
        // Create an object of CPU and initialize its price
        CPU cpu = new CPU(250.00);

        // Create an object of the inner class Processor
        // Note: Since Processor is a non-static inner class, it must be created using an instance of the outer class CPU
        CPU.Processor processor = cpu.new Processor(8, "Intel");

        // Create an object of the static nested class RAM
        // Note: Since RAM is a static nested class, it can be created without an instance of the outer class CPU
        CPU.RAM ram = new CPU.RAM(16, "Corsair");

        // Display the information of CPU, Processor, and RAM
        cpu.displayCPUInfo();
        processor.displayProcessorInfo();
        ram.displayRAMInfo();
    }
}
