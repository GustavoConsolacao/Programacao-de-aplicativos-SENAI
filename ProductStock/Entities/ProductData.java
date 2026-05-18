package ProductStock.Entities;

    public class ProductData {
        public String Name;
        public Double Price;
        public Integer Quantity;
        public double TotalValueinStock() {
            return Price * Quantity;
        }
        public double AddProducts(int Quantity){
            return this.Quantity += Quantity;
        }
        public double RemoveProducts(int Quantity) {
            return this.Quantity -= Quantity;
        }


    }


