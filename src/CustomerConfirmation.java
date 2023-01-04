public class CustomerConfirmation {
        private String custName;
        private String custConfirmation;

        public CustomerConfirmation(String custName, String custConfirmation){
            this.custName = custName;
            this.custConfirmation = custConfirmation;
        }
        public void setCustName(String custName){ this.custName = custName;}
        public void setCustConfirmation(String custConfirmation){this.custConfirmation = custConfirmation;}
        public String getCustName(){return custName;}
        public String getCustConfirmation(){return custConfirmation;}

        public String toString() {
            return "Customer Name: " + custName +
                    "Customer Confirmation " + custConfirmation;
        }
}
