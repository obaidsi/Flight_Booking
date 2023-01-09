public class CustomerConfirmation {
        private String custName;
        private String custConfirmation;

    public CustomerConfirmation(String custName, String custConfirmation){
            setCustName(custName);
            setCustConfirmation(custConfirmation);
        }
        public void setCustName(String custName){
            verifyStringNonEmptyNull(custName);
            this.custName = custName;}
        public void setCustConfirmation(String custConfirmation){
            validateConfirmation(custConfirmation);
            this.custConfirmation = custConfirmation;}
        public String getCustName(){return custName;}
        public String getCustConfirmation(){return custConfirmation;}

        public String toString() {
            return "Customer Name: " + custName +
                    "Customer Confirmation " + custConfirmation;
        }
        private static void validateConfirmation(String confirmationNum){
            if (confirmationNum.length() !=6) {
                throw new IllegalArgumentException("Confirmation Number must be 6 characters.");
            }
            verifyAlphanumeric(confirmationNum);
        }
        private static void verifyAlphanumeric(String code){
            if (code == null || code.isEmpty()){
                throw new IllegalArgumentException("Must be Alphanumeric");
            }
            if(!code.matches("^[a-zA-Z0-9]*$")){
                throw new IllegalArgumentException("Must be Alphanumric");
            }
        }
        private static void verifyStringNonEmptyNull(String string){
            if (string == null || string.isEmpty()){
                throw new IllegalArgumentException("String must not be Null or Empty.");
            }
        }
}
